package tpwquotes.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.Session;



/**
 * Unit test DB.
 */
public class DBTest extends TestCase
{
  /**
  * Create the test case
  *
  * @param testName name of the test case
  */
  public DBTest( String testName )
  {
    super(testName);
  }

  /**
  * @return the suite of tests being tested
  */
  public static Test suite()
  {
    return new TestSuite(DBTest.class);
  }

  public void testSessionCreate() throws Exception
  {
    Session session = null;
    
    session = DB.getSessionFactory().getCurrentSession();
    session.getTransaction().begin();
    session.getTransaction().commit();
    session.getSessionFactory().close(); 
  
    assertTrue(true);
  }
}
