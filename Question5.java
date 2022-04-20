import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("State the number of integers you wish to use: ");
    int integer = in.nextInt();
    HashMap<Integer, Integer> numberhashmap = new HashMap<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= integer; i++) {
      //System.out.print("Enter number " + i + ": ");
      int number = in.nextInt();
      if (numberhashmap.containsKey(number) == false) {
        numberhashmap.put(number, 1);
        numbers.add(number);
      }
      else {
        numberhashmap.put(number, numberhashmap.get(number) + 1);
      }
    }
    int mode = -1;
    int countmax = -1;
    for(int x : numbers) {
      int count = numberhashmap.get(x);
      if (count > countmax) {
        mode = x;
        countmax = count;
      }
    }
    System.out.println(mode);  
  }
}
