package OrangeHRM;

import java.io.IOException;

import org.testng.annotations.Test;

public class Testcases extends BaseClass
{
  Login LG;
  
  @Test
  
  void Logintest() throws IOException, InterruptedException
  {
	  LG=new Login();
	  
	  LG.validlogin();
  }
 
}
