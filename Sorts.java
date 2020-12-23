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
    int n = data.length;
      for (int i = 0; i < n-1; i++) {
        int store = i;
          for (int j = i+1; j < n; j++) {
            if (data[j] < data[store]) {
              store = j;
            }
            int temp = data[store];
            data[store] = data[i];
            data[i] = temp;
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
