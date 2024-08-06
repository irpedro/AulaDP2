import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] des = { { -1, -1 }, { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { -1, 1 }, { 1, -1 } };

        Scanner sc = new Scanner(System.in);

        char[][] array;
        char[][] array2;

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m == 0 || n == 0) {
                break;
            }

            array = new char[n][m];
            array2 = new char[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = sc.next().charAt(0);
                    if (array[i][j] == '\n')
                        array[i][j] = sc.next().charAt(0);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array2[i][j] = '0';
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == '*') {
                        array2[i][j] = '*';
                        for (int k = 0; k < 8; k++) {
                            if (des[k][0] + i >= 0 && des[k][0] + i < n && des[k][1] + j >= 0 && des[k][1] + j < m) {
                                if (array[des[k][0] + i][des[k][1] + j] != '*') {
                                    array2[des[k][0] + i][des[k][1] + j]++;
                                }

                            }
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }

        }
        
    sc.close();
    }
}