package pe.edu.isil;

import java.util.Set;
import java.util.TreeSet;

public class Ejemplo03 {

    public static void main(String[] args) {
        Set<Integer> numerosPrimos = new TreeSet<>();
        numerosPrimos.add(17);
        numerosPrimos.add(5);
        numerosPrimos.add(13);
        numerosPrimos.add(7);
        numerosPrimos.add(13);
        System.out.println("Primos ordenados" + numerosPrimos);

    }
}
