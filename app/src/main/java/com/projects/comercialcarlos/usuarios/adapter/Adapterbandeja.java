package com.projects.comercialcarlos.usuarios.adapter;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.usuarios.modul.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Adapterbandeja extends RecyclerView.Adapter<Adapterbandeja.ADDPMNViewHolder> {

    public List<Producto> listaDatos = new ArrayList<>();
    final Adapterbandeja.OnItemClickListener mOnItemClickListener;

    public Adapterbandeja(List<Producto> listaDatos, Adapterbandeja.OnItemClickListener mOnItemClickListener) {
        this.listaDatos = listaDatos;
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(Producto listaPcisPorPlaca);
    }


    @NonNull
    @Override
    public ADDPMNViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bandeja, parent, false);
        return new ADDPMNViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ADDPMNViewHolder addpmnViewHolder, int i) {
        addpmnViewHolder.asignarDatos(listaDatos.get(i), i);
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public void setItems(List<Producto> list) {
        this.listaDatos = list;
        notifyDataSetChanged();
    }

    public class ADDPMNViewHolder extends RecyclerView.ViewHolder {

        TextView txtNumeroCCMN;
        TextView tv_placa;
        TextView tv_fecHor_registro;
        FloatingActionButton tvCount;
        ImageView btnSeleccionar,btnSelecUp;
        View v_barra;
        ImageView iv_flecha;

        public ADDPMNViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCount = itemView.findViewById(R.id.tv_count);
            v_barra = itemView.findViewById(R.id.v_barra);
            iv_flecha = itemView.findViewById(R.id.iv_flecha);
            txtNumeroCCMN = itemView.findViewById(R.id.tv_NumerodeCCMN);
            tv_placa = itemView.findViewById(R.id.tv_placa);
            tv_fecHor_registro = itemView.findViewById(R.id.tv_fecHor_registro);
            btnSeleccionar = itemView.findViewById(R.id.id_star);
            btnSelecUp = itemView.findViewById(R.id.id_star_up);

        }

        @SuppressLint("SetTextI18n")
        public void asignarDatos(Producto datos, Integer i) {
            if (i == 0) {

                iv_flecha.setVisibility(View.GONE);
            }
            if (i != 0) {
                if (i == listaDatos.size() - 1) {
                    v_barra.setVisibility(View.GONE);
                }
            }

        }
    }
}
