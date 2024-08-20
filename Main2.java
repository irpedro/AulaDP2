//Pedro Gabriel Ruiz - 13875571
//Matheus Silva Lopes da Costa - 12674680
//Mateus Germano da Silva - 12543989

import java.util.Scanner;

/**
 * main
 */
public class Main {

    public static void imprimeLinha(int valor, int linha, int coluna, int s)
    {
        int inicio = 0;
        int meio = (2*s+3)/2;
        int fim = 2*s+2;

        switch (valor) {
            case 1:
                if ((linha != 0 && linha != (2*s+3)/2 && linha != 2*s+2) && (coluna == s+2))  {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;
        
            case 2:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((linha < meio) && (coluna == s+2)) {
                    System.out.print("|");
                }
                else if ((linha > meio) && (coluna == 1)) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }

                break;

            case 3:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if (coluna == s+2) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;
        
            case 4:
                if ((linha != inicio) || (linha != fim)) {
                    if (linha == meio)  {
                        if ((coluna != 1) && (coluna != s+2)) {
                            System.out.print("-");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    else if ((coluna == s+2) && (linha != 0) && (linha != fim)) {
                        System.out.print("|");
                    }
                    else if ((linha < meio) && (coluna == 1) && (linha != 0))
                    {
                        System.out.print("|");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print(" ");
                }
                
                break;

            case 5:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((linha > meio) && (coluna == s+2)) {
                    System.out.print("|");
                }
                else if ((linha < meio) && (coluna == 1)) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;
        
            case 6:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((coluna == 1) && (linha != 0)) {
                    System.out.print("|");
                }
                else if ((linha > meio) && (coluna == s+2) && (linha != 0))
                {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;

            case 7:
                if (linha == inicio)  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((coluna == s+2) && (linha != meio) && (linha != fim)) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;
        
            case 8:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((coluna == s+2) && (linha != 0)) {
                    System.out.print("|");
                }
                else if ((coluna == 1) && (linha != 0))
                {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                break;
                
            case 9:
                if ((linha == inicio) || (linha == meio) || (linha == fim))  {
                    if ((coluna != 1) && (coluna != s+2)) {
                        System.out.print("-");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if ((coluna == s+2) && (linha != 0)) {
                    System.out.print("|");
                }
                else if ((linha < meio) && (coluna == 1) && (linha != 0))
                {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }

                break;

            default:
            //Zero
                if (linha != meio) {
                    if ((linha == inicio) || (linha == fim))  {
                        if ((coluna != 1) && (coluna != s+2)) {
                            System.out.print("-");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    else if ((coluna == s+2) && (linha != 0)) {
                        System.out.print("|");
                    }
                    else if ((coluna == 1) && (linha != 0))
                    {
                        System.out.print("|");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print(" ");
                }
                
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){

            int escala = sc.nextInt();

            String numero = sc.next();
            //sc.nextLine();
            
            if (escala == 0) {
                break;
            }

            for (int i = 0; i < 2*escala+3; i++) {
                for (int j = 0; j < numero.length(); j++) {
                    for (int j2 = 1; j2 <= escala+2; j2++) {
                        imprimeLinha(Integer.parseInt(String.valueOf(numero.charAt(j))), i, j2, escala);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}