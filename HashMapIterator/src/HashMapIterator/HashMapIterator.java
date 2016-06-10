package HashMapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		// creamos una instancia vacía hashmap
		Map map = new HashMap();
		// insertamos los valores dentro del hashmap mediante el metodo put()
		 map.put("ONE", 1);
		 map.put("TWO", 2);
		 map.put("THREE", 3);
		 map.put("FOUR", 4);
		 map.put("FIVE", 5);
		
		 Set setOfKeys = map.keySet();
		 
		 Iterator iterator = setOfKeys.iterator();
		 
		 while (iterator.hasNext()){
			 String key = (String) iterator.next();
			 Integer value = (Integer) map.get(key);
			 System.out.println("Key: " + key + ", Value: " + value);
		 }

	}

}
