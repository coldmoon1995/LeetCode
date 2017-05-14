package com.leetcode;

import java.util.Arrays;

public class Valid_Sudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length < 1)
			return false;
		for (int i = 0; i < board.length; i++) {
			boolean[] flag = new boolean[10];
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.')
					continue;
				if (flag[board[i][j] - '0'])
					return false;
				else
					flag[board[i][j] - '0'] = true;
			}
		}
		for (int i = 0; i < board[0].length; i++) {
			boolean[] flag = new boolean[10];
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] == '.')
					continue;
				if (flag[board[j][i] - '0'])
					return false;
				else
					flag[board[j][i] - '0'] = true;
			}
		}
		for (int i = 0; i < board.length - 2; i=i+3) {
			for (int j = 0; j < board[0].length - 2; j=j+3) {
				boolean[] flag = new boolean[10];
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (board[m][n] == '.')
							continue;
						if (flag[board[m][n] - '0']) {
							System.out.println(m+"  "+n);
							return false;
						} else
							flag[board[m][n] - '0'] = true;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.', '6' },
				{ '.', '.', '.', '.', '1', '4', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '9', '2', '.', '.' }, { '5', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '3', '.' }, { '.', '.', '.', '5', '4', '.', '.', '.', '.' },
				{ '3', '.', '.', '.', '.', '.', '4', '2', '.' }, { '.', '.', '.', '2', '7', '.', '6', '.', '.' } };
		Valid_Sudoku test = new Valid_Sudoku();
		System.out.println(test.isValidSudoku(board));

	}

}
