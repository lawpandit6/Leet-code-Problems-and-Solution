class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output=new int[2];

        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int sum=numbers[first]+numbers[last];

            if(sum==target){
                output[0]=first+1;
                output[1]=last+1;
                return output;
            }else if(sum<target){
                first++;
            }else{
                last--;
            }
        }
        return output;
    }
}