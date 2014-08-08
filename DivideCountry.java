package TPR;

import java.io.*;
import java.util.*;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/** 
 * @author Hao
 * to try divide countries using some criteria. 
 *
 */
public class DivideCountry {

	public static void main(String[] args) { 
		 
		String fileName = "D:\\enter.docx";
		
		divideCountry(fileName);
	}
	
	public static void divideCountry(String fileName) 
	{ 
		try
		{
			InputStream is = new FileInputStream(fileName); 
		    XWPFDocument doc = new XWPFDocument(is);
		    
		    List<XWPFParagraph> paras = doc.getParagraphs();  
		    //List<XWPFRun> runs;	
		    //Map<Integer,String> map = new HashMap<Integer,String>();
		    Map<String,List<String>>  countryName = CountryName.readCountryMap();
		    
		    for (XWPFParagraph para : paras) 
		    {
		    	if(para.getParagraphText().getBytes().length<=35)
		    	{
		    		searchCountryName(para,countryName);
		    		//do sth.
		    	}
		    	
		    }//end for para
		    
		    is.close();
		}//end try
		catch (Exception e)
		{e.printStackTrace();}//end catch
		
	}//end divideCountry
	
	public static void searchCountryName(XWPFParagraph para, Map<String,List<String>> map)
	{
		//to do
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end all
