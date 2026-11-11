package pe.edu.isil;

import java.util.*;

public class EjemploIntegrador {

    public static void main(String[] args){
         List<String> inscripciones = new ArrayList<>();
         inscripciones.add("Fatima");
         inscripciones.add("Luigi");

         Set<String> participantes = new HashSet<>();
         participantes.add("Juan");
         participantes.add("Pepe");

         Map<Integer, String> carreras = new HashMap<>();
         carreras.put(1, "Informatica");
         carreras.put(2, "Economia");

         System.out.println("Lista: " + inscripciones);
    }

}

