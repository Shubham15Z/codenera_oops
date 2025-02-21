package dec.encapsulation.pkg;

public class EncapsulationDemo 
{
	private int id;
	private String name;
	
	public EncapsulationDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	public void setId(int id)
//	{
//		this.id = id;
//	}
//	
//	public void setName(String name)
//	{
//		this.name = name;
//	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		EncapsulationDemo ob = new EncapsulationDemo(105,"Ajay");
//		EncapsulationDemo();
		System.out.println("Student Details are : "+ob.getName()+" "+ob.getId());
	}
}
