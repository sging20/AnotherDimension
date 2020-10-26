//4a) sum() takes an array of int, and returns a sum of the individual values in the array.
public int[] sum(int[] arr)
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
