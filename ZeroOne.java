
import java.util.*;
public class ZeroOne {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Dutch national falg algorithm");
    	System.out.println("enter the size of array");
    	int n=sc.nextInt();
    	
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        int a = 0;
        int b = arr.length-1;
        for (int i = 0; i <= b; i++) {
            if (arr[i] == 0) {
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
                a++;
               
            }
            if (arr[i] == 2) {
                int temp = arr[b];
                arr[b] = arr[i];
                arr[i] = temp;
                b--;
                i--; // To re check the current position as it might contain 0 after swapping.
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}

