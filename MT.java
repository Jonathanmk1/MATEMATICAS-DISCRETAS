package MATEMATICASDISCRETAS;

import java.util.Scanner;

public class MT {

    //public static String[][] matriz = {{"q0|1|D", " q0|P|D", " q2|R|I", " q2|R|I", null, null},{"q2|X|D", " q6|P|D", null, null, " q1|X|I", null},{"q2|1|I "," q2|P|I", " q2|R|I", "q3|B|D", " q2|X|I", " q2|Y|I"},{"q4|Y|D", " q5|P|I", null, null, null, " q3|Y|D"},{"q4|1|D", " q4|P|D", " q4|R|D", " q2|1|I", " q4|X|D", null}, {null, null, null, " q0|B|D", null, " q5|1|I"},{null, null, null, null, null, null}};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j;
        String edo, simbR, mov;
        String[][] matriz = {{"q0|1|D", "q0|P|D", "q2|R|I", "q2|R|I", null, null}, {"q2|X|D", "q6|P|D", null, null, "q1|X|I", null}, {"q2|1|I ", "q2|P|I", "q2|R|I", "q3|B|D", "q2|X|I", "q2|Y|I"}, {"q4|Y|D", "q5|P|I", null, null, null, "q3|Y|D"}, {"q4|1|D", "q4|P|D", "q4|R|D", "q2|1|I", "q4|X|D", null}, {null, null, null, "q0|B|D", null, "q5|1|I"}, {null, null, null, null, null, null}};

        for (i = 0; i < 7; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 6; j++) {
                if (matriz[i][j] != null) {
                    edo = matriz[i][j].substring(0, matriz[i][j].indexOf("|"));
                    simbR = matriz[i][j].substring(matriz[i][j].indexOf("|") + 1, matriz[i][j].lastIndexOf("|"));
                    mov = matriz[i][j].substring(matriz[i][j].indexOf("|") + 3);
                    System.out.printf("%-3s %-3s %s-3s", edo, simbR, mov);

                }
            }

        }

    }
}

/*
 for (i = 0; i < 7; i++) { //filas
            for (j = 0; j < 6; j++) { //columnas
                //System.out.print(" " + matriz[i][j]);

                if (!matriz[i][j].equals("null")) {

                    edo = String.valueOf(matriz[i][j]).substring(0, String.valueOf(matriz[i][j]).indexOf("|"));
                    System.out.println(" Edo-->" + edo);

                }

            }
            System.out.println("");
        }
        System.out.println("");
 */
 /*
//matriz[i][j]= s.nextLine();
            subcadena = matriz[i][j].substring(matriz[i][j].indexOf("\"") +1, matriz[i][j].lastIndexOf("|"));
            System.out.println(subcadena);
 */

 /*
       if(estado==q0&&valor==1&&mov==D){
           estdado= q0;
           valor = 1;
           mov= I;
 */
