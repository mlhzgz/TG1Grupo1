package com.example.tg1grupo1.model;

public class Receta {

    private int imagen;
    private String titulo;
    private String ingredientes;
    private String descripcion;
    private String descripcionLarga;

    public Receta(int imagen, String titulo,String ingredientes, String descripcion, String descripcionLarga) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
        this.descripcionLarga = descripcionLarga;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionLarga() { return descripcionLarga; }

    public void setDescripcionLarga(String descripcionLarga) { this.descripcionLarga = descripcionLarga; }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
