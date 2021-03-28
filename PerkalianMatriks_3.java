package Matriks;
public class PerkalianMatriks_3 {
    public static void main(String[] args){
    int[][] R = {
      {5,6,7},       
      {1,4,8}
      
    };
    int[][] B = {
      {9,2},           
      {1,7},
      {4,2}
    };
    
    if(R[0].length == B.length) {
        
      int[][] W = new int[R.length][B[0].length];
        for(int i=0; i<R.length; i++) { 
          for(int j=0; j<B[0].length; j++) {
             for(int k=0; k<R[0].length; k++) {
                W[i][j] = W[i][j] + (R[i][k] * B[k][j]); 
             } 
          }  
        }
        for(int[] w: W) {
          for(int i: w) {
             System.out.print(i+" "); 
          }  
          System.out.println();
        }
        System.out.println("Rizki Bimo Wijaya");
    }
   
            }
    }
    

