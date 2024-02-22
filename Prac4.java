public class Prac4 {
    public int[] sortByBits(int[] arr) {
        List<Integer> arrlist =Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i=0; i< arrlist.size(); i++){
            String binary = Integer.toBinaryString(arrlist.get(i));
            String[] binArray = binary.split("");
            int count = 0;
            for(int j=0; j<binArray.length; j++){
                if(binArray[j].equals("1")) {
                    count++;
                }
            }
            if(map.containsKey(count)) {
                List<Integer> val = map.get(count);
                val.add(arrlist.get(i));
                map.put(count, val);
            } else {
                List<Integer> val = new ArrayList<Integer>();
                val.add(arrlist.get(i));
                map.put(count, val);
            }

        }
        List<Integer> ret = new ArrayList<Integer>();
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            List<Integer> in = entry.getValue();
            Collections.sort(in);
            for(Integer i: in) {
                ret.add(i);
            }
        }
        System.out.println("Last "+ ret.toString());
        int[] intArray = ret.stream().mapToInt(i -> i).toArray();
        return intArray;
    }
}
