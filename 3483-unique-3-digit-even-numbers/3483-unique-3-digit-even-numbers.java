class Solution {
    public int totalNumbers(int[] digits) {

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int d : digits) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        for(int i = 100;i<1000;i++){
            if(i % 2 != 0) continue;
            int a = i / 100;
            int b = i % 10;
            int c = (i / 10) % 10;
            Map<Integer, Integer> deep = new HashMap<>(map);
            if(deep.getOrDefault(a, 0) == 0) continue;
            deep.put(a, deep.get(a)-1);
            if(deep.getOrDefault(b, 0) == 0) continue;
            deep.put(b, deep.get(b)-1);
            if(deep.getOrDefault(c, 0) == 0) continue;
            count++;
        }
        return count;
    }
}