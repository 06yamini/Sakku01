package sakkujava2;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readecxel 
{
	public static void read() throws Exception
	{
		File r = new File("./Testdata/sakshi.xlsx");
		FileInputStream fr = new FileInputStream(r);
		XSSFWorkbook wb = new XSSFWorkbook(fr);
		XSSFSheet sh = wb.getSheet("ProjectManagementData");
		XSSFRow ro = sh.getRow(0);
		XSSFCell cl = ro.getCell(0);
		System.out.println(cl.getStringCellValue());		
	}
	
	public static void main(String[] args) throws Exception
	{
		read();
	}

}
