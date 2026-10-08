package com.lideratec;

public class CamposMath {

    public static void main(String[] args){
        double valor = 12.4;
        double otro = 6.8;
        System.out.println("Math.PI= " + Math.PI);
        System.out.println("Math.E= " + Math.E);
        System.out.println("Diferencia PI - E " + (Math.PI -Math.E ));
        System.out.println("Valor absoluto " + Math.abs(valor));
        System.out.println("Redondeo hacia número entero abajo: " + Math.floor(valor));
        System.out.println("Redondeo hacia número entero arriba: " + Math.ceil(valor));
        System.out.println("Redondeo hacia número entero más cercano: " + Math.round(valor));
        System.out.println("max: " + Math.max(valor, otro));
        System.out.println("min: " + Math.min(valor, otro));
    }
}
