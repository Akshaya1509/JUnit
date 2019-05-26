package employee.test;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

class Foo {
	public static void getQuotient(int a, int b) {
		int q = a/b;
		while (true);
	}
}

public class Demo {
	
	@Test (timeout = 1000)
	public void testGetQuotient() {
		System.out.println("in test");
		Foo.getQuotient(10, 5);
	}
}
