import java.util.*;

public class Priblem263A {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int x = 0;
        int y = 0;
        
        int answer = 0;
        for (int i = 0 ; i <=4 ; i++) {
            for (int j = 0 ; j <=4 ; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                     x = i+1;
                     y = j+1;
                }
                arr[i][j] = temp;
            }
        }
        
        answer = Math.abs(3-x) + Math.abs(3-y);
        
        
        System.out.println(answer);
        
        
        
    }
}

