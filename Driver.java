import java.util.Arrays;
import java.util.Random;

public class Driver{
  public static void main(String[]args){
    Sorts sorter = new Sorts();
    if(args.length < 2){
      System.out.println("usage: java Driver SIZE ALGO [STYLE]");
      System.out.println("supported ALGO: bubble,selection,insertion,test");
      System.out.println("supported STYLE: random,equal,sorted,reversed");
    }else{


      int[] randData = new int[Integer.parseInt(args[0])];
      Random rng = new Random(1);

      //overhead: 1 random array generation.
      if(args.length < 3 || args[2].equals("random")){
        rng = new Random(100);//seed of 100 is stored.
        for(int i =  0; i < Integer.parseInt(args[0]); i++){
          randData[i] = rng.nextInt() % 1000;
        }
      }else if(args[2].equals("equal")){
        // array of all same ?
        rng = new Random(100);
        int same = rng.nextInt() % 1000;
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
          randData[i] = same;
        }
      }else if(args[2].equals("sorted")){
	      for (int i = 0; i < Integer.parseInt(args[0]); i++) {
          randData[i] = i;
        }
      } else if(args[2].equals("reversed")){
	      for (int i = 0; i < Integer.parseInt(args[0]); i++) {
          randData[i] = Integer.parseInt(args[0]) - i;
        }
      }

      if(args[1].equals("bubble")){
        sorter.bubbleSort(randData);
        //sorter.printArray(randData);
      }
      else if(args[1].equals("selection")){
        sorter.selectionSort(randData);
        //sorter.printArray(randData);
      }
      else if(args[1].equals("insertion")){
        sorter.insertionSort(randData);
        //sorter.printArray(randData);
      }

      //TEST MODE! This lets you see if your algorithm fails
      //for a particular type of array, or size of array.
      //This is not meant to be a timed test...
      else if(args[1].equals("test")){

        int[] randDataBubble = Arrays.copyOf(randData,randData.length);
        int[] randDataSelection = Arrays.copyOf(randData,randData.length);
        int[] randDataInsertion = Arrays.copyOf(randData,randData.length);
        Arrays.sort(randData);
        sorter.bubbleSort(randDataBubble);
        sorter.selectionSort(randDataSelection);
        sorter.insertionSort(randDataInsertion);

        if( Arrays.equals(randData,randDataBubble)){
          System.out.println("Bubble Correct!");
        }else{
         System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataSelection)){
          System.out.println("Selection Correct!");
        }else{
         System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataInsertion)){
          System.out.println("Insertion Correct!");
        }else{
         System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
        }
      }
    }
  }
}
