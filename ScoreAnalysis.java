public class ScoreAnalysis {
    public static void main(String[] args) {
        // Sample array of scores
        int[] scores = { 85, 92, 78, 90, 66, 88, 76, 88 };

        // Initialize variables
        int sum = 0;
        int min = scores[0];
        int max = scores[0];

        // Loop through the array to calculate sum, min, and max
        for (int score : scores) {
            sum += score;

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }
        }

        // Calculate average
        double average = (double) sum / scores.length;

        // Display the results
        System.out.println("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\n\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
