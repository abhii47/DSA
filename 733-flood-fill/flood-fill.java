class Solution {

    public static int[][] engine(int w[][],int i,int j,int n,int m,int c,int track){
        if(i<0 || j<0 || i>=m || j>=n)return w;
        if(track == c) return w;
        if(w[i][j]!=track) return w;
        else w[i][j]=c;
        //up
        engine(w,i-1,j,n,m,c,track);
        //down
        engine(w,i+1,j,n,m,c,track);
        //right
        engine(w,i,j+1,n,m,c,track);
        //left
        engine(w,i,j-1,n,m,c,track);
        return w;

    }

    public int[][] floodFill(int[][] w, int i, int j, int c) {
        
        int track = w[i][j];
        int m = w.length;
        int n = w[0].length;
        engine(w,i,j,n,m,c,track);
        return w;
        
    }
}