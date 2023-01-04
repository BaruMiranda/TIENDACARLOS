package com.projects.comercialcarlos.usuarios;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.projects.comercialcarlos.Retrofit.MyApiAdapter;
import com.projects.comercialcarlos.Retrofit.model.Productos;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentAlmacenBinding;
import com.projects.comercialcarlos.usuarios.adapter.AdapterAlmacen;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlmacenFragment extends Fragment implements Callback<ArrayList<Productos>> {

    private FragmentAlmacenBinding binding;
    AdapterAlmacen adapter;

    public static AlmacenFragment newInstance() {
        return new AlmacenFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAlmacenBinding.inflate(inflater, container, false);
        Call<ArrayList<Productos>> call = MyApiAdapter.getApiService().getProductos();
        call.enqueue(this);
        binding.productos.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        ((MainActivity) getActivity()).iniView("Almacen -  Tienda Carlos");
        return binding.getRoot();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onResponse(Call<ArrayList<Productos>> call, Response<ArrayList<Productos>> response) {
        if (response.isSuccessful()) {
            ArrayList<Productos> productos = new ArrayList<>();
            response.body().forEach(x -> {
                String idproducto = x.getIdproducto();
                String codigo_interno = x.getCodigo_interno();
                String codigo_barra = x.getCodigo_barra();
                String nombre_producto = x.getNombre_producto();
                String precio_compra = x.getPrecio_compra();
                String precio_venta = x.getPrecio_venta();
                String precio_venta_mayoreo = x.getPrecio_venta_mayoreo();
                String stock = x.getStock();
                String stock_min = x.getStock_min();
                String idcategoria = x.getIdcategoria();
                String idmarca = x.getIdmarca();
                String idpresentacion = x.getIdpresentacion();
                String estado = x.getEstado();
                String exento = x.getExento();
                String inventariable = x.getInventariable();
                String perecedero = x.getPerecedero();
                Productos prodcuto = new Productos(idproducto, codigo_interno, codigo_barra, nombre_producto, precio_compra, precio_venta, precio_venta_mayoreo, stock, stock_min, idcategoria, idmarca,idpresentacion,estado,exento,inventariable,perecedero);
                productos.add(prodcuto);
            });
            adapter = new AdapterAlmacen(productos);
            binding.productos.setAdapter(adapter);
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Productos>> call, Throwable t) {

    }


}