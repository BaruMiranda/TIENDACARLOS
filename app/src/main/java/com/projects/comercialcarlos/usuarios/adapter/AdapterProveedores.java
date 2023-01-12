package com.projects.comercialcarlos.usuarios.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.model.Proveedores;

import java.util.List;

public class AdapterProveedores extends RecyclerView.Adapter<AdapterProveedores.CPPViewHolder> {

    private List<Proveedores> listaDatos;

    public AdapterProveedores(List<Proveedores> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public AdapterProveedores.CPPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_proveedores, parent, false);
        return new AdapterProveedores.CPPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProveedores.CPPViewHolder cppViewHolder, int i) {
        cppViewHolder.asignarDatos(listaDatos.get(i));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public void setItems(List<Proveedores> list) {
        this.listaDatos = list;
        notifyDataSetChanged();
    }

    public class CPPViewHolder extends RecyclerView.ViewHolder {

        TextView cod01;
        TextView cod02;
        TextView cod03;
        TextView cod04;
        TextView cod05;
        TextView cod06;
        TextView cod07;

        public CPPViewHolder(@NonNull View itemView) {
            super(itemView);

            cod02 = itemView.findViewById(R.id.fechaInventario);
            cod03 = itemView.findViewById(R.id.saldoInicial);
            cod04 = itemView.findViewById(R.id.saldofinal);
            cod05 = itemView.findViewById(R.id.entradas);
            cod06 = itemView.findViewById(R.id.salidas);

        }

        @SuppressLint("SetTextI18n")
        public void asignarDatos(Proveedores datos) {

            cod02.setText("Proveedor: " + datos.getNombre_proveedor());
            cod03.setText("Codigo: " + datos.getCodigo_proveedor());
            cod04.setText("Contacto: " + datos.getNombre_contacto());
            cod05.setText(" Telefono: " + datos.getNumero_telefono());
        }
    }
}
