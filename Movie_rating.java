
import java.util.Scanner;

public class Movie_rating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("whats the movie rating: ");
        int rating = scn.nextInt();

        if (rating >= 75000) {
            System.out.println("out of this world");
        } else if (rating >= 45000) {
            System.out.println("best");
        } else if (rating >= 25000) {
            System.out.println("better");
        } else if (rating >= 5000) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

        scn.close();
    }
}
