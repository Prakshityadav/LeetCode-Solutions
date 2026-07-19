class Solution {
    static class DSU{
        int[] parent;
        int[] size;

        DSU(int n){
            parent=new int[n+1];
            size=new int[n+1];
            for(int i=1;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        boolean union(int x,int y){
            int px=find(x);
            int py=find(y);

            if(px==py) return false;   // cycle Found

            if(size[px]<size[py]){
                parent[px]=py;
                size[py]+=size[px];
            }else{
                parent[py]=px;
                size[px]+=size[py];
            }
            return true; // NO cycle
        }

    }
    public int[] findRedundantConnection(int[][] edges) {

        int n=edges.length;

        DSU dsu=new DSU(n);
        
        for(int[] edge:edges){
            int x=edge[0];
            int y=edge[1];
            if(!dsu.union(x,y)){
                return edge;
            }
        }
        return new int[0];
    }
}