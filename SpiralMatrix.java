public class SpiralMatrix {
    public static void main(String[] args) {
        int array[][]  = {{1,2,3},{1,2,3}
                          };
        SpiralMatrix sp = new SpiralMatrix();
        sp.displaySpiralMatrix(array,array.length-1,array[0].length-1);

    }
    public void displaySpiralMatrix(int[][] array,int row_end,int col_end){
        int row_start = 0;
        int col_start = 0;
        while(row_start<=row_end && col_start<=col_end){
            //printing the  first row

            for(int  i=col_start;i<=col_end;i++){
                System.out.print(array[row_start][i]+" ");
            }
            row_start++;

            //printing the last  column from the remaning columns
            for(int i = row_start;i<=row_end;i++){
                System.out.print(array[i][col_end]+" ");
            }
            col_end--;
            //print the last row
            if(row_start<=row_end){
                for(int i = col_end;i>=col_start;i--){
                    System.out.print(array[row_end][i]+" ");
                }
                row_end--;
            }
            if(col_start<=col_end){
                for(int i =row_end;i>=row_start;i--){
                    System.out.print(array[i][col_start]+" ");
                }
                col_start++;
            }
        }

    }

}
