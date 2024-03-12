# Movie Theatre Problem Solver

This Java project solves the Movie Theatre Problem, which involves finding the best available seat in a movie theatre given the number of rows, number of columns, and the list of occupied seats.

## Problem Statement

You are given the following parameters:
- Number of rows in the movie theatre (`numRows`)
- Number of columns in the movie theatre (`numCols`)
- An array containing the indices of occupied seats (`occupiedSeats`)

You need to find the best available seat in the theatre, which is the seat with the maximum distance to the nearest occupied seats. If there are multiple such seats, you can choose any of them.

## Solution Overview

The solution involves iterating through all seats in the theatre and calculating the distance to the nearest occupied seats for each seat. The seat with the maximum distance is considered the best seat. The distances are calculated using the `calculateDistance` method, and the best seat is determined by the `findBestSeat` method.



## Usage

To use the program, you can simply compile and run the `MovieTheatreProblem.java` file. The program will output the index of the best available seat in the movie theatre.

## Contributing

Contributions are welcome! If you have any suggestions or improvements for the project, feel free to open an issue or create a pull request.

