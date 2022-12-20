package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentAlmacenBinding;
import com.projects.comercialcarlos.databinding.FragmentClientesBinding;

public class AlmacenFragment extends Fragment {

    private FragmentAlmacenBinding binding;

    public static AlmacenFragment newInstance() {
        return new AlmacenFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAlmacenBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniView("Almacen -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {
    }
}