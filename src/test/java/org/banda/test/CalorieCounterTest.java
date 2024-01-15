package org.banda.test;

import org.banda.interview.CalorieCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.PriorityQueue;

class CalorieCounterTest {

  @Test
  void highestCaloriesCountIsCorrectlyReturned() throws IOException {
   PriorityQueue<Integer> calories = CalorieCounter.getHighestCaloriesCount("testfile.txt");
    Assertions.assertEquals(25759, calories.poll());
  }
}