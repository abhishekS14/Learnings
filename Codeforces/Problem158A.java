import java.util.*;

public class Problem158A {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] scores = new int[n];
        
        for (int i = 0; i < n ; i++) {
            int temp = sc.nextInt();
            scores[i] = temp;
        }
        
        int threshold = scores[k-1];
        int res = 0;
            for (int j = 0 ; j < n ; j++) 
            {
                if (scores[j] >= threshold && scores[j] > 0) 
                {
                    res += 1;
                }
            }
        
        
        System.out.println(res);
    }
}