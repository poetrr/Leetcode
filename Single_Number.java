import java.util.*;
class Single_Number {
    //function to find which number is present just one time in the array 
    public static int singleNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int element=map.getOrDefault(nums[i],0);
            element++;
            map.put(nums[i],element);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int[] nums={10,1,2,3,4,1,2,3,4,};
        System.out.println(singleNumber(nums));
    }
}