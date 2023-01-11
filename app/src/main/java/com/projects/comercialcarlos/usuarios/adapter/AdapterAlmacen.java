package com.projects.comercialcarlos.usuarios.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.model.Productos;

import java.util.ArrayList;
import java.util.List;

public class AdapterAlmacen extends RecyclerView.Adapter<AdapterAlmacen.CPPViewHolder> {

    private List<Productos> listaDatos;

    final AdapterAlmacen.OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(Productos producto);
    }

    public AdapterAlmacen(List<Productos> listaDatos,AdapterAlmacen.OnItemClickListener mOnItemClickListener) {
        this.listaDatos = listaDatos;
        this.mOnItemClickListener = mOnItemClickListener;
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
        public ImageView tv_star;

        public CPPViewHolder(@NonNull View itemView) {
            super(itemView);
            cod01 = itemView.findViewById(R.id.numero);
            cod02 = itemView.findViewById(R.id.producto);
            cod03 = itemView.findViewById(R.id.precio);
            tv_star = itemView.findViewById(R.id.id_star_control);

        }

        @SuppressLint("SetTextI18n")
        public void asignarDatos(Productos datos) {

            cod01.setText(datos.getNombre_producto());
            cod02.setText("Precio: " +  datos.getPrecio_venta());
            cod03.setText(datos.getIdproducto());
            tv_star.setOnClickListener(view -> mOnItemClickListener.onItemClick(datos));
        }
    }
}
