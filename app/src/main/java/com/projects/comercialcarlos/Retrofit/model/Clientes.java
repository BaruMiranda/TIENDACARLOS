package com.projects.comercialcarlos.Retrofit.model;


public class Clientes {

     String idcliente;
     String codigo_cliente;
     String nombre_cliente;
     String numero_nit;
     String direccion_cliente;
     String numero_telefono;
     String email;
     String giro;
     String limite_credito;
     String estado;


     public Clientes() {
     }

     public Clientes(String idcliente, String codigo_cliente, String nombre_cliente, String numero_nit, String direccion_cliente, String numero_telefono, String email, String giro, String limite_credito, String estado) {
          this.idcliente = idcliente;
          this.codigo_cliente = codigo_cliente;
          this.nombre_cliente = nombre_cliente;
          this.numero_nit = numero_nit;
          this.direccion_cliente = direccion_cliente;
          this.numero_telefono = numero_telefono;
          this.email = email;
          this.giro = giro;
          this.limite_credito = limite_credito;
          this.estado = estado;
     }

     public String getIdcliente() {
          return idcliente;
     }

     public void setIdcliente(String idcliente) {
          this.idcliente = idcliente;
     }

     public String getCodigo_cliente() {
          return codigo_cliente;
     }

     public void setCodigo_cliente(String codigo_cliente) {
          this.codigo_cliente = codigo_cliente;
     }

     public String getNombre_cliente() {
          return nombre_cliente;
     }

     public void setNombre_cliente(String nombre_cliente) {
          this.nombre_cliente = nombre_cliente;
     }

     public String getNumero_nit() {
          return numero_nit;
     }

     public void setNumero_nit(String numero_nit) {
          this.numero_nit = numero_nit;
     }

     public String getDireccion_cliente() {
          return direccion_cliente;
     }

     public void setDireccion_cliente(String direccion_cliente) {
          this.direccion_cliente = direccion_cliente;
     }

     public String getNumero_telefono() {
          return numero_telefono;
     }

     public void setNumero_telefono(String numero_telefono) {
          this.numero_telefono = numero_telefono;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getGiro() {
          return giro;
     }

     public void setGiro(String giro) {
          this.giro = giro;
     }

     public String getLimite_credito() {
          return limite_credito;
     }

     public void setLimite_credito(String limite_credito) {
          this.limite_credito = limite_credito;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }
}