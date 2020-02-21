import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for (int i =1; i < input; i++){
            for (int j= input; j >= i; j--){
                System.out.print(" ");
            }
            for (int j=1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a=1; a < input; a++){
            for (int d = 1; d <= a; d++){
                System.out.print(" ");
            }
            for (int b= input; b >= a; b--){
                System.out.print("*");
            }
            for (int c=(input - 1); c >= a; c-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
