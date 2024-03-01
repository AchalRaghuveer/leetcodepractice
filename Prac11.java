public class Prac11 {
    public int minEatingSpeed(int[] piles, int h) {

        List<Integer> pileList = Arrays.stream(piles).boxed().collect(Collectors.toList());
        Collections.sort(pileList);
        // int y = h - pileList.size();
        // if(y<pileList.size() - 1){
        //     return pileList.get(pileList.size() -y- 1);
        // }
        // long sum=0;
        // for(Integer ban: pileList) {
        //     System.out.println(sum+ " "+ ban);
        //     sum+=ban;
        // }
        // long diff = sum/h;
        // System.out.println(sum+ " "+ diff);
        // return (int)diff + 1;

        int left = 1, right = pileList.get(pileList.size() - 1);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(pileList, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canEatAll(List<Integer> piles, int h, int k) {
        int hours = 0;
        for (int bananas : piles) {
            hours += (bananas + k - 1) / k; // Ceil division
        }
        return hours <= h;
    }
}
