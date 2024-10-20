public class MatrizDinamica {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 3;
        int contador = 1; // Contador para rellenar la Matriz, inicia con el valor 1 en la fila 0 columna 0
        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++){ // For que itera fila a fila
            for (int i = 0; i < columnas; i++){ // For que itera las posiciones columna a columna hasta terminar segun la variable i
                numeros[j][i] = contador; // Se guarda el valor de contador segun la posicion de j e i
                contador++; // Se incrementa el contador con cada iteracion llenado la fila
                System.out.print("[" + numeros[j][i] + "]"); // Imprime las filas segun sea j
            }
            System.out.println(""); // Imprime un salto de linea al acabar de imprimir cada fila para construir la Matriz
        }
    }
}