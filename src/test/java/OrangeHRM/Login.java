package OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Login extends BaseClass
{
	Elements ele;
	
	void validlogin() throws IOException, InterruptedException
	{
		ele= new Elements();
		int row=Utility.getRowCount(Location, "Sheet1");
		int cell=Utility.getCellCount(Location, "Sheet1", row);
		 for (int i=1;i<=row;i++)
    	 {
    		 XSSFRow currentrow= Utility.ws.getRow(i);
    		 
    		 for (int j=0;j<cell;j++)
    		 {
    			 XSSFCell user= currentrow.getCell(j);
         		//String Value= user.toString();
         		j=j+1;
         		XSSFCell pass= currentrow.getCell(j); 
         		//System.out.print(user.toString()+ "           ");
             	//	System.out.println(pass.toString());
             		driver.findElement(By.name("username")).clear();
             		driver.findElement(By.name("username")).sendKeys(user.toString());
             		Thread.sleep(2000);
             		driver.findElement(By.name("password")).clear();
             		driver.findElement(By.name("password")).sendKeys(pass.toString());
             		Thread.sleep(2000);
             		driver.findElement(By.xpath("//button[@type='submit']")).click();
             		Thread.sleep(2000); 
             		try
             		{

       		    	 driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
       		    	 System.out.println("Test Failed");
       		    	  TakesScreenshot ts= (TakesScreenshot) driver;
  		               File login= ts.getScreenshotAs(OutputType.FILE);
  		               File trg= new File(screenshots+currentDate+"_"+"LoginFail.png");
  		               FileUtils.copyFile(login,trg);
             		}
             		
             		catch(Exception e)
             		{
             			System.out.println("Test Pass");
         		    	  TakesScreenshot ts= (TakesScreenshot) driver;
    		             File login= ts.getScreenshotAs(OutputType.FILE);
    		          File trg= new File(screenshots+currentDate+"_"+"LoginPass.png");
    		          FileUtils.copyFile(login,trg);
    		          System.out.println("Checking the code");
             		}
             		
    		 }
    		 
    	 }
	}
    		
	}
	

