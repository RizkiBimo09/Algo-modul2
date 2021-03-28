package Matriks;
public class TransposeMatriks_4 {
    public static void main(String[] args){
    int[][] W = {
            {2,1,-5},
            {3,4,2}
        };
        int[][] transpose = new int[7][7];
        for (int i=0; i < W.length; i++){
            for (int j=0; j< W [0].length; j++){
                transpose[j][i] = W [i][j];
            }
            System.out.println();
        }
        for (int i=0; i < W [0].length; i++){
            for (int j=0; j < W .length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rizki Bimo Wijaya");
    }
}
