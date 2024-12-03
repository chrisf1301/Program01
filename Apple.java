//Christopher Feuchter 
public class Apple {
	private String itemName; 
	private double itemWeight; 
	private double itemPrice;
	
	//default constructor
	public Apple()
	{
		this.itemName ="Gala"; 
		this.itemWeight =.5;
		this.itemPrice =.88; 
	}
	
	//parameterized constructor 
	public Apple(String xItemName, double xItemWeight, double xItemPrice)
	{
		this.setItemName(xItemName);
		this.setItemWeight(xItemWeight);
		this.setItemPrice(xItemPrice); 
	}
	//copy constructor 
	public Apple(Apple pc)
	{
		this.setItemName(pc.getItemName());
		this.setItemWeight(pc.getItemWeight());
		this.setItemPrice(pc.getItemPrice());
	}
	//accessors
	public String getItemName()
	{
		return this.itemName; 
	}
	
	public double getItemWeight()
	{
		return this.itemWeight; 
	}
	
	public double getItemPrice()
	{
		return this.itemPrice; 
	}
	//mutators 
	public void setItemName(String xItemName)
	{
		if (xItemName.equalsIgnoreCase("gala") || xItemName.equalsIgnoreCase("golden delicious") || xItemName.equalsIgnoreCase("red delicious") || xItemName.equalsIgnoreCase("granny smith"))
		{
			this.itemName = xItemName;
		}
		else 
		{
			System.out.println("Invalid Name"); 
		}
		
	}
	public void setItemWeight(double xItemWeight)
	{
		if (xItemWeight>=0.0 && xItemWeight<=2.0)
		{
			this.itemWeight = xItemWeight; 
		}
		else 
		{
			System.out.println("Invalid Weight"); 
		}
		
		
	}
	public void setItemPrice(double xItemPrice)
	{
		if (xItemPrice>=0.0)
		{
			this.itemPrice = xItemPrice; 
		}
		else 
		{
			System.out.println("Invalid Price"); 
		}
		
	}
	public String writeOutput()
	{
		return "Type: "+this.itemName
				+"\n Weight: "+this.itemWeight+" kg"
				+"\n Price: $"+this.itemPrice;
	}
	
	

}
