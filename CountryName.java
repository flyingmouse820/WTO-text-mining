package TPR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/** 
 * @author Hao
 * to store all the names in a HashMap, if alias exists, point them to the same key. 
 *
 */
public class CountryName {


	public static Map<String, List<String>> readCountryMap()
	{
		Map<String,List<String>> countryMap = new HashMap<String,List<String>>();
		try{
		String fileName = "D:\\countrynames.xlsx";  
		InputStream is = new FileInputStream(fileName);
	    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);  
	    XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0); 
	    
	    for(int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++ )
	    {  
	        XSSFRow xssfRow = xssfSheet.getRow(rowNum);  
	        if(xssfRow == null){  continue;   } 
	        //get the first column in the row, this is the key.
	        String mapKey = xssfRow.getCell(0).getStringCellValue();
	        List<String> list = new ArrayList<String>();
	        list.clear();
	        for(int cellNum = 1; cellNum <= xssfRow.getLastCellNum(); cellNum++)
	        {  
	          XSSFCell xssfCell = xssfRow.getCell(cellNum);    
	          if(xssfCell == null){  continue;  }  
	          list.add(xssfCell.getStringCellValue());
	          //System.out.print("   "+xssfCell.getStringCellValue());  
	        }//end column  
	        countryMap.put(mapKey, list);
	        //System.out.println();  
	    }//end row
	    
	    //-----test the results, also test if it can find the key based on a value
	    //Set<String> set = countryMap.keySet();
	    Set<String> keys = countryMap.keySet();
	    Iterator<String> iterator = keys.iterator();
	    while (iterator.hasNext()) {
	    	String key = iterator.next();
	    	System.out.println("the values in the key "+key+" are: ");
	    	List<String> arrayList = countryMap.get(key);
	     	
	    	for (Object o : arrayList) {
	     		System.out.print(o+" ");
	     		if(o.toString().equals("Congo"))
	     			System.out.println("The key of congo is: "+key);
	     	}
	     	System.out.println();
	    }
	    //-----end test results
	    
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return countryMap;
	}
	
	
}

