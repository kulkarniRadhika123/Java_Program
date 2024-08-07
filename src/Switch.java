import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int ch=0 ;
        // Consume the newline character
        double[] a = new double[2]; // Create an array to store length and breadth
        areaSwitchCase(ch, a); // Pass the Scanner object as well
    }

    public static double areaSwitchCase(int ch, double[] a) {
        double r, area = 0;
        Scanner ra = new Scanner(System.in);
        ch=ra.nextInt();

        switch (ch) {
            case 1:
                r = ra.nextDouble(); // Read the radius
                area = Math.PI * r * r;
                System.out.println(area);
                break;
            case 2:
                // Read both l and b from the same line, separated by a space
                String[] lbInput = ra.nextLine().split(" ");
                if (lbInput.length >= 2) {
                    a[0] = Double.parseDouble(lbInput[0]); // Read the length
                    a[1] = Double.parseDouble(lbInput[1]); // Read the breadth
                    double l = a[0];
                    double b = a[1];
                    area = l * b;
                    System.out.println(area);
                }
                break;
        }

        return area; // Return the calculated area
    }
}
