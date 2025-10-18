// Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
// In one shift operation:
// Element at grid[i][j] moves to grid[i][j + 1].
// Element at grid[i][n - 1] moves to grid[i + 1][0].
// Element at grid[m - 1][n - 1] moves to grid[0][0].
// Return the 2D grid after applying shift operation k times.

// Example 1:
// Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
// Output: [[9,1,2],[3,4,5],[6,7,8]]

// Example 2:
// Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
// Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

// Example 3:
// Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
// Output: [[1,2,3],[4,5,6],[7,8,9]]
 
// Constraints:
// m == grid.length
// n == grid[i].length
// 1 <= m <= 50
// 1 <= n <= 50
// -1000 <= grid[i][j] <= 1000
// 0 <= k <= 100


import java.util.*;

public class Ques1260 {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //////////**********************
        
        // <<======= Brute Force Approach ==============>>
        // int n = grid.length, m = grid[0].length;
        // int[][] temp = grid;
        
        // while (k-- > 0) {
        //     // init for each loop
        //     temp = new int[n][m];
            
        //     // 1. shift right
        //     for (int i = 0; i < n; i++) {
        //         for (int j = 1; j < m; j++) {
        //             temp[i][j] = grid[i][j - 1];
        //         }
        //     }
            
        //     // 2. move last one in this row to the next row
        //     for (int i = 1; i < n; i++) {
        //         temp[i][0] = grid[i - 1][m - 1];
        //     }
            
        //     // 3. move the last one to the first place
        //     temp[0][0] = grid[n - 1][m - 1];
            
        //     // repeat
        //     grid = temp;
        // }
        
        // return (List)Arrays.asList(temp);     *************************////////////

        // <<<<========== Optimal Approach ==========>>>>
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % (total);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for (int j = 0; j < n; j++){
                int index = ((i * n + j) - k + total) % total;
                list.add(grid[index / n][index % n]);
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        System.out.println(shiftGrid(grid, k));
    }
}
