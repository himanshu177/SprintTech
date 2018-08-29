
package com.wordpress.hybrid;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class second_ReadData {
	First_operations fo= new First_operations();
	public void readdata(WebDriver wd) throws Exception
	{
		FileInputStream fis =new FileInputStream("/home/luser/Desktop/wordspress_hybrid.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFSheet sh1=wb.getSheet("Sheet2");
		for (int i=1;i<=sh1.getLastRowNum();i++)
		{ XSSFRow rw =sh1.getRow(i);
			String First_name=rw.getCell(0).getStringCellValue();
			String Last_name=rw.getCell(1).getStringCellValue();
			String Nick_name = rw.getCell(2).getStringCellValue();
			String website = rw.getCell(3).getStringCellValue();
			String Bio =rw.getCell(4).getStringCellValue();
			for (int j=0;j<=sh.getLastRowNum();j++)
			{
			XSSFRow rw1=sh.getRow(j);
			String data =rw1.getCell(2).getStringCellValue();
			if (data.equals("openurl"))
			fo.openurl(wd);
			else if(data.equals("username"))
			fo.uname(wd);
			else if (data.equals("password"))
				fo.pass(wd);
			else if (data.equals("click_login"))
			fo.login(wd);
			else if (data.equals("userprofile"))
				fo.hover(wd);
			//else if (data.equals("editprofile"))
				//fo.editprofile(wd);
			else if (data.equals("update"))
				fo.update(wd, First_name, Last_name, Nick_name, website, Bio);
			//else if (data.equals("logout"))
				//fo.logout(wd);
			
			}
			
		}
		wb.close();
	}

	

}
