package dataproviderUse;

import org.testng.annotations.DataProvider; 
public class DataProviderTest  
{ 
   @DataProvider(name="myFBdata") 
     public static String[][] testData() 
    { 
     String data[][]= 
    {{"Yogendra","Joshi","9421357890"},{"Dnyaneshwar","Parsewar","8888888888"},{"abc","xyz","1234"}}; 
     return data; 
    } 
   @DataProvider(name="rediff") public static String[][] testDatarediff() 
    { 
     String data[][]= 
     {{"Mahesh","Sir","98989898"},{"Pramod","Patil","8888888888"},{"pqr","lmn","1234"}}; 
     return data; 
    } 
}
