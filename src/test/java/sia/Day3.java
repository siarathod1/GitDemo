package sia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

 @Test
 public void webLoginCarLoan()
 {
	 System.out.println("webLoginCarLoan");
	 System.out.println("CarLoan");

	 
 }
 
 @Test(groups= {"Smoke"})
 public void mobileSigninCarLoan()
 {
	 System.out.println("mobileLoginCarLoan");

 }
 @Parameters({"URL"})
 @Test
 public void mobileLogoutCarLoan(String urlname)
 {
	 System.out.println("mobileLoginCarLoan");
     System.out.println(urlname);
 }
 @Parameters({"URL"})
 @Test
 public void mobileLoginCarLoan(String url)
 {
	 System.out.println("mobileLoginCarLoan");
	 System.out.println(url);

 }
 @Test
 public void apiLoginCarLoan()
 {
	 System.out.println("apiLoginCarLoan");

 }
}
