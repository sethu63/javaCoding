import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printStar(sc.nextInt());

    }
    static void printStar(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++)
                System.out.print("\t");
            System.out.print("*");
            System.out.println();
        }
    }
}