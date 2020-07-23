package edu.pdx.cs410J.pkaran;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

  private static final double DELTA = 0.00001;

  @Test
  public void calculateRPNExpression_1() throws Exception {
    String expression = "20 5 /";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(4.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_2() throws Exception {
    String expression = "4 2 + 3 -";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(3.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_3() throws Exception {
    String expression = "3 5 8 * 7 + *";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(141.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_SQRT_1() throws Exception {
    String expression = "9 SQRT";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(3.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_SQRT_2() throws Exception {
    String expression = "20 4 SQRT /";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(10.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_MAX_1() throws Exception {
    String expression = "5 3 4 2 9 1 MAX";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(9.0d, result, DELTA);
  }

  @Test
  public void calculateRPNExpression_MAX_2() throws Exception {
    String expression = "4 5 MAX 1 2 MAX *";

    double result = Kata.calculateRPNExpression(expression);

    assertEquals(10.0d, result, DELTA);
  }
}
