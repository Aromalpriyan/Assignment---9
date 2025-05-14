# <p>JAVA ASSIGNEMNET<P>
# <p>Job Interview Question: Diagonal Sum<p>
## <p>Problem Statement:<p>
### <p>You are given a square matrix mat of size n x n. Your task is to calculate the sum of the two diagonals of the matrix:<p>
#### <P>1. Primary Diagonal: Includes elements where the row index equals the column index (mat[i][i]).<p>
#### <p>2. Secondary Diagonal: Includes elements where the row index + column index equals n - 1, but excludes elements also part of the primary diagonal.<p>
### <p>Example:<P>
#### <p>For a matrix mat:<p>
### 1  2  3
### 4  5  6
### 7  8  9
#### <p>• Primary Diagonal elements: 1, 5, 9<p>
#### <p>• Secondary Diagonal elements (excluding primary): 3, 5, 7<P>
#### <p>The sum of the primary and secondary diagonals in this example would be 1 + 5 + 9 + 3 + 7 = 25.<p>

## <p>Approach:<P>
### <p>1. Input Reading: Read the size of the matrix (n) and its elements from the user.<p>
### <P>2. Sum Calculation:<p>
#### <P>• Calculate the sum of the primary diagonal (mat[i][i] for all i).<p>
#### <p>• Calculate the sum of the secondary diagonal (mat[i][n-1-i] for all i except when i equals n-1-i to avoid counting the middle element twice).<p>
### <p>3. Output: Print the sum of both diagonals.<P>
## <P>Solution:<P>
```
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
```
[githublink]()
