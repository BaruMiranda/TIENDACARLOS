package com.projects.comercialcarlos.usuarios.adapter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.comercialcarlos.R;
import com.projects.comercialcarlos.Retrofit.model.Ventas;
import com.projects.comercialcarlos.util.Constantes;

import java.util.List;
import java.util.stream.Collectors;

public class AdapterVentas extends RecyclerView.Adapter<AdapterVentas.CPPViewHolder> {

    private List<Ventas> listaDatos;

    public AdapterVentas(List<Ventas> listaDatos) {
        this.listaDatos = listaDatos;
    }


    @NonNull
    @Override
    public AdapterVentas.CPPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ventas, parent, false);
        return new AdapterVentas.CPPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVentas.CPPViewHolder cppViewHolder, int i) {
        cppViewHolder.asignarDatos(listaDatos.get(i));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void sortedFilterPlaca(String query) {
        if ("".equals(query)){
            this.listaDatos =  Constantes.getLstPciCarga;
            notifyDataSetChanged();
        } else {
            this.listaDatos = Constantes.getpciList;
            this.listaDatos = Constantes.getLstPciCarga.stream().filter(x-> (x.getFecha_venta()).toUpperCase().contains(query.toUpperCase())).collect(Collectors.toList());
            notifyDataSetChanged();
        }
    }

    public void setItems(List<Ventas> list) {
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
        TextView cod010;
        TextView cod011;

        public CPPViewHolder(@NonNull View itemView) {
            super(itemView);

            cod07 = itemView.findViewById(R.id.entradas2);
            cod010 = itemView.findViewById(R.id.entradas3);
            cod011 = itemView.findViewById(R.id.salidas3);
            cod02 = itemView.findViewById(R.id.salidas2);
            cod01 = itemView.findViewById(R.id.fechaInventario);
            cod03 = itemView.findViewById(R.id.saldoInicial);
            cod04 = itemView.findViewById(R.id.saldofinal);
            cod05 = itemView.findViewById(R.id.entradas);
            cod06 = itemView.findViewById(R.id.salidas);

        }

        @SuppressLint("SetTextI18n")
        public void asignarDatos(Ventas datos) {
            cod01.setText("Fecha venta "+datos.getFecha_venta());
            cod03.setText("Numero Comprobante: "+datos.getNumero_comprobante());
            cod04.setText("Numero de venta : "+datos.getNumero_venta());
            cod05.setText("Descuento: "+datos.getDescuento());
            cod06.setText("Pago Efectivo: "+datos.getPago_efectivo());
            cod07.setText("Pago Tarjeta: "+datos.getPago_tarjeta());
            cod02.setText("Pago total: "+datos.getTotal()+"-"+datos.getSonletras());
            if("1" ==datos.getEstado()){
                cod010.setText("Estado de la venta: REALIZADO");
            }
            cod011.setText("Codigo Usuario: "+datos.getIdusuario());
        }
    }
}
