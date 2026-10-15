
/*
ArrayList forma parte de java.util, por lo que requiere la instrucción
import java.util.ArrayList;
al inicio del archivo.
 */
import java.util.ArrayList;
public class j18 {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> juegos = new ArrayList<>();

        /* Los elementos se añaden dinámicamente sin definir un
        límite previo. */
        // 1. Agregar elementos (se van acumulando en orden)
        juegos.add("fortnite");
        juegos.add("spiderman");
        juegos.add("roblox");
        juegos.add("Minecraft");
        System.out.println("Lista inicial: " + juegos);
        System.out.println("Total de juegos (size): " + juegos.size());

        // 2. Eliminar un elemento por índice o por valor
        juegos.remove("fornite"); // Remueve "fornite"

        // 3. Consultar y verificar
        System.out.println("\nLista después de eliminar: " + juegos);
        System.out.println("¿Hay roblox?: " + juegos.contains("fornite"));
        System.out.println("Elemento en posición 1: " + juegos .get(0));
    }
}