package Array;

import java.util.ArrayList;
import java.util.List;

public class PrintInWaveForm {
    public static List<Integer> Printinwaveform(int [][]matrix){
        List<Integer> result= new ArrayList<>();
        int m= matrix.length;
        int n = matrix[0].length;
        int num =0;
        for(int col =0;col<n;col++){
            if(col%2==0){
             for(int row=0;row<m;row++){
                 num = matrix[row][col];
                 result.add(num);
             }
            }
            else if(col%2==1){
                for(int row=m-1;row>=0;row--){
                    num = matrix[row][col];
                    result.add(num);
                }
            }

        }
        return result;
    }

    static void main() {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 12, 13}
        };
        System.out.println(Printinwaveform(matrix));
    }

  }
