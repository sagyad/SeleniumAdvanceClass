import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		data[0][0]="sagar";
		data[0][1]="London";
		data[0][2]="sagar@gmail.com";
		
		data[1][0]="Amit";
		data[1][1]="India";
		data[1][2]="Amit@gmail.com";
		
		return data;
		
	}

	@Test(dataProvider="getData")
	public void usedata(String name,String country, String email){
		System.out.println(name+ ","+country+","+ email);
	}
}