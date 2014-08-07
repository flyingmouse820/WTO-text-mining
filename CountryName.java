package TPR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * @author Hao
 * to store all the names in a HashMap, if alias exists, point them to the same key. 
 *
 */
public class CountryName {

	public static Map<String, List<String>> CountryMap()
	{
		Map<String,List<String>> CountryMap = new HashMap<String,List<String>>();
		List<String> list = new ArrayList<String>();
		
		list.clear();
		list.add("Albania");
		CountryMap.put("Albania", list);		
		list.clear();
		list.add("Angola");
		CountryMap.put("Angola", list);
		list.clear();
		list.add("Antigua and Barbuda");
		CountryMap.put("Antigua and Barbuda", list);
		list.clear();
		list.add("Argentina");
		CountryMap.put("Argentina", list);
		list.clear();
		list.add("Armenia");
		CountryMap.put("Armenia", list);
		list.clear();
		list.add("Australia");
		CountryMap.put("Australia", list);
		list.clear();
		list.add("Austria");
		CountryMap.put("Austria", list);
		list.clear();
		list.add("Bahrain, Kingdom of");
		list.add("Kingdom of Bahrain");
		list.add("Bahrain");
		//both "Bahrain, Kingdom of" and "Kingdom of Bahrain" represents the Kingdom of Bahrain.
		CountryMap.put("Bahrain, Kingdom of", list);
		
		//more countries to go
		
		return CountryMap;
	}
	
	
}

