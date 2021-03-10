import java.util.*;

public class Problem50A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int domino = 2;
        int counter;
        
        int totalArea = m * n;
        
        counter = totalArea / 2;
        
        System.out.println(counter);
    }
}