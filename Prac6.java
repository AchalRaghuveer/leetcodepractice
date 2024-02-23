public class Prac6 {
    public int minStartValue(int[] nums) {
        int minStart = 1;
        int totalNegative = 0;
        int totalPositive = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                totalNegative += nums[i];
            } else {
                totalPositive += nums[i];
            }
        }
        int maxPositive = 0-totalNegative;
        boolean val = false;
        while(maxPositive>0 && !val) {
            int checkMax = maxPositive;
            for(int i=0; i<nums.length; i++) {
                checkMax += nums[i];
                if(checkMax<=0) {
                    val = true;
                    break;
                }
            }
            if(!val){
                maxPositive--;
            }
        }

        return maxPositive + 1;


    }
}
