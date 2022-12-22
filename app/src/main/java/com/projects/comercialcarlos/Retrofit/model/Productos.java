package com.projects.comercialcarlos.Retrofit.model;


public class Productos  {

     String idproducto;
     String codigo_interno;
     String codigo_barra;
     String nombre_producto;
     String precio_compra;
     String precio_venta;
     String precio_venta_mayoreo;
     String stock;
     String stock_min;
     String idcategoria;
     String idmarca;
     String idpresentacion;
     String estado;
     String exento;
     String inventariable;
     String perecedero;

     public String getIdproducto() {
          return idproducto;
     }

     public void setIdproducto(String idproducto) {
          this.idproducto = idproducto;
     }

     public String getCodigo_interno() {
          return codigo_interno;
     }

     public void setCodigo_interno(String codigo_interno) {
          this.codigo_interno = codigo_interno;
     }

     public String getCodigo_barra() {
          return codigo_barra;
     }

     public void setCodigo_barra(String codigo_barra) {
          this.codigo_barra = codigo_barra;
     }

     public String getNombre_producto() {
          return nombre_producto;
     }

     public void setNombre_producto(String nombre_producto) {
          this.nombre_producto = nombre_producto;
     }

     public String getPrecio_compra() {
          return precio_compra;
     }

     public void setPrecio_compra(String precio_compra) {
          this.precio_compra = precio_compra;
     }

     public String getPrecio_venta() {
          return precio_venta;
     }

     public void setPrecio_venta(String precio_venta) {
          this.precio_venta = precio_venta;
     }

     public String getPrecio_venta_mayoreo() {
          return precio_venta_mayoreo;
     }

     public void setPrecio_venta_mayoreo(String precio_venta_mayoreo) {
          this.precio_venta_mayoreo = precio_venta_mayoreo;
     }

     public String getStock() {
          return stock;
     }

     public void setStock(String stock) {
          this.stock = stock;
     }

     public String getStock_min() {
          return stock_min;
     }

     public void setStock_min(String stock_min) {
          this.stock_min = stock_min;
     }

     public String getIdcategoria() {
          return idcategoria;
     }

     public void setIdcategoria(String idcategoria) {
          this.idcategoria = idcategoria;
     }

     public String getIdmarca() {
          return idmarca;
     }

     public void setIdmarca(String idmarca) {
          this.idmarca = idmarca;
     }

     public String getIdpresentacion() {
          return idpresentacion;
     }

     public void setIdpresentacion(String idpresentacion) {
          this.idpresentacion = idpresentacion;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }

     public String getExento() {
          return exento;
     }

     public void setExento(String exento) {
          this.exento = exento;
     }

     public String getInventariable() {
          return inventariable;
     }

     public void setInventariable(String inventariable) {
          this.inventariable = inventariable;
     }

     public String getPerecedero() {
          return perecedero;
     }

     public void setPerecedero(String perecedero) {
          this.perecedero = perecedero;
     }

     @Override
     public String toString() {
          return "Productos{" +
                  "idproducto='" + idproducto + '\'' +
                  ", codigo_interno='" + codigo_interno + '\'' +
                  ", codigo_barra='" + codigo_barra + '\'' +
                  ", nombre_producto='" + nombre_producto + '\'' +
                  ", precio_compra='" + precio_compra + '\'' +
                  ", precio_venta='" + precio_venta + '\'' +
                  ", precio_venta_mayoreo='" + precio_venta_mayoreo + '\'' +
                  ", stock='" + stock + '\'' +
                  ", stock_min='" + stock_min + '\'' +
                  ", idcategoria='" + idcategoria + '\'' +
                  ", idmarca='" + idmarca + '\'' +
                  ", idpresentacion='" + idpresentacion + '\'' +
                  ", estado='" + estado + '\'' +
                  ", exento='" + exento + '\'' +
                  ", inventariable='" + inventariable + '\'' +
                  ", perecedero='" + perecedero + '\'' +
                  '}';
     }
}