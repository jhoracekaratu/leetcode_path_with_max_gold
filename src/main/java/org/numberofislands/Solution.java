package org.numberofislands;


import java.util.List;

public class Solution {
    public int getNumberofIslands(int[][] arr) {
        int rows=arr.length;
        int collumns=arr[0].length;
        boolean [][] successorMatrix=new boolean[rows][collumns];

        //this should be a function and it will return the individual island. Now we need to call this again after incrementing
        // i and j by 1. to proceed from where we left. actually only j
int numberOfIslands=0;
        for(int i=0;i<rows;i++ ){
            for(int j=0;j<collumns;j++ ) {

                    if (arr[i][j] == 1){
                        numberOfIslands++;
                        setNeighborstoZeros(arr,i,j,rows,collumns);}


            }

        }
        System.out.println(numberOfIslands);
        return 0;
    } 

    public void setNeighborstoZeros(int[][] arr, int i, int j, int maxRows,int maxCollumns ) {
        if(arr[i][j]==0){
            return;
        }
     if(arr[i][j]==1){

         //set bto  zero then recurse in all direction
         arr[i][j]=0;



         //recurse
         if(i>-1 && i<maxRows&& j>-1&& j<maxCollumns-1&&arr[i][j+1]==1) {
             //recurse right

             setNeighborstoZeros(arr,i,j+1,maxRows,maxCollumns);
         }
         if( i>-1 && i<maxRows&& j>0&& j<maxCollumns&&arr[i][j-1]==1) {
             //recurse left
             setNeighborstoZeros(arr,i,j-1,maxRows,maxCollumns);
         }

         if(i>-1 && i<maxRows-1&& j>-1&& j<maxCollumns&&arr[i+1][j]==1) {
             //recurse up
             setNeighborstoZeros(arr,i+1,j,maxRows,maxCollumns);
         }

         if(i>0 && i<maxRows&& j>-1&& j<maxCollumns&&arr[i-1][j]==1) {
             //recurse down
             setNeighborstoZeros(arr,i-1,j,maxRows,maxCollumns);
         }
     }

    }

    public void printSuccessorMatrix( boolean [][]  matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
}
    public void printMatrix (int [][]  matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
