package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

public class MaxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int islandArea = 0;

        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    islandArea = Math.max(islandDestroyer(grid, i, j), islandArea);
                }
            }
        }
        return islandArea;
    }

    public int islandDestroyer(int[][] grid, int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + islandDestroyer(grid, i+1, j) +
                    islandDestroyer(grid, i-1, j) +
                    islandDestroyer(grid, i, j+1) +
                    islandDestroyer(grid, i, j-1);
        } else {
            return 0;
        }
    }
}
