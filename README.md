# NQuensProblem
This repo is for N-Queens problem solution

# NQueens

This is a Spring Boot application that solves the N-Queens problem and provides the solutions in the desired format.

## Problem Description

The N-Queens problem is a classic puzzle where the task is to place N queens on an NxN chessboard in such a way that no two queens threaten each other. In other words, no two queens should share the same row, column, or diagonal.

## Getting Started

To run the application, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the source code.
3. Open the project in your preferred Java IDE.
4. Build the project to resolve the dependencies.
5. Run the `NQueensApplication` class.

## Configuration

You can configure the size of the chessboard and the number of queens by modifying the `n` variable in the `main` method of the `NQueensApplication` class. By default, it is set to 4.

## Output Format

The solutions are printed in the desired format, where each distinct solution is represented as an array of arrays. Each array represents a row on the chessboard, and the values are either "Q" for a queen or "-" for an empty cell.

Example output:

[["-,-,Q,-", "Q,-,-,-,", "-,-,-,", "-,Q,-,"], ["-,Q,-,", "-,-,-,", "Q,-,-,", "-,-,Q,"]]

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

