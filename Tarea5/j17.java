public class j17 {
    public static void main(String[] args) {

        // Inicialización directa con valores
        double[] precios = {19.99, 5.50, 12.00, 4.25};
        double total = 0;

        /*
         * Cómo recorrer un arreglo inicializado directamente para
         * calcular un total y un promedio
         */

        System.out.println("--- Lista de precios ---");

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + i + ": $" + precios[i]);
            total += precios[i]; // Acumulamos el precio
        }

        double promedio = total / precios.length;
        System.out.println("Total: $" + total);
        System.out.println("Promedio por producto: $" + promedio);



        double[] distancias = {28.6, 12.4, 18.5, 10.9,16.0,15.8,9.8};
        double totalDistancias = 0;

        System.out.println("--- Distancias recorridas ---");

        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Recorridos " + i + ": " + distancias[i] + " km ");
            totalDistancias += distancias[i];
        }

        System.out.println("Distancia total: " + " km: " + totalDistancias );

        System.out.println("Promedio por semana: Km: " + promedio);

    }
}