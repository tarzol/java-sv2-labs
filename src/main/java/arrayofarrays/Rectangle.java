package arrayofarrays;

public class Rectangle {
    public void rectangularMatrix(int size) {
        int[][] rectMatrix = new int[size][size];
        for ( int i=0; i<size; i++) {
            for (int j=0 ; j<size; j++) {
                rectMatrix[i][j] = i;
                System.out.print(rectMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(5);
    }
}

