class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->{
                if(map.get(a).equals(map.get(b))){
                    return a.compareTo(b);
                }
                return map.get(b)-map.get(a);
            }
        );
        for(String s:map.keySet()){
            pq.offer(s);
        }
        for(int i=0;i<k;i++){
            result.add(pq.poll());
        }
        return result;
    }
}