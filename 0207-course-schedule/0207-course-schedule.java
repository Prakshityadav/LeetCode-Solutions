class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        int[] indegree=new int[n];

        for(int[] pre:prerequisites){
            int u=pre[0];
            int v=pre[1];
            indegree[u]++;
            graph.get(v).add(u);
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;

        while(!q.isEmpty()){
            int node=q.poll();
            count++;

            for(int nei:graph.get(node)){
                indegree[nei]--;
                if(indegree[nei]==0) q.add(nei);
            }
        }

        return count==numCourses;

    }
}