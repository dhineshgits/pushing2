class Sum_of_odd
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=1;i<=20;i=i+2)
		{
			if (i%2!=0)
			{ 
              sum = sum + i;
			  System.out.println(i);
			}
			
		}
		System.out.println("The sum of odd number is " + sum);
		
	}
}
