import java.util.HashMap;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int answer[] = new int[2];
        for(int i=0;i< nums.length;i++)
        { int temp=target-nums[i];
            if(map.containsKey(temp))
            {
                answer[0]=map.get(temp);
                answer[1]=i;
            }
            map.put(nums[i],i);
        }

    return answer;
    }
    public static void main(String args[])
    {
        int nums[]={3,2,4};
        int target=6;
        int ans[]=twoSum(nums,target);
        System.out.println("["+ans[0]+" ,"+ans[1]+" ]");
    }
}
