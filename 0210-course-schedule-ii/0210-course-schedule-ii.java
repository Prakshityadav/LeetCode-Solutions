class Solution {
    boolean dfs(int node,ArrayList<ArrayList<Integer>> graph,int[] state,Stack<Integer> s){
        if(state[node]==1) return true;
        if(state[node]==2) return false;
        state[node]=1;

        for(int nei:graph.get(node)){
            if(dfs(nei,graph,state,s)){
                return true;
            }
        }
        state[node]=2;
        s.push(node);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            int u=pre[0];
            int v=pre[1];
            graph.get(v).add(u);
        }

        int[] state=new int[numCourses];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(dfs(i,graph,state,s)){
                    return new int[0];
                }
            }
        }
        int[] result=new int[numCourses];
        int idx=0;
        while(!s.isEmpty()){
            result[idx++]=s.pop();
        }
        return result;
    }
}