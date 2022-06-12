import java.util.Arrays;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][][] arr = new int[n][m][l];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                for (int k = 0; k <l ; k++) {
                    int a = sc.nextInt();
                    arr[i][j][k] = a;

                }

            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                for (int k = 0; k <l ; k++) {
                    System.out.print(arr[i][j][k]+" ");

                }

            }
        }
    }
}
