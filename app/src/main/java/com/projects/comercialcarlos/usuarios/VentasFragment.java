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
import com.projects.comercialcarlos.databinding.FragmentVentasBinding;

public class VentasFragment extends Fragment {

    private FragmentVentasBinding binding;

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
    }
}