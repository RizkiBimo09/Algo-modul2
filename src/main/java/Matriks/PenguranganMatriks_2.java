package Matriks;
public class PenguranganMatriks_2 {
    public static void main(String[] args) {
    int[][] A = {
      {6, 4},
      {4, 8},
      {2, 4}
    } ;
      
    int[][] B = {
      {5, 3},
      {3, 5},
      {6, 3}
    };
    int[][] HasilTambah = new int[A.length][A[0].length];
    if((A.length == B.length) && (A[0].length == B[0].length)) {
      for(int i=0; i<A.length; i++) {
        for(int j=0; j<A[0].length; j++) {
           HasilTambah[i][j] = A[i][j] - B[i][j];
           System.out.print(HasilTambah[i][j]+" ");
        }  
          System.out.println();
        }
    }   
    else{
      System.out.println("\n baris dan kolom matriks tidak sama");
    }
    System.out.println("Rizki Bimo Wijaya");
  }
}


    

