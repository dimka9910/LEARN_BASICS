package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

public class NumberofIslands {

    @Test
    public void name() {

        char[][] array = new char[][]{
                new char[]{'1','1','1','1','0'},
                new char[]{'1','1','0','1','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','0','0','0'}};

        numIslands(array);


    }

    public int numIslands(char[][] grid) {

        int islandCounter = 0;

        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    islandCounter++;
                    islandDestroyer(grid, i, j);
                }
            }
        }
        return islandCounter;
    }


    public void islandDestroyer(char[][] grid, int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'){
            grid[i][j] = '0';
            islandDestroyer(grid, i+1, j);
            islandDestroyer(grid, i-1, j);
            islandDestroyer(grid, i, j+1);
            islandDestroyer(grid, i, j-1);
        }
    }
}
