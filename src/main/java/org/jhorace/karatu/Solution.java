package org.jhorace.karatu;

public class Solution {

    public int solution(int [][] arr){
if(arr.length==0|| arr==null) return 0;
int rows=arr.length;
int columns=arr[0].length;
int max=0;
for(int i=0;i<rows;i++ ){
    for(int j=0;j<rows;j++ ){
        int gold=findMaxGold(arr,i,j,rows,columns,new boolean[rows][columns]);
//        System.out.println(gold);
        max=Math.max(gold,max);
    }

}  return max;
    }

    private int findMaxGold(int[][] arr, int i, int j, int rows, int columns, boolean[][] visitedMatrix) {
        if(i<0||j<0||j>=columns||i>=rows||arr[i][j]==0||visitedMatrix[i][j]) return 0;
        visitedMatrix[i][j]=true;
        int left=findMaxGold(arr,i,j-1,rows,columns,visitedMatrix);
    int right=findMaxGold(arr,i,j+1,rows,columns,visitedMatrix);
        int down=findMaxGold(arr,i+1,j,rows,columns,visitedMatrix);
        int up=findMaxGold(arr,i-1,j,rows,columns,visitedMatrix);
//        System.out.println(left);
        visitedMatrix[i][j]=false;
        return Math.max(left,Math.max(right,Math.max(up,down)))+arr[i][j];

    }
}
