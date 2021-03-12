import java.util.*;

public class Problem546A{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
        int w = sc.nextInt();
        
        int total = 0;
        int answer = 0;
        for (int i = 1 ; i <= w ; i++) {
            total += i*k;
        }
        
        if (total > n) {
            answer = total - n;
        }
        System.out.print(answer);
    }
    
    
}

