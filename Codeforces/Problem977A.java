import java.util.*;

public class Problem977A {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0 ; i < k ; i++) 
		{
		    if (n % 10 != 0) {
		        n = n-1;
		    }
		    
		    else {
		        n = n / 10;
		    }
		}
		
		
        
        System.out.print(n);
    }
    
    
}

