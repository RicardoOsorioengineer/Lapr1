/**
*
* @author Bruno Silva
* @author Ana Leite
* @author Ricardo Osório
* @author João Moreira
*/
package grupo8_1dg_projeto;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grupo8_1DG_projeto {

    public static void main(String[] args) throws FileNotFoundException {
        int numLinhas;
        //o que esta aqui e so para proposito de testes
        int Matriz[][]={{1,0,0,0,0,0,0}, {0,0,0,1,0,0,0}, {0,0,0,0,1,0,0}, {0,0,0,0,0,1,0}};
        Scanner file = Ficheiros.fileLeitura();
        numLinhas=Ficheiros.LerFicheiro(file, Matriz);
        for(int a=0;a<Matriz.length;a++){
            for(int b=0;b<Matriz[0].length;b++)
                System.out.print(Matriz[a][b]+" ");
            System.out.println("\n");
        }
    }
}