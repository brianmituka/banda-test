package org.banda.interview;

import java.io.*;

public class InputReader {

  /**
   * A method for reading any file input
   * @param fileName
   * @return BufferedReader
   */
  public static BufferedReader getReader(String fileName){
    File fileLocation = new File(fileName);
    BufferedReader bufferedReader = null;
    try {
      FileInputStream fileInputStream = new FileInputStream(fileLocation);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    }catch (Exception e){
      e.printStackTrace();
    }

    return bufferedReader;
  }
}
