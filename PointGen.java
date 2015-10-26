/**
 * Generate a list of random 2 dimensional points.
 * The main() method takes the following CLI arguments:
 *     1. The number of points to generate
 *     2. The upper bound of the x-coordinate
 *     3. The upper bound of the y-coordinate
 *
 * Output is formatted as follows:
 *     1. The first line contains an integer, n, denoting the number of points
 *     2. The following n lines contains one point per line with the format x y.
 *
 * @author Chih-Jye Wang
 * @since  2015-10-25
 */
public class PointGen {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int xUpper = Integer.parseInt(args[1]);
        int yUpper = Integer.parseInt(args[2]);

        if(count <= 0)
            return;

        System.out.println(count);

        for(int i = 0; i < count; i++) {
            int x = (int)(Math.random() * xUpper);
            int y = (int)(Math.random() * yUpper);
            System.out.println(x + " " + y);
        }
    }
}