public class ArrayOps{

//4a) sum() takes an array of int, and returns a sum of the individual values in the array.
public static int sum(int[] arr)
{
  int sum= 0;
  for(int i=0; i<arr.length; i++)
  {
    sum += arr[i];
  }
  return sum; // might have to call this function in the main
}

//4b). largest() takes an array of int, and returns the largest element of the array.
public static  int largest(int[]arr)
{
  int max = arr[0];
  for(int i=0; i<arr.length; i++)
  {
    if(arr[i] > max)
    {
      max = arr[i];
    }
  }
  return max;
} //call function in the public static void main(String[] args)

//4c. sumRows() takes a 2D array of int, and returns a 1D array of int with each element being the sum of the individual rows of the 2D array.
public static int[] sumRows(int[][] matrix)
{
  int[] out = new int [matrix.length]; //new array
  for(int i=0; i< matrix.length; i++) //going through the columns of the array
  {
    out[i]= sum(matrix[i]);
  }
  return out;  // might have to call this function in the main
}

//4d. largestInRows() takes a nonempty 2D array of int, the inner arrays cannot be empty either, and returns a 1D array of int with each element being the largest element of the individual rows  of the 2D array.
public static  int[] largestInRows(int[][] matrix)
{
int[] out = new int[matrix.length]; //new array
for(int i=0; i< matrix.length; i++)
{
out[i] = largest(matrix[i]);
}
return out;
}

//4e) sum() takes a 2D array of int, and returns the sum of all the individual values in all of the arrays.
public static  int sum(int[][] arr) {
int sum = 0;
for (int i=0; i < arr.length; i++)
{
sum += sum(arr[i]);
}
return sum;
}

//5a) sumCols takes a 2D array that must be rectangular (all rows have the same length) and returns
//a 1D array of int with each element being the sum of the individual columns of the 2D array.
public static int[] sumCols(int[][] matrix)
{
  int[] out = new int[matrix[0].length];
  for(int i=0; i< matrix.length; i++)
  {
    for(int j=0; j< out.length; j++)
    {
      out[j] += matrix[i][j];
    }
  }
return out;
}

//5b) isRowMagic() takes a rectangular 2d array and returns true when each row has the same sum, and false otherwise.
public static boolean isRowMagic(int[][] matrix) {
  boolean isMagic = true;
  int[] sum = sumRows(matrix);
  for(int i=0; i<matrix.length -1; i++)
  {
    if(sum[i] != sum[i+1])
    {
      isMagic = false; //as the law says, Innocent until proven GUILTY!
    }
  }
  return isMagic;
}
//5c) isColMagic()  takes a rectangular 2d array and  returns true when each column has the same sum, and false otherwise.
public static boolean isColMagic(int[][] matrix) {
for(int i=0; i<matrix[1].length-1; i++)
{
  if(ArrayOps.sumCols(matrix)[0]!=ArrayOps.sumCols(matrix)[i])
  {
    return false; //as the law says, Innocent until proven GUILTY!
  }
}
return true;
}


//5d)  isLocationMagic()  takes a rectangular 2d array and returns true when the row and column specified have the same sum.
public static boolean isLocationMagic(int[][] matrix, int row, int col)
{
int[] Rows = sumRows(matrix);
int[] Cols= sumCols(matrix);
  if(Rows[row] != Cols[col])
  {
    return false;
  }
  else return true;
}

}
