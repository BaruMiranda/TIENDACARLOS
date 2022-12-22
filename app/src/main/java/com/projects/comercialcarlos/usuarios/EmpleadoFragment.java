package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentEmpleadoBinding;


public class EmpleadoFragment extends Fragment {

    private FragmentEmpleadoBinding binding;

    public static EmpleadoFragment newInstance() {
        return new EmpleadoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEmpleadoBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniView("Empleados -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {


    }

}