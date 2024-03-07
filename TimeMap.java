class TimeMap {
    Map<String,List<Val>> map;
    class Val {
        String value;
        Integer timestamp;
        public Val(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;

        }
    }


    public TimeMap() {

        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Val(value, timestamp));

    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        List<Val> list = map.get(key);

        int left = 0;
        int right = list.size() -1;

        while(left +1 < right) {
            int mid = left + (right - left) /2;
            System.out.println("mid "+ mid);
            if(list.get(mid).timestamp == timestamp) {
                return list.get(mid).value;
            } else if (list.get(mid).timestamp > timestamp) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        System.out.println(right+" "+left+" "+list.size());
        if(list.get(right).timestamp <= timestamp){
            return list.get(right).value;
        } else if(list.get(left).timestamp <= timestamp){
            return list.get(left).value;
        } else {
            return "";
        }

    }
}