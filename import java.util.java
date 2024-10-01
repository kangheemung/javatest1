import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
        int B = sc.nextInt();
        int D = A - B;
        int P = A * B;

        System.out.println(D + " " + P);
    }
}