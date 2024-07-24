public class HollowRectangle {
    public static void hollow_rectangle(int totRows, int totColumns) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner loop
            for (int j = 1; j <= totColumns; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totColumns) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}
