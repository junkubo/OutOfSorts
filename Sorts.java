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
  public static void insertionSort(int[] data) {
    int len = data.length;
    for (int i = 0; i < len - 1; i++) {
      int store = data[i + 1];
      int j = i;
      while (j >= 0 && data[j] > store) {
        data[j + 1] = data[j];
        j = j - 1;
      }
      data[j + 1] = store;
    }
  }
  public static void selectionSort(int[] data) {
    int store;
    for (i = 0; i < n - 1; i++) {
      store = i;
      for (j = i + 1; j < n; j++) {
        if (data[j] < data[store]) {
          store = j;
        }
      }
      swap(&data[store], &data[i]);
  }
  public void printArray(int[] data) {
    int len = data.length;
    for (int i = 0; i < len; i++) {
      System.out.print(" " + data[i]);
    }
  }
}
