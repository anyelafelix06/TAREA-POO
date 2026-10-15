import java.util.ArrayList;

public class j19 {
    public static void main(String[] args) {
        // Usamos la clase wrapper Integer en lugar de int
        ArrayList<Integer> edades = new ArrayList<>();

        edades.add(25);
        edades.add(18);
        edades.add(30);
        edades.add(42);

        System.out.println("--- Registro de edades ---");
        // Recorrido sencillo usando for-each
        for (Integer edad : edades) {
            if (edad >= 21) {
                System.out.println("Edad " + edad + ": Es mayor de 21 años");
            } else {
                System.out.println("Edad " + edad + ": Menor de 21 años");
            }
        }

        ArrayList<Integer> calificaciones = new ArrayList<>();

        calificaciones.add(85);
        calificaciones.add(60);
        calificaciones.add(95);
        calificaciones.add(50);

        System.out.println("--- Registro de calificaciones ---");

        for (Integer calificacion : calificaciones) {
            if (calificacion >= 60) {
                System.out.println("Calificación " + calificacion + ": Aprobado");
            } else {
                System.out.println("Calificación " + calificacion + ": Reprobado");
            }
        }
    }
}