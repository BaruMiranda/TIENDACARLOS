package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentEmpresaTCBinding;
import com.projects.comercialcarlos.databinding.FragmentProveedoresBinding;


public class EmpresaTCFragment extends Fragment {

    private FragmentEmpresaTCBinding binding;

    public static EmpresaTCFragment newInstance() {
        return new EmpresaTCFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEmpresaTCBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniView("Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {
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
}