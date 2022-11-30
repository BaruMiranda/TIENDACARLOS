package com.projects.comercialcarlos.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.activity.MainActivity;
import com.projects.comercialcarlos.databinding.FragmentMenuBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;
    private TextView textSubtitle;
    private Toolbar toolbar;
    private ImageView imageSunat;
    private TextView textTitle;

    public static MenuFragment newInstance(Bundle bundle) {
        MenuFragment fragment = new MenuFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MainActivity) getActivity()).getToolbar().toolbarMenu.setTitle("Bienvenido");
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        toolbar = getActivity().findViewById(R.id.toolbarMenu);
        //inicializar vistas
        imageSunat = toolbar.findViewById(R.id.img_sunat);
        //ivLeft = toolbar.findViewById(R.id.menu_left);
        textTitle = toolbar.findViewById(R.id.textTitle);
        textSubtitle = toolbar.findViewById(R.id.textSubtitle);
        textSubtitle.setVisibility(View.VISIBLE);
        textSubtitle.setText("BIENVENIDO");
        textSubtitle.setTextColor(Color.parseColor("#004BA0"));
        //setear resourse en el view, por si lo quieres cambiar
        imageSunat.setImageResource(R.drawable.ic_user_icon);
        ((MainActivity) getActivity()).getToolbar().toolbarMenu.setBackgroundColor(Color.WHITE);
        //ocultar , porque no lo usare
        imageSunat.setVisibility(View.VISIBLE);

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(inflater, container, false);
        setHasOptionsMenu(true);
        regionSetup();
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        textSubtitle = toolbar.findViewById(R.id.textSubtitle);
        ((MainActivity) getActivity()).getToolbar().toolbarMenu.setBackgroundColor(Color.parseColor("#004BA0"));
        ((MainActivity) getActivity()).getToolbar().toolbarMenu.setTitleTextColor(Color.parseColor("#FAFAFA"));
        textSubtitle.setVisibility(View.GONE);
        super.onDestroyView();
    }

    private void regionSetup() {
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}