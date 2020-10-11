import java.util.HashMap;
import java.util.Map;

public class Exercise {
	public static void main (String []args) {


    //create five product objects

		ProductBean p1=new ProductBean();
		p1.setPdCode("01");
		p1.setPdName("iPhone");
		p1.setPdPrice(899.99);

		ProductBean p2=new ProductBean();
		p2.setPdCode("02");
		p2.setPdName("MacBook");
		p2.setPdPrice(1999.99);

		ProductBean p3=new ProductBean();
		p3.setPdCode("03");
		p3.setPdName("iPad");
		p3.setPdPrice(699.99);

		ProductBean p4=new ProductBean();
		p4.setPdCode("04");
		p4.setPdName("iWatch");
		p4.setPdPrice(599.99);

		ProductBean p5=new ProductBean();
		p5.setPdCode("05");
		p5.setPdName("AirPods");
		p5.setPdPrice(199.99);

		Map <String, Object > map = new HashMap();

    //Add keys and values to map
		map.put("01",p1);
		map.put("02",p2);
		map.put("03",p3);
		map.put("04",p4);
		map.put("05",p5);


		   for (Map.Entry<String, Object>m:map.entrySet())
		{
			  //added pdCode by user and validation
		    if (m.getKey()== "02")
		    System.out.println(m.getValue());
		}

	}
}
