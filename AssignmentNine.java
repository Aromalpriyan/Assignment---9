import java.util.Scanner;

public class AssignmentNine {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();
        int[][] mat = new int [row][column];

        System.out.println("Enter " +(row*column) + " values for the matrix");
        for(int i = 0;i < mat.length; i++){
            for(int j = 0;j< mat[i].length;j++){
                int value = sc.nextInt();
                mat[i][j] = value;

            }
        }
int diagonalSum = 0;
int n = mat.length;
for(int i=0 ; i<n;i++){
    diagonalSum +=mat[i][i];
}
for (int i = 0; i<n;i++){
    if(i != n-1-i){
    diagonalSum += mat[i][n-1-i];
}
}
System.out.println(diagonalSum);
            }
}
