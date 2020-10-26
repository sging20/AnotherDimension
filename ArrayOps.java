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
