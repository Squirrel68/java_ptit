package j02013_tichMaTrixVoiChuyenViCuaNo;

import java.util.Scanner;

public class Matrix {
    private int[][] matrix;

    public Matrix(int h, int c) {
        matrix = new int[h][c];
    }

    public void input(Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix chuyenVi() {
        Matrix result = new Matrix(matrix[0].length, matrix.length);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length;j++) {
                result.matrix[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public Matrix nhan (Matrix o) {
        Matrix result = new Matrix(matrix.length, o.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < o.matrix[0].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    result.matrix[i][j] += matrix[i][k] * o.matrix[k][j];
                }
            }
        }
        return result;
    }

    @Override
    public String toString()
    {
        String res = "";
        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = 0; j < matrix[0].length; ++j)
                res += Integer.toString(matrix[i][j]) + " ";
            res += "\n";
        }
        return res;
    }
}
