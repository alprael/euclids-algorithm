package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidTest {

  @Test
  void gcdInt() {
  }

  @Test
  void gcdLong() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(38_593_253, 53_777_929)),
        () -> assertEquals(6791, Euclid.gcd(53_777_929,38_593_253)),
        () -> assertEquals(6791, Euclid.gcd(53_777_929, -38_593_253)),
        () -> assertEquals(1, Euclid.gcd(53_777_929, 1)),
        () -> assertEquals(1, Euclid.gcd(1, 53_777_929)),
        () -> assertNotEquals(7, Euclid.gcd(7,9))
    );
  }
}