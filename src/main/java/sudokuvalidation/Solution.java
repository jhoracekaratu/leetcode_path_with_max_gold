package sudokuvalidation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void validateSudoku(String[][] arr) {
        //validate rows
        //validate collumns
        //validate sub-boxes
        int rowMax=arr.length;
        int collumnMax=arr[0].length;
            List list=new ArrayList<>();

            for (int i=0;i<rowMax;i++){
                for (int j=0;j<rowMax;j++){
                    String element =arr[i][j];
                    if(list.contains(element) && !element.equalsIgnoreCase(".")){
                        throw new IllegalArgumentException("Invalid sudoku with element "+element);
                    }else {
                        list.add(element);
                    }
                }
        System.out.println("Valid sudoku row");

                list.clear();
            }
    }
}
