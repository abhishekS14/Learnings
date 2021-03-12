import java.util.*;

public class Problem236A{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<Character>();  
		int counter = 0;
		//char[] seen = new char[s.length()];
		
		for (int i = 0 ; i < s.length() ; i++) {
		    char a = s.charAt(i);
	        set.add(a);
		}
		
		counter = set.size();
		if (counter % 2 == 0) {
		    System.out.println("CHAT WITH HER!");
		}
		else {
		    System.out.println("IGNORE HIM!");
		}
        
    }
}
