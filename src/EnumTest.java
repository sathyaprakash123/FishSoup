
public class EnumTest implements InterfaceMethodTest{
	
	public enum agegroup
	{
		young,
		youth,
		old,
		onDeathbed
	}
	
	EnumTest(agegroup value)
	{
		
		if (value == agegroup.onDeathbed)
		{
			System.out.println("Adios");
		}
		
	}
	
	
	public static void main(String args[])
	{
		EnumTest et = new EnumTest(agegroup.onDeathbed);
	}


	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

}
