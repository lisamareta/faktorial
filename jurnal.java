
import java.util.Scanner;

public class Jurnal {


    public static void main(String[] args) {
       System.out.print("masukan angka : "); 
       Scanner sc = new Scanner(System.in); 
        int i; 
        int n = sc.nextInt(); 
 
        for (i = 1; i < (2 * n) ; i++) { 
 
            for (int j = 0; j < (2 * n) + 1; j++) { 
 
                if (i < n) { 
                    if ((j > n - i) && (j < n + i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
                } else { 
 
                    if ((j > i - n) && (j < 3*n-i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
 
                } 
            } 
            System.out.println(); 
 
        } 
    } 
}
