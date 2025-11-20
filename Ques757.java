// You are given a 2D integer array intervals where intervals[i] = [starti, endi] represents all the integers from starti to endi inclusively.
// A containing set is an array nums where each interval from intervals has at least two integers in nums.
// For example, if intervals = [[1,3], [3,7], [8,9]], then [1,2,4,7,8,9] and [2,3,4,8,9] are containing sets.
// Return the minimum possible size of a containing set.

// Example 1:
// Input: intervals = [[1,3],[3,7],[8,9]]
// Output: 5
// Explanation: let nums = [2, 3, 4, 8, 9].
// It can be shown that there cannot be any containing array of size 4.

// Example 2:
// Input: intervals = [[1,3],[1,4],[2,5],[3,5]]
// Output: 3
// Explanation: let nums = [2, 3, 4].
// It can be shown that there cannot be any containing array of size 2.

// Example 3:
// Input: intervals = [[1,2],[2,3],[2,4],[4,5]]
// Output: 5
// Explanation: let nums = [1, 2, 3, 4, 5].
// It can be shown that there cannot be any containing array of size 4.
 
// Constraints:
// 1 <= intervals.length <= 3000
// intervals[i].length == 2
// 0 <= starti < endi <= 108


import java.util.Arrays;
public class Ques757 {
    public static int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });
        int p1 = -1;
        int p2 = -1;
        int result = 0;

        for(int[] interval : intervals){
            int start = interval[0], end = interval[1];

            boolean hasP1 = p1 >= start && p1 <= end;
            boolean hasP2 = p2 >= start && p2 <= end;

            if(hasP1 && hasP2){
                continue;
            }else if(hasP2){
                p1 = p2;
                p2 = end;
                result += 1;
            }else {
                p1 =  end - 1;
                p2 = end;
                result += 2;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[][] intervals = {{1,3},{1,4},{2,5},{3,5}};
        System.out.println(intersectionSizeTwo(intervals));
    }
}