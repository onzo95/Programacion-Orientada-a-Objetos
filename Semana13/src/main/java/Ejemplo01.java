public class Ejemplo01 {

    public static void main(String[] args) {
        Directivo directivo = new Directivo("Ana", 2500, "TI");
        directivo.nombre = "Ana";
        directivo.sueldo = 2500;
        directivo.departamento = "TI";

        System.out.println(directivo.leerRegistro());
        directivo.leerRegistro();
    }
}