package converter;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
//
import org.junit.Test;


/**
 * TestFrame for grade converter (Notenpunkte -> "alte Schulnote")
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/05
 */
public class UnitTestFrame {

  final static private int commonLimit = 4_000; // timeout resp. max. number of ms for test



  @Test(timeout = commonLimit)
  public void test0NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(0);
    assertEquals("6", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test1NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(1);
    assertEquals("5-", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test2NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(2);
    assertEquals("5", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test3NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(3);
    assertEquals("5+", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test4NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(4);
    assertEquals("4-", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test5NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(5);
    assertEquals("4", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test6NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(6);
    assertEquals("4+", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test7NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(7);
    assertEquals("3-", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test8NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(8);
    assertEquals("3", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test9NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(9);
    assertEquals("3+", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test10NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(10);
    assertEquals("2-", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test11NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(11);
    assertEquals("2", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test12NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(12);
    assertEquals("2+", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test13NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(13);
    assertEquals("1-", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test14NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(14);
    assertEquals("1", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void test15NP() {
    final GradeConverter gc = new GradeConverter();
    final String grade = gc.convertGrade(15);
    assertEquals("1+", grade);
  }// method()

  @Test(timeout = commonLimit)
  public void testXXNP() {
    doTestRaisingException(16);
    doTestRaisingException(42);
    doTestRaisingException(1_000);
    doTestRaisingException(1_000_000);
    doTestRaisingException(-1);
    doTestRaisingException(-13);
    doTestRaisingException(Integer.MIN_VALUE);
  }// method()
   //

  private void doTestRaisingException(final int testValue) {
    final GradeConverter gc = new GradeConverter();
    String grade = "grade still needs to be computed";
    boolean success = false;
    try {
      grade = gc.convertGrade(testValue);
    } catch (final Throwable ex) {
      success = (ex instanceof AssertionError) || (ex instanceof IllegalArgumentException);
      if (!success)
        throw (ex);
    } // try
    if (!success)
      fail(String.format("unexpected behavior for \"%d\" -> \"%s\"", testValue, grade));
  }// method()

}// class
