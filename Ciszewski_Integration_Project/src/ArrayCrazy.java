import java.util.ArrayList;

// Brian ciszewski
public class ArrayCrazy {
  int[] myArray = new int[3];
  {
    myArray[0] = 0;
    myArray[1] = 1;
    myArray[2] = 2;

    int smallestNum = myArray[0];
    for (int i = myArray.length; i > 0; i--) {
      if (smallestNum > myArray[i - 1]) {
        smallestNum = myArray[i - 1];
      }

      int sum = 0;
      System.out.println(sum);
      for (int j = myArray.length; j > 0; j--) {
        sum += myArray[j - 1];
      }

      int indexNum = 0;
      int searchNum = 2;
      for (int k = myArray.length; k > 0; k--) {
        indexNum = myArray[k - 1];
        if (indexNum == searchNum) {
          break;
        }
      }
    }
  }

  int[][] myArray2 = new int[2][2];
  {
    myArray2[0][0] = 0;
    myArray2[0][1] = 1;
    myArray2[0][2] = 2;
    myArray2[1][0] = 3;
    myArray2[1][1] = 4;
    myArray2[1][2] = 5;
    myArray2[2][0] = 6;
    myArray2[2][1] = 7;
    myArray2[2][2] = 8;

    // Searches the 2d array for the number stored in 'searchNum2'.
    // Loops for the first dimension length of 3
    // checks all second dimension values in first dimension before moving to next indexes in first
    // Dimension. Breaks search when the desired number is found.
    // The index location is stored in the 'indexNum1' and 'indexNum2' variables.

    int searchNum2 = 6;
    int indexNum1 = 0;
    int indexNum2 = 0;
    for (int l = 0; l < 3; l++) {

      if (searchNum2 == myArray2[indexNum1][indexNum2]) {
        break;
      }
      indexNum1 = l;
      for (int m = 0; m < 3; m++) {
        indexNum2 = m;
        if (searchNum2 == myArray2[indexNum1][indexNum2]) {
          break;
        }
      }
    }

    // creates an arrayList class object for further functionality than the native array class
    // objects
    ArrayList<String> cars = new ArrayList<String>();
    System.out.println(cars);
  }
}
