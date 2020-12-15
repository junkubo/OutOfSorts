public class Sorts {
  public static void bubbleSort(int[] data) {
    int len = data.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int store = data[j];
          data[j] = data[j + 1];
          data[j + 1] = store;
        }
      }
    }
  }
  public void printArray(int[] data) {
    int len = data.length;
    for (int i = 0; i < len; i++) {
      System.out.print(" " + data[i]);
    }
  }
}
