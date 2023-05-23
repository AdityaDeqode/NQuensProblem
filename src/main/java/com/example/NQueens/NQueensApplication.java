package com.example.NQueens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class NQueensApplication {

	public static void main(String[] args) {
		SpringApplication.run(NQueensApplication.class, args);

		int n = 4;

		char[][] board = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}

		Set<List<String>> solutions = new HashSet<>();
		findAllSolutions(board, 0, n, solutions);

		List<List<String>> solutionsArray = new ArrayList<>();
		for (List<String> solution : solutions) {
			List<String> formattedSolution = new ArrayList<>();
			formattedSolution.add("[" + String.join(", ", solution) + "]");
			solutionsArray.add(formattedSolution);
		}

		System.out.println(solutionsArray);
	}

	private static void findAllSolutions(char[][] board, int col, int n, Set<List<String>> solutions) {
		if (col >= n) {
			List<String> solution = convertBoardToStrings(board);
			solutions.add(solution);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (canPlaceValue(i, col, 'Q', board)) {
				board[i][col] = 'Q';
				findAllSolutions(board, col + 1, n, solutions);
				board[i][col] = '.';
			}
		}
	}

	private static boolean canPlaceValue(int row, int col, char value, char[][] board) {
		int n = board.length;

		for (int i = 0; i < n; i++) {
			if (board[row][i] == value || board[i][col] == value) {
				return false;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((row != i && col != j) && (row - i == col - j || row - i == j - col) && board[i][j] == value) {
					return false;
				}
			}
		}

		return true;
	}

	private static List<String> convertBoardToStrings(char[][] board) {
		List<String> solution = new ArrayList<>();
		int n = board.length;

		for (char[] chars : board) {
			StringBuilder row = new StringBuilder();
			for (int j = 0; j < n; j++) {
				row.append(chars[j]);
			}
			solution.add(row.toString());
		}

		return solution;
	}
}


