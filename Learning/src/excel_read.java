import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import com.google.cloud.firestore.Firestore;
//import com.google.cloud.firestore.FirestoreOptions;
public class excel_read {

	public static void main(String[] args) {
		//String value=null;          //variable for storing the cell value  
		Workbook wb=null;           //initialize Workbook null  
		  
		 
		//reading data from a file in the form of bytes  
		try  
		{  
		//reading data from a file in the form of bytes  
		FileInputStream fis=new FileInputStream("C:\\Users\\panwa\\Desktop\\dataoffline.xlsx");  
		//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
		wb=new XSSFWorkbook(fis);  
		}  
		catch(FileNotFoundException e)  
		{  
		e.printStackTrace();  
		}  
		catch(IOException e1)  
		{  
		e1.printStackTrace();  
		}   
		 
		  
		Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
		Row row=sheet.getRow(1); //returns the logical row  
		Cell cell=row.getCell(1); //getting the cell representing the given column  
		String value=cell.getStringCellValue();
		System.out.println(value);

	}

}
