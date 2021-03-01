package net.broscorp.oop.solid.srp;

import java.util.stream.Stream;

/**
 * ! REMOVE ME !
 *
 * Solution:
 * keep all format(...) methods and extract all others to additional class generally named NumberUtils.
 * Similar names are ok.
 *
 * Explanation:
 * We have proportional number of methods for formatting and for other around-numbers logic.
 */
public interface NumberFormatter {

  String format(long number);

  String format(int number);

  String format(double number);

  String format(float number);

  String format(byte number);

  boolean isPrimeNumber(int number);

  int getPercentage(double number);

  Stream<Long> streamFibonacciNumbersUpTo(long limit);

  boolean isExactFloat(double number);

  long chooseRandomly(long... numbers);

}