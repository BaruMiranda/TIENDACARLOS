package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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
        binding.productos.setAdapter(adapter);
        ((MainActivity) getActivity()).iniView("Almacen -  Tienda Carlos");
        return binding.getRoot();
    }

    @Override
    public void onResponse(Call<ArrayList<Productos>> call, Response<ArrayList<Productos>> response) {
        if(response.isSuccessful()){
           ArrayList<Productos> pro =  response.body();
            adapter.setItems(pro);
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Productos>> call, Throwable t) {

    }


}