package MATEMATICASDISCRETAS;

import java.io.IOException;
import java.util.Scanner;
import utilerias.Lectura;

public class Creacion {

    public static Scanner s = new Scanner(System.in);
    public static String cadena, cadena2, aux;//
    public static int estado, longitud, apuntador;
    public static String vect[];

    public void ic() {
        int posicion = 0;
        while (posicion < longitud) {
            switch (posicion) {
                case 0: {
                    System.out.print(vect[0]);
                }break;
                case 1: {
                    System.out.print(vect[1]);
                }break;
                case 2: {
                    System.out.print(vect[2]);
                }break;
                case 3: {
                    System.out.print(vect[3]);
                }break;
                case 4: {
                    System.out.print(vect[4]);
                }break;
                case 5: {
                    System.out.print(vect[5]);
                }break;
                case 6: {
                    System.out.print(vect[6]);
                }break;
                case 7: {
                    System.out.print(vect[7]);
                }break;
                case 8: {
                    System.out.print(vect[8]);
                }break;
                case 9: {
                    System.out.print(vect[9]);
                }break;
                case 10: {
                    System.out.print(vect[10]);
                }break;
                case 11: {
                    System.out.print(vect[11]);
                }break;
            }
            posicion++;
        }
    }
    

    public static void main(String[] args) throws IOException {
        Creacion c = new Creacion();
        cadena = Lectura.leerString("Ingrese la cadena: ");
        cadena2 = "#" + cadena + "#";//se pone la misma cadena, solo que agregalos simbolos vacios o en blanco, 
        //principio de la cadena y el final de la cadena
        longitud = cadena2.length();//la cadena es medida con esta funcion
        vect = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            vect[i] = String.valueOf(cadena2.charAt(i));
        }
        c.ic();
    }
}
