package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic {
	
	@BeforeClass
	public void beforeClass () {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
		public void beforeMethod() {
			}
	@Test
	public void TestCase1() {               // all methods after @Test will be treated as test case by testNG
		System.out.println("TC1");          // method name will be treated as test case name
	}
	
	@Test
	public void TestCase2() {
		System.out.println("TC2");
	}
	
	@AfterMethod
	public void afterMethod() {
		}
	@AfterClass
	public void afterClass() {
		System.out.println("afteraclass");
	}
	}


