package com.sandbox;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("foo")
public class FooTest {

  @Test
  void shouldTestSomething() {
    System.out.println("test something");
  }
}
