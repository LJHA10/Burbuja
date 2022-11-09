/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosordenadosburbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class DatosOrdenadosBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        int arreglo[], nElementos;

        System.out.println("Escribe en numero de elementos");
        entrada = bufer.readLine();
        nElementos = Integer.parseInt(entrada);

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }

        //Metodo burbuja
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }
            }
        }
        //Mostrando el arreglo
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}
