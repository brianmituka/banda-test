package org.banda.test;

import org.banda.interview.InputReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

class InputReaderTest {

  @Test
  void OnlyValidFilesAreProcessed() {
  BufferedReader bufferedReader = InputReader.getReader("mytestFile");
    Assertions.assertNull(bufferedReader);

  }
}