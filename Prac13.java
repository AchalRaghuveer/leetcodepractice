public class Prac13 {
    public int singleNumber(int[] nums) {

        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(arrList);
        for(Integer i: set) {
            if(arrList.contains(i)){
                arrList.remove(i);
            }
        }
        for(Integer i: set) {
            if(!arrList.contains(i)){
                return i;
            }
        }

        return 0;

    }
}
