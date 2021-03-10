import java.util.*;

public class Problem231A { 
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int res = 0;
        for  (int i = 0 ; i < n; i++) {
            
            
            int counter = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == 1) {counter += 1;}
            if (b == 1) {counter += 1;}
            if (c == 1) {counter += 1;}
            
            if (counter >=2) {res += 1;}
            
        }
        
        System.out.println(res);
        
    }
}