// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// Return names sorted in descending order by the people's heights.

// Example 1:
// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.

// Example 2:
// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 
// Constraints:
// n == names.length == heights.length
// 1 <= n <= 103
// 1 <= names[i].length <= 20
// 1 <= heights[i] <= 105
// names[i] consists of lower and upper case English letters.
// All the values of heights are distinct.

import java.util.*;
public class Ques2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        int[] temp = new int[heights.length];
        String[] res = new String[names.length];
        System.arraycopy(heights, 0, temp, 0, heights.length);
        Arrays.sort(temp);
        int a=0;
        for(int i= 0; i<temp.length; i++){
            for(int j=0; j<heights.length; j++){
                if(temp[i] == heights[j]){
                    res[a] = names[j];
                    a++;
                }
            }
        }
        Collections.reverse(Arrays.asList(res));
        return res;
    }

    public static void main(String args[]){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        for(int i=0; i<sortPeople(names,heights).length; i++){
            System.out.print(sortPeople(names,heights)[i] + " ");
        }
    }
}