package j04016_tichHaiDoiTuongMaTran;

import java.util.Scanner;

public class Matrix {
    private int[][] m;
    private int h,c;

    public Matrix(int h, int c) {
        this.h = h;
        this.c = c;
        this.m = new int[h][c];
    }

    public void nextMatrix(Scanner sc) {
        for(int i=0; i<h; i++)
            for (int j=0; j<c; j++)
                m[i][j] = sc.nextInt();
    }

    public Matrix mul(Matrix o){
        int newH = this.h, newC = o.c;
        Matrix res = new Matrix(newH,newC);
        for (int i=0; i<newH; i++)
            for (int j=0; j<newC; j++)
                for (int k=0; k<this.c; k++)
                    res.m[i][j] += this.m[i][k] * o.m[k][j];
        return res;
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0; i<h; i++) {
            for (int j = 0; j < c; j++) {
                res += m[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
