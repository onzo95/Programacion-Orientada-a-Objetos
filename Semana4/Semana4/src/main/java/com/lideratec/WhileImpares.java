package com.lideratec;

public class WhileImpares {

    public static void main(String[] args){
        identificarPares(13,20);
    }

    public static void identificarPares(int a, int b){
        while(a<=b) {
            if (a % 2 == 0){
                System.out.println(a + " es par");
            }
            a++;
        }

        //Imprimir solo los numeros impares
        while(a<=b) {
            if (a % 2 != 0){
                System.out.println(a + " es impar");
            }
            a++;
        }
    }
}
