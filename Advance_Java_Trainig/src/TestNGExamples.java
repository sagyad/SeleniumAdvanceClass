import org.testng.annotations.*;

public class TestNGExamples {
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Before Test.......");
	}
	
	
	@Test(priority=2)
	public void test1() throws InterruptedException{
//		Thread.sleep(20000);
		System.out.println("Test 1..........");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method......");
	}
	
//	@Test(priority=2,timeOut=1000)
//	public void test1() throws InterruptedException{
//		Thread.sleep(20000);
//		System.out.println("Test 1..........");
//	}
	

	
	@Test(priority=1)
	public void test2(){
		System.out.println("Test 2............ ");
	}
	
	@Test(priority=1)
	public void test3(){
		System.out.println("Test 3.............");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("After Test..............");
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method......");
	}
	

}
