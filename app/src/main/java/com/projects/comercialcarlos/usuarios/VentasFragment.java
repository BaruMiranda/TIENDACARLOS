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
import com.projects.comercialcarlos.Retrofit.model.Inventarios;
import com.projects.comercialcarlos.Retrofit.model.Ventas;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentBandejaBinding;
import com.projects.comercialcarlos.databinding.FragmentVentasBinding;
import com.projects.comercialcarlos.usuarios.adapter.AdapterProveedores;
import com.projects.comercialcarlos.usuarios.adapter.AdapterVentas;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VentasFragment extends Fragment implements Callback<ArrayList<Ventas>> {

    private FragmentVentasBinding binding;
    AdapterVentas adapter;
    public static VentasFragment newInstance() {
        return new VentasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentVentasBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Ventas -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {
        Call<ArrayList<Ventas>> call = MyApiAdapter.getApiClientesService().getVentas();
        call.enqueue(this);
        binding.ventass.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onResponse(Call<ArrayList<Ventas>> call, Response<ArrayList<Ventas>> response) {
        ArrayList<Ventas> inventarios = new ArrayList<>();
        response.body().forEach(x -> {
            String idventa = x.getIdventa();
            String numero_venta = x.getNumero_venta();
            String fecha_venta = x.getFecha_venta();
            String tipo_pago = x.getTipo_pago();
            String numero_comprobante = x.getNumero_comprobante();
            String tipo_comprobante = x.getTipo_comprobante();
            String sumas = x.getSumas();
            String iva = x.getIva();
            String exento = x.getExento();
            String retenido = x.getRetenido();
            String descuento = x.getDescuento();
            String total = x.getTotal();
            String sonletras = x.getSonletras();
            String pago_efectivo = x.getPago_efectivo();
            String pago_tarjeta = x.getPago_tarjeta();
            String numero_tarjeta = x.getNumero_tarjeta();
            String tarjeta_habiente = x.getTarjeta_habiente();
            String cambio = x.getCambio();
            String estado = x.getEstado();
            String idcliente =  x.getIdcliente();
            String idusuario = x.getIdusuario();
            Ventas inventarios1 = new Ventas(idventa,
                    numero_venta,
                    fecha_venta,
                    tipo_pago,
                    numero_comprobante,
                    tipo_comprobante,
                    sumas,
                    iva,
                    exento,
                    retenido,
                    descuento,
                    total,
                    sonletras,
                    pago_efectivo,
                    pago_tarjeta,
                    numero_tarjeta,
                    tarjeta_habiente,
                    cambio,
                    estado,
                    idcliente,
                    idusuario);
            inventarios.add(inventarios1);
        });
        adapter = new AdapterVentas(inventarios);
        binding.ventass.setAdapter(adapter);
    }

    @Override
    public void onFailure(Call<ArrayList<Ventas>> call, Throwable t) {

    }
}