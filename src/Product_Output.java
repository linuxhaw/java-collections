import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;

public class Product_Output {
	public static void main (String []args){

		//create five product objects

		Product pd1 = new Product("code01","phone",899.00);
		Product pd2 = new Product("code02","watch",299.00);
		Product pd3 = new Product("code03","tablet",500.00);
		Product pd4 = new Product("code04","laptop",1999.00);
		Product pd5 = new Product("code05","headphone",399.00);

		Map <String,String> map = new HashMap();

		// Add keys and values to map

		map.put("code01","pd1");
		map.put("code02","pd2");
		map.put("code03","pd3");
		map.put("code04","pd4");
		map.put("code05","pd5");


		   //input pdCode by user
		   String i = map.get("code03");

		   //validation pdCode
		   for (Map.Entry<String, String>m:map.entrySet())
		    if (i== m.getValue())
		    {
		    	System.out.println(m.getKey()+" "+i);
//		    	System.out.println(map);
			}

//		    else {
//
//		    	System.out.println("Something || Error Msg");
//			}





	}
}
