
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("enter the elements in the array (sorted): ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("enter the number for floor and ceil: ");
        int d = sc.nextInt();
        int floor = -1;
        int ceil = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] <= d) {
                floor = a[i];
            }

            if (a[i] >= d && ceil == -1) {
                ceil = a[i];
            }
        }
        System.out.println("floor = " + floor);
        System.out.println("ceil = " + ceil);
        sc.close();
    }
}
