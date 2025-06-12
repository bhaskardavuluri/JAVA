public class Two{
    public static void main(String[] args) {
         int rows = 5; // Total number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print the number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }
}
}