public class j1802 {

    public static void main(String[] args) {

        double[] promedios = {10, 7, 6, 8};

        double total = 0;

        System.out.println("--- Lista de promedios ---");

        for (int i = 0; i < promedios.length; i++) {

            System.out.println("Promedio " + i + ": " + promedios[i]);

            total = total + promedios[i];
        }

        double promedio = total / promedios.length;

        System.out.println("Total: " + total);

        System.out.println("Promedio final: " + promedio);
    }
}