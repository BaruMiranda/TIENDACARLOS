package com.projects.comercialcarlos.usuarios;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.MyApiAdapter;
import com.projects.comercialcarlos.Retrofit.model.Productos;
import com.projects.comercialcarlos.Retrofit.model.Proveedores;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentEmpleadoBinding;
import com.projects.comercialcarlos.databinding.FragmentProveedoresBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProveedoresFragment extends Fragment implements Callback<ArrayList<Proveedores>> {

    private FragmentProveedoresBinding binding;

    public static ProveedoresFragment newInstance() {
        return new ProveedoresFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProveedoresBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Proveedores -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {
        Call<ArrayList<Proveedores>> call = MyApiAdapter.getApiProveedoresService().getProveedores();
        call.enqueue(this);
        binding.rvProveedores.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onResponse(Call<ArrayList<Proveedores>> call, Response<ArrayList<Proveedores>> response) {
        if (response.isSuccessful()) {
            ArrayList<Proveedores> proveedores = new ArrayList<>();
            response.body().forEach(x -> {
                String idproveedor=x.getIdproveedor();
                String codigo_proveedor=x.getCodigo_proveedor();
                String nombre_proveedor=x.getNombre_proveedor();
                String numero_telefono=x.getNumero_telefono();
                String numero_nit=x.getNumero_nit();
                String nombre_contacto=x.getNombre_contacto();
                String telefono_contacto=x.getTelefono_contacto();
                String estado=x.getEstado();
                Proveedores proveedor = new Proveedores(idproveedor,
                codigo_proveedor,
                nombre_proveedor,
                numero_telefono,
                numero_nit,
                nombre_contacto,
                telefono_contacto,
                estado);
                proveedores.add(proveedor);
            });
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Proveedores>> call, Throwable t) {

    }
}