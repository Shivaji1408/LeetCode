public class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        
        // int[] leftmax = new int[n];
        // leftmax[0] = height[0];
        // for(int i=1; i<n; i++){
        //     leftmax[i] = Math.max(leftmax[i-1], height[i]);
        // }

        // int[] rightmax = new int[n];
        // rightmax[n-1] = height[n-1];
        // for(int i=n-2; i>=0; i--){
        //     rightmax[i] = Math.max(rightmax[i+1],height[i]);
        // }

        // int rainwater = 0;
        // for(int i=0; i<n; i++){
        //     int waterlevel = Math.min(leftmax[i], rightmax[i]);
        //     rainwater += waterlevel - height[i];
        // }
        // return rainwater;

        Stack<Integer> st = new Stack<>();
        int i=0;
        int water = 0;
        while(i < height.length){
            while(!st.isEmpty() && height[i] > height[st.peek()]){
                int rm = i;
                int curr = st.pop();
                if(st.isEmpty()){
                    break;
                }
                int lm = st.peek();
                int width = rm - lm - 1;
                water += (Math.min(height[lm],height[rm])-height[curr])*width;
            }
            st.push(i);
            i++;
        }
        return water;
    }
}