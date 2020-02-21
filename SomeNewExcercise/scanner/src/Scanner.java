import java.util.Scanner;

class Scanners {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
//            System.out.println(s1);
            if (x < 100 ) {

                System.out.print(s1 + " " + String.format("0"+"%-15s\n", x));
            } else {

                System.out.print(s1 + " " + String.format("%-15s\n", x));
            }
            // System.out.println(s1);

        }
        System.out.println("================================");

    }

}
