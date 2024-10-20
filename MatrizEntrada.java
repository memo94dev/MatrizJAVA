import java.util.Scanner;

public class MatrizEntrada {
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        int contador = 1; // Contador para rellenar la Matriz, inicia con el valor 1 en la fila 0 columna 0
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de Filas: ");
        filas = entrada.nextInt();
        System.out.println("Ingresa el numero de Columnas: ");
        columnas = entrada.nextInt();

        int numeros[][] = new int[filas][columnas];

        System.out.println("Asi se vera tu Matriz: "); // Mensaje de Encabezado
        System.out.println("");

        for (int j = 0; j < filas; j++){ // For que itera fila a fila
            for (int i = 0; i < columnas; i++){ // For que itera las posiciones columna a columna hasta terminar segun la variable i
                numeros[j][i] = contador; // Se guarda el valor de contador segun la posicion de j e i
                contador++; // Se incrementa el contador con cada iteracion llenado la fila
                System.out.print("[" + numeros[j][i] + "]"); // Imprime las filas segun sea j
            }
            System.out.println(""); // Imprime un salto de linea al acabar de imprimir cada fila para construir la Matriz
        }
        System.out.println("");
        System.out.println("        Gracias..");
    }
}