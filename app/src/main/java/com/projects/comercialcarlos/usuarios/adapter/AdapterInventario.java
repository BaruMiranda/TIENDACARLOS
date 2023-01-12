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
import com.projects.comercialcarlos.Retrofit.model.Inventarios;
import com.projects.comercialcarlos.Retrofit.model.Productos;

import java.util.List;

public class AdapterInventario extends RecyclerView.Adapter<AdapterInventario.CPPViewHolder> {

    private List<Inventarios> listaDatos;

    public AdapterInventario(List<Inventarios> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public AdapterInventario.CPPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inventario, parent, false);
        return new AdapterInventario.CPPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterInventario.CPPViewHolder cppViewHolder, int i) {
        cppViewHolder.asignarDatos(listaDatos.get(i));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public void setItems(List<Inventarios> list) {
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
        public void asignarDatos(Inventarios datos) {

            cod02.setText("Fecha Inventario: " + datos.getMes_inventario());
            cod03.setText("Saldo Inicial: " + datos.getSaldo_inicial());
            cod04.setText("Saldo Final: " + datos.getSaldo_final());
            cod05.setText("Entrada: " + datos.getEntradas());
            cod06.setText("Salida: " + datos.getSalidas());
        }
    }
}
