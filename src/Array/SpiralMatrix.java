package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    int m=matrix.length;
    int n=matrix[0].length;
    int startingcol=0;
    int startingrow=0;
    int endingcol=n-1;
    int endingrow=m-1;
    List <Integer> result=new ArrayList<>();
    while(startingcol<=endingcol&&startingrow<=endingrow){
        //startingrow->print,startingcol to endingcol,startingrow++
        for(int col=startingcol;col<=endingcol;col++){
            result.add(matrix[startingrow][col]);
        }startingrow++;
        //endingcol from up to down->print , startingrow to endingrow,endingcol++
        for(int row=startingrow;row<=endingrow;row++){
            result.add(matrix[row][endingcol]);
        }endingcol--;
        //endingrow from r to l->print,endingcol to startingcol,endingrow++
        if(startingrow<=endingrow){
            for(int col=endingcol;col>=startingcol;col--){
                result.add(matrix[endingrow][col]);
            }endingrow--;
        }
        //startingcol from bottom to up->print ,endingrow to startingrow,startingcol++
        if(startingcol<=endingcol){
            for(int row=endingrow;row>=startingrow;row--){
                result.add(matrix[row][startingcol]);
            }startingcol++;
        }
    }
    return result;
}
}
