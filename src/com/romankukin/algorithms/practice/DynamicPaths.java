package com.romankukin.algorithms.practice;

import java.util.Scanner;

public class DynamicPaths {

  public static void print(int[][] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 1; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  /**
   * Count paths using dynamic programming
   * Complexity: O(m * n)
   * @param n coordinate 1
   * @param m coordinate 2
   * @return count of possible paths to get from coordinate 1 1 to n m
   */
  public static int dynamicPaths(int n, int m) {
    int[][]arr = new int[n + 1][m + 1];

    arr[1][1] = 1;

    print(arr);
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
      }
    }

    for (int j = 2; j <= m; j++) {
      for (int i = 1; i <= n; i++) {
        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
      }
    }

    print(arr);

    return arr[n][m];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      System.out.println(dynamicPaths(n, m));
    }
  }
}
