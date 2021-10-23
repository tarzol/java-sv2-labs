package arrayofarrays;

public class ArrayOfArrays {
    void printArrayOfArrays(int[][] a) {
         for ( int i[] : a ) {
             for ( int j : i ) {
                 System.out.print(j+" ");
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        ArrayOfArrays array = new ArrayOfArrays();
        int a[][] = {{0,1,2},{0,1,2},{0,1,2}};
        array.printArrayOfArrays(a);
    }
}


