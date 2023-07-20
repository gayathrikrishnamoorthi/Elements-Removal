package sample;

import java.util.Scanner;

public class Elements {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int minCost = calMinCost(a);
        System.out.println("Output: " + minCost);
    }
    
    public static int calMinCost(int[] a) {
        int minCost = 0;
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            minCost += sum; 
            sum += a[i];    
        }
        
        return minCost;
}

}


