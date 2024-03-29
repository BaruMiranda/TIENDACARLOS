package com.projects.comercialcarlos.usuarios;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.MyApiAdapter;
import com.projects.comercialcarlos.Retrofit.model.Inventarios;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentEmpresaTCBinding;
import com.projects.comercialcarlos.databinding.FragmentProveedoresBinding;
import com.projects.comercialcarlos.util.Constantes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class EmpresaTCFragment extends Fragment implements Callback<ArrayList<Inventarios>> {

    private FragmentEmpresaTCBinding binding;

    public static EmpresaTCFragment newInstance() {
        return new EmpresaTCFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEmpresaTCBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {

        Call<ArrayList<Inventarios>> call = MyApiAdapter.getApiInventariosService().getInventarios();
        call.enqueue(this);

        binding.codDatosGenerales.setOnClickListener(view -> {
            binding.lldatosgenerales.setVisibility(View.VISIBLE);

            binding.lldatosEmpresa.setVisibility(View.GONE);
            binding.lldatosConductor.setVisibility(View.GONE);
        });
        binding.codEmpresaTrasporte.setOnClickListener(view -> {
            binding.lldatosEmpresa.setVisibility(View.VISIBLE);

            binding.lldatosgenerales.setVisibility(View.GONE);
            binding.lldatosConductor.setVisibility(View.GONE);
        });
        binding.codDatosConductor.setOnClickListener(view -> {
            binding.lldatosConductor.setVisibility(View.VISIBLE);

            binding.lldatosgenerales.setVisibility(View.GONE);
            binding.lldatosEmpresa.setVisibility(View.GONE);
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onResponse(Call<ArrayList<Inventarios>> call, Response<ArrayList<Inventarios>> response) {
        if (response.isSuccessful()) {
            ArrayList<Inventarios> inventarios = new ArrayList<>();
            response.body().forEach(x -> {
                String mes_inventario = x.getMes_inventario();
                String fecha_apertura = x.getFecha_apertura();
                String fecha_cierre = x.getFecha_cierre();
                String saldo_inicial = x.getSaldo_inicial();
                String entradas = x.getEntradas();
                String salidas = x.getSalidas();
                String saldo_final = x.getSaldo_final();
                String estado = x.getEstado();
                String idproducto = x.getIdproducto();
                Inventarios inventarios1 = new Inventarios(mes_inventario,
                        fecha_apertura,
                        fecha_cierre,
                        saldo_inicial,
                        entradas,
                        salidas,
                        saldo_final,
                        estado,
                        idproducto);
                inventarios.add(inventarios1);
            });
            Constantes.lstInventarios = inventarios;
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Inventarios>> call, Throwable t) {

    }
}