public class Prac15 {
    public int findMin(int[] nums) {
        int left =0;
        int right = nums.length -1;
        if(left == right) {
            return nums[left];
        }
        while(left <= right) {
            int mid = (left + right) / 2;
            System.out.println(nums[mid]);
            if(mid > 0 && mid < right){
                if(nums[mid-1] > nums[mid] && nums[mid+1] > nums[mid]) {
                    return nums[mid];
                } else if(nums[mid] > nums[right]){
                    left = mid+1;
                } else {
                    right = mid-1;

                }
            } else {
                if(mid == 0){
                    if(nums[mid] < nums[mid+1]){
                        return nums[mid];
                    } else {
                        return nums[mid+1];
                    }
                } else {
                    if(nums[mid] < nums[mid-1]){
                        return nums[mid];
                    } else {
                        return nums[mid-1];
                    }
                }

            }

        }
        return 0;

    }
}
