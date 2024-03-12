
// Import the Arrays class for array-related operations
import java.util.Arrays;

/**
 * This class solves the Movie Theatre Problem, which involves finding the best
 * available seat
 * in a movie theatre given the number of rows, number of columns, and the list
 * of occupied seats.
 */
public class MovieTheatreProblem {

    /**
     * The main method of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Given parameters for the movie theatre
        int numRows = 5;
        int numCols = 8;
        int[] occupiedSeats = { 1, 3, 8, 10, 12, 18 };

        // Find the best seat in the theatre
        int bestSeat = findBestSeat(numRows, numCols, occupiedSeats);

        // Display the result
        System.out.println("The best seat is: " + bestSeat);
    }

    /**
     * Function to find the best available seat in the theatre.
     *
     * @param numRows       The number of rows in the theatre.
     * @param numCols       The number of columns in the theatre.
     * @param occupiedSeats An array containing the indices of occupied seats.
     * @return The index of the best available seat.
     */
    static int findBestSeat(int numRows, int numCols, int[] occupiedSeats) {
        // Sort the occupied seats for easier processing
        Arrays.sort(occupiedSeats);

        int maxDistance = -1;
        int bestSeat = -1;

        // Iterate through all seats to find the one with the maximum distance
        for (int seat = 1; seat <= numRows * numCols; seat++) {
            if (Arrays.binarySearch(occupiedSeats, seat) < 0) {
                // Calculate the distance to the nearest occupied seats
                int distance = calculateDistance(seat, occupiedSeats);

                // Update the best seat if the current seat has a greater distance
                if (distance > maxDistance) {
                    maxDistance = distance;
                    bestSeat = seat;
                }
            }
        }

        return bestSeat;
    }

    /**
     * Function to calculate the minimum distance from a seat to occupied seats.
     *
     * @param seat          The index of the current seat.
     * @param occupiedSeats An array containing the indices of occupied seats.
     * @return The minimum distance from the seat to occupied seats.
     */
    static int calculateDistance(int seat, int[] occupiedSeats) {
        int distance = Integer.MAX_VALUE;

        // Calculate the distance to the nearest occupied seat
        for (int occupiedSeat : occupiedSeats) {
            int currentDistance = Math.abs(seat - occupiedSeat);
            distance = Math.min(distance, currentDistance);
        }

        return distance;
    }
}
