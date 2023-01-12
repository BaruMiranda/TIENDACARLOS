package com.projects.comercialcarlos.usuarios;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentReporteVentasBinding;
import com.projects.comercialcarlos.databinding.FragmentReportesBinding;


public class ReporteVentasFragment extends Fragment {

    private FragmentReporteVentasBinding binding;

    public static ReportesFragment newInstance() {
        return new ReportesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentReporteVentasBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Reportes -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {
    }
}