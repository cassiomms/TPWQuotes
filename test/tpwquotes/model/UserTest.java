package tpwquotes.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test User.
 */
public class UserTest extends TestCase
{
  /**
  * Create the test case
  *
  * @param testName name of the test case
  */
  public UserTest( String testName )
  {
    super(testName);
  }

  /**
  * @return the suite of tests being tested
  */
  public static Test suite()
  {
    return new TestSuite(UserTest.class);
  }

  public void testModel()
  {
    assertTrue(true);
  }
}
