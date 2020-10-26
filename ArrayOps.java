public class ArrayOps{

//4a) sum() takes an array of int, and returns a sum of the individual values in the array.
public static int[] sum(int[] arr)
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
    if(nums[i] > max)
    {
      max = arr[i];
    }
  }
  return max;
} //call function in the public static void main(String[] args)

//4c. sumRows() takes a 2D array of int, and returns a 1D array of int with each element being the sum of the individual rows of the 2D array.
public static int[] sumRows(int[][] matrix)
{
  int[]out = new int [matrix.length]; //new array
  for(int i=0; i< matrix.length; i++) //going through the columns of the array
  {
    out[i]= sum(matrix[i]);
  }
  return out;  // might have to call this function in the main
}

//4d. largestInRows() takes a nonempty 2D array of int, the inner arrays cannot be empty either, and returns a 1D array of int with each element being the largest element of the individual rows  of the 2D array.
public static  int[] largestInRows(int[][] matrix)
{
int[]out = new int[matrix.length]; //new array
for(int i=0; i< matrix.length; i++)
{
out[i] = largest(matrix[i]);
}
return out;
}

//4e) sum() takes a 2D array of int, and returns the sum of all the individual values in all of the arrays.
public static  int sum(int[][] arr) {
int sum = 0;
for (int i=0; i < matrix.length; i++)
{
sum += sum(arr[i]);
}
return sum;
}





}
