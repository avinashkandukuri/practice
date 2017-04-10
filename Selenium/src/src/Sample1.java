package src;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {
	@BeforeTest
	public void beforetest() {
		System.out.println("@Beforetest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforclass");
	}

	@Test
	public void test2() {
		System.out.println("@test2");
	}

	@Test
	public void test3() {
		System.out.println("@test3");
	}

	@Test
	public void test4() {
		System.out.println("@test4");
	}

	@Test
	public void test5() {
		System.out.println("@test5");
	}

	@Test
	public void test6() {
		System.out.println("@test6");
	}

	@Test
	public void test7() {
		System.out.println("@test7");
	}

	@Test
	public void test8() {
		System.out.println("@test8");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
	}

	@Test
	public void test10() {
		System.out.println("@test10");
	}

	@AfterTest
	public void Aftertest() {
		System.out.println("@Aftertest");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}
}
