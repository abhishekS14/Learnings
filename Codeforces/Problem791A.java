import java.util.*;

public class Problem791A{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int counter = 0;
		
		if (a == b) {
		    counter = 1;
		}
		else {
		    while (a <= b) {
		    a = 3*a;
		    b =2*b;
		    
		    counter++;
		    }
		}
		
		
        
        System.out.print(counter);
    }
    
    
}

