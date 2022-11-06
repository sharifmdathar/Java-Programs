import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        /*
         *   Pattern   Row    Numbers
         * ___1         1       4    | (4+1-1)  and  (4-1+1)
         * __2_2        2       3, 5 | (4+1-2)  and  (4-1+2)
         * _3___3       3       2, 6 | (4+1-3)  and  (4-1+3)
         * 4444444      4       1 to (4*2-1)
         */

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j<= (2*r-1); j++) {
                if (i == r) {
                    System.out.print(i);
                } else if (j == (r+1-i) || j == (r-1+i)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }            
            }
            System.out.println();
        }
        sc.close();
    }
}