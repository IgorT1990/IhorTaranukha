package automation.lesson8;

import java.util.*;

public class Shopping {
   public static void main(String[] args) {

      Map<String, Integer> bag = new HashMap<>();
      bag.put("Bread", 3);
      bag.put("Milk", 2);
      bag.put("Potato", 12);
      bag.put("Tomato", 7);
      bag.put("Sugar", 4);
      bag.put("Eggs", 10);

         int sum = 0;
         for (Map.Entry<String, Integer> entry : bag.entrySet())
            sum += entry.getValue();

      System.out.println(sum);
   }

}


