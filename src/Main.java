import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int m = in.nextInt();
        int ar[][] = new int[n][m];
        for (int i=0; i <n; i++) {
            for (int j=0; j<m; j++){
                ar[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(" " + ar[0][i] * 3);

        }
    }
}