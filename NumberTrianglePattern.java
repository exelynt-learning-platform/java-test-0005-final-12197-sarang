public class NumberTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        int num = 1;

        // Prints numbers in triangular form by increasing the count in each row
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}