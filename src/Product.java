
public class Product {
	private String pdCode;
	private String pdName;
	private double pdPrice;

	public Product (String pdCode,String pdName,double pdPrice) {
		this.pdCode=pdCode;
		this.pdName=pdName;
		this.pdPrice=pdPrice;
	}

	public String pdCOde() {
		return pdCode;
	}
	public String pdName() {
		return pdName;
	}
	public double pdPrice() {
		return pdPrice;
	}

	//  public String toString() {
	// 	 return pdCode+" "+pdName+" "+pdPrice;
	//  }

}
