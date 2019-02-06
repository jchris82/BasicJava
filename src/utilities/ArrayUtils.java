package utilities;

public class ArrayUtils {

  public static int[] addToArray(int[] inputArray, int index, int toAdd) {
	  
	  inputArray[index] = toAdd;
	  
	  return inputArray;
  }
  
  public static int[] copyArray(int[] array, int[] newArray) {
	 
	  for (int i = 0; i < array.length; i++) {
		newArray[i] = array[i];
	  }
	  return newArray;
  }
  
  public static int[] sortArray(int[] array) {
	  for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	  return array;
  }
  
  public static int[] expandArray(int[] array) {
	  int[] tempArray = new int[array.length + 1];
	  for (int i = 0; i < array.length; i++) {
		tempArray[i] = array[i];
	}
	  return tempArray;
  }
  
  public static void main(String[] args) {
	  int[] testArray = {4,5,3,2,1};
	  int[] a = expandArray(testArray);
	  System.out.println(a[5]);
	  
  }
}

