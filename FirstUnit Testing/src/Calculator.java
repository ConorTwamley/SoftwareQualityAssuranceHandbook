
public class Calculator {
	
	public double add(double x, double y)
	{
		double result = x+y;
		return result;
	}
	
	public double subtract(double x, double y)
	{
		double result = x-y;
		return result;
	}
	
	public double multiply(double x, double y)
	{
		double result = x*y;
		return result;
	}
	
	public double divide(double x, double y)
	{
		double result = x/y;
		return result;
	}
	
	public Boolean isNegativeNumber(int i) {
		return false;
		
	}
	
	public int addString(String numbers)
	{
		String [] parseNumbers =numbers.split(",");
		int result = 0;
		if(numbers.isEmpty())
		{
			return result;
		}
		else 
		{
			int intArray = new Integer(parseNumbers.length);
			for(int i =0; i < intArray; i++)
			{
				if(Integer.parseInt(parseNumbers[i]) < 0)
				{
					throw new IllegalArgumentException("Only positive numbers" + Integer.parseInt(parseNumbers[i]));
				}
				else
				{
					result = result + Integer.parseInt(parseNumbers[i]);
				}
			}
			return result;
		}
	}

}
