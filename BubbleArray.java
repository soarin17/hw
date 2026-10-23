
import java.util.Scanner;

public class BubbleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements in the first array? ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("How many elements in the second array? ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < n2; i++) {
            c[n1 + i] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted merged array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}
