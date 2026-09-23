package com.lideratec;

public class Libro {

    String nombre;
    String editorial;
    int stock;

    public Libro(String nombre, String editorial){
        this.nombre = nombre;
        this.nombre = editorial;
    }

    public Libro(Libro libro){
        this.nombre = libro.nombre;
        this.editorial = libro.editorial;
    }
    public void aumentarStock(int cantidad){
            this.stock = this.stock + cantidad;
    }
}
