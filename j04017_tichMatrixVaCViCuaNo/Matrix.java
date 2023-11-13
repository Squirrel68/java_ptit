package j04017_tichMatrixVaCViCuaNo;

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
                m[i][j]=sc.nextInt();
    }
    public Matrix trans() {
        Matrix trans = new Matrix(c,h);
        for(int i=0; i<c; i++)
            for (int j=0; j<h; j++)
                trans.m[i][j] = this.m[j][i];
        return trans;
    }

    public Matrix mul(Matrix o){
        Matrix res = new Matrix(h,o.c);
        for(int i=0; i<h; i++)
            for(int j=0; j<o.c; j++)
                for(int k=0; k<c; k++)
                    res.m[i][j] += this.m[i][k]*o.m[k][j];
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<h; i++){
            for(int j=0; j<c; j++)
                res.append(m[i][j]).append(" ");
            res.append("\n");
        }
        return res.toString();
    }
}
