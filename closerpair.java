package closerpair;

public class CloserPair {

    // لينا العمودي
    // 2216609
    // A2

    public static void main(String[] args) {

        int[][] P = {{3, 2}, {3, 6}, {7, 12}, {3, 1}, {9, 18}, {8, 56}};
        double SmallestDistance = Double.MAX_VALUE;
        int x, y;
        int x1 = -1, x2 = -1;
        int y1 = -1, y2 = -1;

        for (int i = 0; i < P.length - 1; i++) {
            for (int j = i + 1; j < P.length; j++) {

                x = P[j][0] - P[i][0];
                y = P[j][1] - P[i][1];

                double currentDistance =
                        Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

                if (currentDistance < SmallestDistance) {
                    SmallestDistance = currentDistance;
                    x1 = P[i][0];
                    y1 = P[i][1];
                    x2 = P[j][0];
                    y2 = P[j][1];
                }
            }
        }

        System.out.print("All points: ");
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length; j++) {

                if (j == 0) {
                    System.out.print("(");
                }
                if (j == 1) {
                    System.out.print(",");
                }

                System.out.print(P[i][j] + " ");

                if (j == 1) {
                    System.out.print(")");
                }
            }
        }

        System.out.println("\nThe Distance: " + SmallestDistance);
        System.out.println(
                "The closet points are: (" + x1 + ", " + y1 + ")"
                        + " (" + x2 + ", " + y2 + ")"
        );
    }
}
