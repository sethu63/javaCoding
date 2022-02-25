import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        printStar(scn.nextInt());

    }
    static void printStar(int n){
        int sp = 1, st = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=st;j>=1;j--){
                System.out.print("*\t");
            }
            for(int j=sp;j>=1;j--){
                System.out.print("\t");
            }
            for(int j=st;j>=1;j--){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp+=2;
                st--;
            }
            else{
                sp-=2;
                st++;
            }
            System.out.println();
        }
    }
}