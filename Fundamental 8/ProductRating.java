public class ProductRating {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        String[] headers = {"Product", "Packaging", "Delivery"};
        System.out.println("Rating\tProduct\tPackaging\tDelivery");

 
        double[] avgCriteria = new double[3];
        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < ratings.length; row++) {
                sum += ratings[row][col];
            }
            avgCriteria[col] = (double) sum / ratings.length;
        }

        System.out.print("Average\t");
        for (int i = 0; i < avgCriteria.length; i++) {
            System.out.printf("%.2f\t", avgCriteria[i]);
        }
        System.out.println("\n");

        for (int row = 0; row < ratings.length; row++) {
            int sum = 0;
            for (int col = 0; col < ratings[row].length; col++) {
                sum += ratings[row][col];
            }
            double avg = (double) sum / ratings[row].length;
            System.out.printf("Customer %d provide the average rating %.2f%n", row + 1, avg);
        }
    }
}
