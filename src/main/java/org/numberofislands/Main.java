package org.numberofislands;

public class Main {
    public static void main(String[] args) {
        int [][] arr={
                {1,1,0,0},
                {0,0,0,1},
                {1,0,1,0}
        };

        Solution solution=new Solution();
        int sum=solution.getNumberofIslands(arr);
        solution.printMatrix(arr);
//        System.out.println();
//solution.setNeighborstoZeros(arr,0,0,arr.length,arr[0].length);
//solution.printMatrix(arr);
    }

}
