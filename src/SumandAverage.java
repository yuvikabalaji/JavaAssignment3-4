import java.util.Scanner;
public class SumandAverage {
    public static void main(String[] args) {
        int n;
        int sum=0;
        float avg;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array:");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i=0; i<n; i++)
        {
            a[i]=scanner.nextInt();
            sum=sum + a[i];
        }
        System.out.println("The sum of the elements is: " + sum);
            avg = sum/a.length;
        System.out.println("The average of the elements is: " + avg);
    }
}
