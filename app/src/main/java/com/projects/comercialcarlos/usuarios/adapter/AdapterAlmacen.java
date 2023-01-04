package com.projects.comercialcarlos.usuarios.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.model.Productos;

import java.util.ArrayList;
import java.util.List;

public class AdapterAlmacen extends RecyclerView.Adapter<AdapterAlmacen.CPPViewHolder> {

    private List<Productos> listaDatos;

    public AdapterAlmacen(List<Productos> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public AdapterAlmacen.CPPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carta_porte, parent, false);
        return new AdapterAlmacen.CPPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAlmacen.CPPViewHolder cppViewHolder, int i) {
        cppViewHolder.asignarDatos(listaDatos.get(i));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public void setItems(List<Productos> list) {
        this.listaDatos = list;
        notifyDataSetChanged();
    }

    public class CPPViewHolder extends RecyclerView.ViewHolder {

        TextView cod01;
        TextView cod02;
        TextView cod03;

        public CPPViewHolder(@NonNull View itemView) {
            super(itemView);
            cod01 = itemView.findViewById(R.id.txtNumeroCartaPorte);
            cod02 = itemView.findViewById(R.id.txtDestino);
            cod03 = itemView.findViewById(R.id.idProduct);
        }

        @SuppressLint("SetTextI18n")
        public void asignarDatos(Productos datos) {

            cod01.setText(datos.getNombre_producto());
            cod02.setText("Precio: " +  datos.getPrecio_venta());
            cod03.setText(datos.getIdproducto());
        }
    }
}
