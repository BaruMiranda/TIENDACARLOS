package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentBandejaBinding;

public class BandejaFragment extends Fragment {
    private FragmentBandejaBinding binding;

    public static BandejaFragment newInstance() {
        return new BandejaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBandejaBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Bandeja");
        return binding.getRoot();
    }

    private void regionSetup() {
        binding.cardViewVentas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verVentasFragment();
            }
        });
        binding.cardViewClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verClientesFragment();
            }
        });
        binding.cardviewProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verAlmacenFragment();
            }
        });
        binding.cardViewEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verEmpleadoFragment();
            }
        });
        binding.cardViewProveedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verProveedoresFragment();
            }
        });
        binding.cardViewEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).verEmpresaTCFragment();
            }
        });
    }
}