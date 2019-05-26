package pkg1;

import org.junit.After;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestJunit3 extends TestResult {
   // add the error
   public synchronized void addError(Test test, Throwable t) {
      super.addError((junit.framework.Test) test, t);
   }

   // add the failure
   public synchronized void addFailure(TestJunit3 test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }
	
   @Test
   public void testAdd() {
      // add any test
	  Assert.assertEquals("ak", "ak");
   }
   
   // Marks that the test run should stop.
   public synchronized void stop() {
      //stop the test here
	  
   }
   
   @After
   public void tearDown() {
	   
   }
   
}