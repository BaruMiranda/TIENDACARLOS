package com.projects.comercialcarlos.usuarios;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentAlmacenBinding;
import com.projects.comercialcarlos.databinding.FragmentReportesBinding;

import org.eazegraph.lib.models.PieModel;

public class ReportesFragment extends Fragment {

    private FragmentReportesBinding binding;

    public static ReportesFragment newInstance() {
        return new ReportesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentReportesBinding.inflate(inflater, container, false);
        regionSetup();
        ((MainActivity) getActivity()).iniViewToolBarMenu("Reportes -  Tienda Carlos");
        return binding.getRoot();
    }

    private void regionSetup() {

        binding.piechart.addPieSlice(new PieModel("REPORTE ALUMNOS",12, Color.parseColor("#FFA726")));
        binding.piechart.addPieSlice(new PieModel("REPORTE ALUMNOS",88,Color.parseColor("#66BB6A")));
        binding.piechart.setContentDescription("Reporte Ventas");
        binding.ventas.setVisibility(View.VISIBLE);
        binding.clientes.setVisibility(View.VISIBLE);

        binding.piechart2.addPieSlice(new PieModel("REPORTE DOCENTES",45,Color.parseColor("#66BB6A")));
        binding.piechart2.addPieSlice(new PieModel("REPORTE DOCENTES",65,Color.parseColor("#FFA726")));
        binding.piechart3.addPieSlice(new PieModel("REPORTE AULAS",75,Color.parseColor("#66BB6A")));
        binding.piechart3.addPieSlice(new PieModel("REPORTE AULAS",25,Color.parseColor("#EF5350")));
        binding.piechart4.addPieSlice(new PieModel("REPORTE GRADOS",6,Color.parseColor("#29B6F6")));
        binding.piechart4.addPieSlice(new PieModel("REPORTE GRADOS",5,Color.parseColor("#EF5350")));

        binding.primerDato.setText("Ventas");
        binding.segundoDato.setText("Almacen");
        binding.tercerDato.setText("Clientes");
        binding.cuartoDato.setText("Empleados");
        binding.cuartoDato2.setText("Provedores");

        binding.piechart.startAnimation();
        binding.piechart.setClickable(false);
        binding.piechart4.startAnimation();
        binding.piechart4.setClickable(false);
        binding.piechart2.startAnimation();
        binding.piechart2.setClickable(false);
        binding.piechart3.startAnimation();
        binding.piechart3.setClickable(false);
    }
}