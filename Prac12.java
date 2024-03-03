public class Prac12 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> zeroIndex = new ArrayList<>();
        List<Integer> oneIndex = new ArrayList<>();
        for(Integer i: nums1List){
            boolean found = false;
            if(!nums2List.contains(i)){
                if(!zeroIndex.contains(i)){
                    zeroIndex.add(i);
                }
            }
        }
        for(Integer i: nums2List){
            boolean found = false;
            if(!nums1List.contains(i)){
                if(!oneIndex.contains(i)){
                    oneIndex.add(i);
                }
            }
        }

        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
        finalResult.add(zeroIndex);
        finalResult.add(oneIndex);

        return finalResult;
    }
}
