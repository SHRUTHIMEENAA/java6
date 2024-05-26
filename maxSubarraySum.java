package leetprblms;
import java.util.*;
public class maxSubarraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int maximumSum=nums[0];
		int currentSum=nums[0];
		for(int i=1;i<n;i++) {
			currentSum=Math.max(nums[i],nums[i]+currentSum);
			maximumSum=Math.max(maximumSum, currentSum);
		}
		System.out.print(maximumSum);
		

}
}
