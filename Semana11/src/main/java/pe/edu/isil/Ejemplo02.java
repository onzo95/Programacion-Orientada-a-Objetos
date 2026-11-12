package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02 {
    public static void main(String[] args){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Pedro", 50));
        listaEstudiantes.add(new Estudiante("Fatima", 30));
        listaEstudiantes.add(new Estudiante("Luigui", 25));
        listaEstudiantes.add(new Estudiante("Luigui", 25));

        //cuando recorra la lista tendrá tantos objetos estudiantes
        for (Estudiante estudi : listaEstudiantes){
            //condiciones
            if (estudi.getEdad() >= 30){
                System.out.println(estudi);
            }
        }
    }
}
