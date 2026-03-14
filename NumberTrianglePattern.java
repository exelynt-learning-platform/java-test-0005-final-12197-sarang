public class NumberTrianglePattern {
    public static void main(String[] args) {

        int n = 5;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                n = 5;
            }
        }

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + (j < i ? " " : ""));
                num++;
            }
            System.out.println();
        }
    }
}
