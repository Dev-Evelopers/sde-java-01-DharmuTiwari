import java.util.*;

public class RectangularSheet {

    // Recursive method to calculate minimum folds along one dimension
    private static int foldsNeeded(int current, int target) {
        if (current <= target) return 0;
        return 1 + foldsNeeded((current + 1) / 2, target); // fold in half
    }

    // Minimum folds considering all possibilities
    public static int minFolds(int h, int w, int h1, int w1) {
        int minFolds = Integer.MAX_VALUE;

        // Case 1: No rotation
        if (h1 <= h && w1 <= w) {
            int folds = foldsNeeded(h, h1) + foldsNeeded(w, w1);
            minFolds = Math.min(minFolds, folds);
        }

        // Case 2: Rotate the target rectangle
        if (w1 <= h && h1 <= w) {
            int folds = foldsNeeded(h, w1) + foldsNeeded(w, h1);
            minFolds = Math.min(minFolds, folds);
        }

        return (minFolds == Integer.MAX_VALUE) ? -1 : minFolds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial height of the rectangle: ");
        int h = sc.nextInt();
        System.out.print("Initial width of the rectangle: ");
        int w = sc.nextInt();
        System.out.print("Target height of the rectangle: ");
        int h1 = sc.nextInt();
        System.out.print("Target width of the rectangle: ");
        int w1 = sc.nextInt();

        int result = minFolds(h, w, h1, w1);
        System.out.println("Minimum number of folds required: " + result);
        sc.close();
    }
}
