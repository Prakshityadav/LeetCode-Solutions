class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int[] inDegree=new int[n];
        for(int[] pre:prerequisites){
            int u=pre[0];
            int v=pre[1];
            inDegree[u]++;
            graph.get(v).add(u);
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) q.offer(i);
        }
        int[] ans=new int[n];
        int idx=0;

        while(!q.isEmpty()){
            int node=q.poll();
            ans[idx++]=node;

            for(int nei:graph.get(node)){
                inDegree[nei]--;
                if(inDegree[nei]==0) q.offer(nei);
            }
        }
        if(idx!=n){
            return new int[0];
        }
        return ans;
    }
}