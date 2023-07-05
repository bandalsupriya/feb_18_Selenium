package pompolicyuseingTestNGExcel;

import org.testng.annotations.DataProvider;

public class PolicyDataProvider 
{
	@DataProvider(name="myFBdata") 
    public static String[][] testData() 
   { 
    String data[][]= 
   {{"Yogendra","Joshi","9421357890"},{"Dnyaneshwar","Parsewar","8888888888"},{"abc","xyz","1234"}}; 
    return data; 
   } 

}
