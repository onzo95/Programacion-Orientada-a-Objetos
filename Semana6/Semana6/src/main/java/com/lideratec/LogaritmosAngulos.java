package com.lideratec;

public class LogaritmosAngulos {

    public static void main(String[] args){
        double numero = 100;
        double grados = 90;

        System.out.println("Log10(1000) " + Math.log10(numero));
        System.out.println("Log(1000) " + Math.log(numero));

        double radianes = Math.toRadians(grados);
        System.out.println("180 grados convertidos a radianes es " + radianes);
        System.out.println("PI radianes en grados " + Math.toDegrees(Math.PI));
    }
}
