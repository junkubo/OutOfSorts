public class Tester {
  public static void main(String args[]) {
    int data[] = {5, 4, 6, 3, 7, 2, 8, 1, 9};
    int data1[] = {1, 2, 3, 4, 5};
    int data2[] = {5, 4, 3, 2, 1};
    int data3[] = {1, 3, 3, 3, 2, 2, 5, 5, 5, 5, 5, 4, 4, 4, 4};
    int data4[] = {};
    Sorts sorter = new Sorts();
    sorter.insertionSort(data);
    sorter.printArray(data);
    sorter.insertionSort(data1);
    sorter.printArray(data1);
    sorter.insertionSort(data2);
    sorter.printArray(data2);
    sorter.insertionSort(data3);
    sorter.printArray(data3);
    sorter.insertionSort(data4);
    sorter.printArray(data4);


  }
}
