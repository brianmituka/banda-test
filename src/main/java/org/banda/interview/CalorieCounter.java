package org.banda.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class CalorieCounter {

  public static void main(String[] args) throws IOException {
    PriorityQueue<Integer> elfTotalCalories = getHighestCaloriesCount("file.txt");
    Integer topThreeTotal = getTotalTopKElfCalories(elfTotalCalories, 3);
    System.out.println(("Top 3 elf totals:: " + topThreeTotal));
    System.out.println("Highest Calories Total :: " + elfTotalCalories.poll());
  }

  /**
   *
   * @param inputFile The file where we get Our input from
   * @return Max Heap with the total calories of every elf stored from largest to smallest
   * @throws IOException
   */
  public static PriorityQueue<Integer> getHighestCaloriesCount(String inputFile) throws IOException {
    /**
     * Use a Max Heap to store the Sums that we will compute
     * After parsing the file and getting all the totals for every elf and adding them to the Heap,
     * we can call Heap.poll() to get the element at the top of the Heap
     */
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    BufferedReader reader = InputReader.getReader(inputFile);
    int sum = 0;


    String strLine;
    while ((strLine = reader.readLine()) != null )   {
      if (strLine.isEmpty()){
        priorityQueue.add(sum);
        sum = 0;
      }else{
        sum += Integer.parseInt(strLine);
      }
      }
     reader.close();
    return priorityQueue;
  }

  /**
   *
   * @param ranking The max Heap we get from getting the elf with the highest number of calories
   * @param k the top elements we want to get their total values
   * @return total of the top K elements
   */

  public static Integer getTotalTopKElfCalories( PriorityQueue<Integer> ranking, int k){
    if (k > ranking.size()){
      return 0;
    }
    int sum = 0;
    for (int i = 0; i <k ; i++) {
      sum+= ranking.poll();
    }
    return sum;
  }
}
