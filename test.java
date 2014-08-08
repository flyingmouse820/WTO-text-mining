package TPR;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Hao
 * Temporary test function
 */
public class test {

	public static void main(String[] args) { 
	
		try{
		String string = "Lao People’s Democratic Republic";
		String string2 = "test";
		
		System.out.println(string.getBytes().length);
		string = string.toLowerCase();
		System.out.println(string);
		string2 = string2.toLowerCase();
		System.out.println(string.equals(string2));
		
		String fileName = "D:\\testname.xlsx";  
		InputStream is = new FileInputStream(fileName);
	    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);  
	      
	    // 循环工作表Sheet  
	    for(int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++){  
	      XSSFSheet xssfSheet = xssfWorkbook.getSheetAt( numSheet);  
	      if(xssfSheet == null){  
	        continue;  
	      }  
	        
	      // 循环行Row   
	      for(int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++ ){  
	        XSSFRow xssfRow = xssfSheet.getRow( rowNum);  
	        if(xssfRow == null){  
	          continue;  
	        }  
	          
	        // 循环列Cell     
	        for(int cellNum = 0; cellNum <= xssfRow.getLastCellNum(); cellNum++){  
	          XSSFCell xssfCell = xssfRow.getCell( cellNum);  
	          if(xssfCell == null){  
	            continue;  
	          }  
	          System.out.print("   "+xssfCell.getStringCellValue());  
	        }  
	        System.out.println();  
	      }  
	    } 
	}catch (Exception e){
		e.printStackTrace();
	}
		
		
	}
}
