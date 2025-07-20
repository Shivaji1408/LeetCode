import java.util.Arrays;
import java.util.HashSet;
public class Ques2465 {
	public static int distinctAverages(int[] nums) {
		int n = nums.length;
		int l = 0;
		int r = n-1;
		HashSet<Double> hs =  new HashSet<Double>();
		Arrays.sort(nums);
		while(l < r){
			double avg =  (nums[l] + nums[r])/2.0;
			hs.add(avg);
			l++;
			r--;
		}
		return hs.size();
	}

	public static void main(String[] args) {
		int[] nums = {4,1,4,0,3,5};
		int result = distinctAverages(nums);
		System.out.println(result);
	}
}