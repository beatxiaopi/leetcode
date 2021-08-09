package com.sangyezi.leetcode2021plus.dp;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SudokuSolverTest {

  @Test
  public void testCompare() throws Exception {
    SudokuSolver sudokusolver = new SudokuSolver();
    char [][] board = 
    {{'5' ,  '3',   '.',   '.',   '7',   '.',   '.',   '.',   '.'},   
     {'6',   '.',   '.',   '1',   '9',   '5',   '.',   '.',   '.'},   
     {'.',   '9',   '8',   '.',   '.',   '.',   '.',   '6',   '.'},   
     {'8',   '.',   '.',   '.',   '6',   '.',   '.',   '.',   '3'},   
     {'4',   '.',   '.',   '8',   '.',   '3',   '.',   '.',   '1'},   
     {'7',   '.',   '.',   '.',   '2',   '.',   '.',   '.',   '6'},   
     {'.',   '6',   '.',   '.',   '.',   '.',   '2',   '8',   '.'},   
     {'.',   '.',   '.',   '4',   '1',   '9',   '.',   '.',   '5'},   
     {'.',   '.',   '.',   '.',   '8',   '.',   '.',   '7',   '9'}};
    boolean solvable = sudokusolver.solve(board);
    assertEquals("Test solvable", solvable, true);
    char [][] result = 
    {{'5',   '3',   '4',   '6',   '7',   '8',   '9',   '1',   '2'},   
     {'6',   '7',   '2',   '1',   '9',   '5',   '3',   '4',   '8'},   
     {'1',   '9',   '8',   '3',   '4',   '2',   '5',   '6',   '7'},   
     {'8',   '5',   '9',   '7',   '6',   '1',   '4',   '2',   '3'},   
     {'4',   '2',   '6',   '8',   '5',   '3',   '7',   '9',   '1'},   
     {'7',   '1',   '3',   '9',   '2',   '4',   '8',   '5',   '6'},   
     {'9',   '6',   '1',   '5',   '3',   '7',   '2',   '8',   '4'},   
     {'2',   '8',   '7',   '4',   '1',   '9',   '6',   '3',   '5'},   
     {'3',   '4',   '5',   '2',   '8',   '6',   '1',   '7',   '9'}};

    // for(int i = 0; i < 9; i++) {
    //   for(int j = 0; j < 9; j++) {
    //     assertEquals("solve[i][j]", board[i][j], result[i][j]);
    //   }
    // }
     // deep compare
    assertTrue("board and result deep equals",    
      Arrays.deepEquals(board, result));
  }
}