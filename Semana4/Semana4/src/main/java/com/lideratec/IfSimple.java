package com.lideratec;

public class IfSimple {

    String nombre;
    int nota;

    public static void main(String[] args){
        IfSimple e1 = new IfSimple();
        e1.nombre = "Rosa Aliaga";
        e1.nota = 17;

        if(e1.nota>=13){
            System.out.println(e1.nombre + " está aprobada en mi curso");
        }else{
            System.out.println(e1.nombre + " está desaprobada en mi curso");
        }

        String mensaje = (e1.nota>=13)? "curso aprobado" : "curso desaprobado";

        System.out.println("mensaje con ternario es: " + mensaje);
    }
}
