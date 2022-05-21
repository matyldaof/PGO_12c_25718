package cwiczenia4.zad2;
import java.util.Arrays;
public class Matrix {
    private int[][] content;
    private Matrix() {
    }

    static Matrix add(Matrix matrixA, Matrix matrixB) {
        for(int i = 0; i<=tablica.length; i++){
            for(int j = 0; j<=tablica[i].length; j++){
                matrixtmp.setElement(matrixtmp,i,j,matrixA.getElement(matrixA, i, j)+ matrixB.getElement(matrixB,i,j));
            }
        }
        return matrixtmp;
    }
    static Matrix subtract(Matrix matrixA, Matrix matrixB) {
        for(int i = 0; i<=tablica.length; i++){
            for(int j = 0; j<=tablica[i].length; j++){
                matrixtmp.setElement(matrixtmp,i,j,matrixA.getElement(matrixA, i, j)- matrixB.getElement(matrixB,i,j));
            }
        }
        return matrixtmp;
    }
    public void print() {
        for (int i = 0; i < content.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < content[i].length; j++) {
                var current = content[i][j];
                System.out.print(current);
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }