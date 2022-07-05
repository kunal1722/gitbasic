package maven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
String path = "C:\\kunal java masterclass\\seleniumdata.xlsx";
		
		FileInputStream file = new FileInputStream (path);  //to fetch data from excel sheet
		
		Workbook w = WorkbookFactory.create(file);
		Sheet s = w.getSheet("Sheet1");
		
		
		String data1 = s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komal Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

	}

}
