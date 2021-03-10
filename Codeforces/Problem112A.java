import java.util.*;

public class Problem112A
{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        String b = sc.next();
        
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        
        int i = 0;
        while (i < a.length()) {
            if (aLower.charAt(i) < bLower.charAt(i)) {
                System.out.println("-1");
                break;
            }
            else if (bLower.charAt(i) < aLower.charAt(i) ) {
                System.out.println("1");
                break;
            }
            
            else {
                if (i == (a.length() - 1)) {
                    System.out.println("0");
                }
                
            }
            i++;
            
        }
        
	}
}
