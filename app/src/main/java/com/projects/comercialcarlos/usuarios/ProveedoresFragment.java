package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentEmpleadoBinding;
import com.projects.comercialcarlos.databinding.FragmentProveedoresBinding;

public class ProveedoresFragment extends Fragment {

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
    }
}