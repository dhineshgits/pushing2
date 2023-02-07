class Sum_of_even 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=0;i<=20;i+=2)
		{
			if (i%2==0)
			{ 
              sum = sum + i;
			  System.out.println(i);
			}
			
		}
		System.out.println("The sum of  even number is " + sum);
		
	}
}
