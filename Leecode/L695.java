/**
 * @program: niukecode
 * @description: 695
 * @author: comemoon_win001
 **/

public class L695 {
    int maxarea= 0;
    int partarea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    if(maxarea<partarea){
                        maxarea = partarea;
                    }
                    partarea = 0;
                }
            }
        }
        return maxarea;
    }
    void dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') return;
        if(grid[i][j]=='1'){
            partarea++;
            grid[i][j] = '0';
        }
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,1}};
        System.out.println(new L695().maxAreaOfIsland(grid));

    }
}

