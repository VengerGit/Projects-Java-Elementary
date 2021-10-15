package com.venger.hw4;

/*
Вам дана сетка row x col, представляющая карту, где grid [i] [j] = 1 представляет землю, а grid [i] [j] = 0 - воду.
Ячейки сетки соединяются по горизонтали / вертикали (не по диагонали). Сетка полностью окружена водой,
и есть ровно один остров (то есть одна или несколько связанных сухопутных ячеек).
На острове нет «озер», то есть вода внутри не связана с водой вокруг острова. Одна ячейка представляет собой квадрат со стороной 1.
Сетка прямоугольная, ширина и высота не превышают 100. Определите периметр острова.
 */

public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                if (num == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] grid2 = {{1}};
        int[][] grid3 = {{1, 0}};

        System.out.println(islandPerimeter((grid1)));
        System.out.println(islandPerimeter(grid2));
        System.out.println(islandPerimeter(grid3));
    }
}