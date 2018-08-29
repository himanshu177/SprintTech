package com.wordpress.hybrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_operations {
	
	public void openurl(WebDriver wd){
		wd.get("http://demosite.center/wordpress/wp-login.php?");
	}
	public void uname(WebDriver wd) throws Exception
	{   wd.findElement(By.id("user_login")).clear();
	Thread.sleep(4000);
		wd.findElement(By.id("user_login")).sendKeys("admin");
	}

	public void pass(WebDriver wd)
{
		wd.findElement(By.id("user_pass")).clear();
	wd.findElement(By.id("user_pass")).sendKeys("demo123");
}

	public void login(WebDriver wd)
{
	wd.findElement(By.id("wp-submit")).click();
	}

	public void hover(WebDriver wd) throws InterruptedException
{
		wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	Actions A = new Actions(wd);
	A.moveToElement(wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/a[1]"))).click();
	A.build().perform();

	wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//wd.findElement(By.id("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}
 
	/*public void editprofile(WebDriver wd)
{
	wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}*/ 

   public void update(WebDriver wd, String firstName, String LastName ,String NickName, String Website, String BiographicalInfo ) throws Exception
  {
   //wd.findElement(By.id("rich_editing")).clear();  
   wd.findElement(By.id("rich_editing")).click();
   Thread.sleep(3000);
   //wd.findElement(By.id("syntax_highlighting")).clear();
   wd.findElement(By.id("syntax_highlighting")).click();
   Thread.sleep(3000);
   //wd.findElement(By.id("admin_color_fresh")).clear();
   wd.findElement(By.id("admin_color_fresh")).click();
   Thread.sleep(3000);
   //wd.findElement(By.id("comment_shortcuts")).clear();
   wd.findElement(By.id("comment_shortcuts")).click();
   Thread.sleep(3000);
   Select s= new Select (wd.findElement(By.id("locale")));
   s.selectByVisibleText("English (UK)");
   Thread.sleep(3000);
   wd.findElement(By.id("first_name")).clear();
   wd.findElement(By.id("first_name")).sendKeys(firstName);
   Thread.sleep(3000);
   wd.findElement(By.id("last_name")).clear();
   wd.findElement(By.id("last_name")).sendKeys(LastName);
   Thread.sleep(3000);
   wd.findElement(By.id("nickname")).clear();
   wd.findElement(By.id("nickname")).sendKeys(NickName);
  Thread.sleep(3000);
  wd.findElement(By.id("url")).clear();
  wd.findElement(By.id("url")).sendKeys(Website);
  Thread.sleep(3000);
  wd.findElement(By.id("description")).clear();
  wd.findElement(By.id("description")).sendKeys(BiographicalInfo);
  Thread.sleep(3000);
  wd.findElement(By.id("submit")).click();
 
  //wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  WebDriverWait wait2 = new WebDriverWait(wd, 10);
  wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.className("display-name")));
  wd.findElement(By.className("display-name")).click();

  //Actions a= new Actions(wd);
  //wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/a[1]")));
	//a.build().perform();
	//wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/div[1]/ul[1]/li[3]/a[1]")).click();


}
  
}
