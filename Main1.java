import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public  static void marcaYahtzee(int [][] matrizYahtzee, int []selecionados ){
        int linhaSelecionada = -1;
        int menorYahtzee = 7;
        for (int i = 0; i < 13; i++) {
            if(menorYahtzee < matrizYahtzee[i][0])
                continue;
            
            for (int j = 0; j < 4; j++) {
                if(matrizYahtzee[i][j] != matrizYahtzee[i][j+1])
                    break;
                if (j == 3){
                    menorYahtzee=matrizYahtzee[i][j];
                    linhaSelecionada = i;
                }
            }

        }
        if (linhaSelecionada != -1) {
            selecionados[linhaSelecionada] = 50;            
        }
        //System.out.println(menorYahtzee + " " + linhaSelecionada);
    }


    public  static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int[][] matrizYahtzee = new int[13][5];

        int[] selecionados  = new int[13];
        for (int i = 0; i < selecionados.length; i++) {
            selecionados[i] = 0;          
        }
      
        for(int i = 0; i < 13;i++){
            for(int j = 0; j < 5;j++){
                matrizYahtzee[i][j] = sc.nextInt();
            }
            Arrays.sort(matrizYahtzee[i]);
        }
        
        marcaYahtzee(matrizYahtzee,selecionados);
        // marcaFulllHouse(matrizYahtzee,selecionados);
        // marcaSequenciaGrande(matrizYahtzee,selecionados);
        // marcaSequenciaPequena(matrizYahtzee,selecionados);
        // marcaTipo4(matrizYahtzee,selecionados);
        // marcaTipo3(matrizYahtzee,selecionados);
        // marcaChance(matrizYahtzee,selecionados);
        // marcaNumero(matrizYahtzee,selecionados,6);
        // marcaNumero(matrizYahtzee,selecionados,5);
        // marcaNumero(matrizYahtzee,selecionados,4);
        // marcaNumero(matrizYahtzee,selecionados,3);
        // marcaNumero(matrizYahtzee,selecionados,2);
        // marcaNumero(matrizYahtzee,selecionados,1);
        


        // for(int i = 0; i < 13;i++){
        //     for(int j = 0; j < 5;j++){
        //     System.out.print(matrizYahtzee[i][j] + " "); 
        //     }
        //     System.out.println();
        // }

    } 
}