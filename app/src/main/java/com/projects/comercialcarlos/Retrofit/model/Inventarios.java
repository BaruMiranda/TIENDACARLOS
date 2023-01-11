package com.projects.comercialcarlos.Retrofit.model;


public class Inventarios {

     String mes_inventario;
     String fecha_apertura;
     String fecha_cierre;
     String saldo_inicial;
     String entradas;
     String salidas;
     String saldo_final;
     String estado;
     String idproducto;

     public Inventarios() {
     }

     public Inventarios(String mes_inventario, String fecha_apertura, String fecha_cierre, String saldo_inicial, String entradas, String salidas, String saldo_final, String estado, String idproducto) {
          this.mes_inventario = mes_inventario;
          this.fecha_apertura = fecha_apertura;
          this.fecha_cierre = fecha_cierre;
          this.saldo_inicial = saldo_inicial;
          this.entradas = entradas;
          this.salidas = salidas;
          this.saldo_final = saldo_final;
          this.estado = estado;
          this.idproducto = idproducto;
     }

     public String getMes_inventario() {
          return mes_inventario;
     }

     public void setMes_inventario(String mes_inventario) {
          this.mes_inventario = mes_inventario;
     }

     public String getFecha_apertura() {
          return fecha_apertura;
     }

     public void setFecha_apertura(String fecha_apertura) {
          this.fecha_apertura = fecha_apertura;
     }

     public String getFecha_cierre() {
          return fecha_cierre;
     }

     public void setFecha_cierre(String fecha_cierre) {
          this.fecha_cierre = fecha_cierre;
     }

     public String getSaldo_inicial() {
          return saldo_inicial;
     }

     public void setSaldo_inicial(String saldo_inicial) {
          this.saldo_inicial = saldo_inicial;
     }

     public String getEntradas() {
          return entradas;
     }

     public void setEntradas(String entradas) {
          this.entradas = entradas;
     }

     public String getSalidas() {
          return salidas;
     }

     public void setSalidas(String salidas) {
          this.salidas = salidas;
     }

     public String getSaldo_final() {
          return saldo_final;
     }

     public void setSaldo_final(String saldo_final) {
          this.saldo_final = saldo_final;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }

     public String getIdproducto() {
          return idproducto;
     }

     public void setIdproducto(String idproducto) {
          this.idproducto = idproducto;
     }
}