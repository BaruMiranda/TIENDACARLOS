package com.projects.comercialcarlos.Retrofit.model;


public class Proveedores {

     String idproveedor;
     String codigo_proveedor;
     String nombre_proveedor;
     String numero_telefono;
     String numero_nit;
     String nombre_contacto;
     String telefono_contacto;
     String estado;

     public Proveedores() {
     }

     public Proveedores(String idproveedor, String codigo_proveedor, String nombre_proveedor, String numero_telefono, String numero_nit, String nombre_contacto, String telefono_contacto, String estado) {
          this.idproveedor = idproveedor;
          this.codigo_proveedor = codigo_proveedor;
          this.nombre_proveedor = nombre_proveedor;
          this.numero_telefono = numero_telefono;
          this.numero_nit = numero_nit;
          this.nombre_contacto = nombre_contacto;
          this.telefono_contacto = telefono_contacto;
          this.estado = estado;
     }

     public String getIdproveedor() {
          return idproveedor;
     }

     public void setIdproveedor(String idproveedor) {
          this.idproveedor = idproveedor;
     }

     public String getCodigo_proveedor() {
          return codigo_proveedor;
     }

     public void setCodigo_proveedor(String codigo_proveedor) {
          this.codigo_proveedor = codigo_proveedor;
     }

     public String getNombre_proveedor() {
          return nombre_proveedor;
     }

     public void setNombre_proveedor(String nombre_proveedor) {
          this.nombre_proveedor = nombre_proveedor;
     }

     public String getNumero_telefono() {
          return numero_telefono;
     }

     public void setNumero_telefono(String numero_telefono) {
          this.numero_telefono = numero_telefono;
     }

     public String getNumero_nit() {
          return numero_nit;
     }

     public void setNumero_nit(String numero_nit) {
          this.numero_nit = numero_nit;
     }

     public String getNombre_contacto() {
          return nombre_contacto;
     }

     public void setNombre_contacto(String nombre_contacto) {
          this.nombre_contacto = nombre_contacto;
     }

     public String getTelefono_contacto() {
          return telefono_contacto;
     }

     public void setTelefono_contacto(String telefono_contacto) {
          this.telefono_contacto = telefono_contacto;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }
}