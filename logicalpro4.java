class Logicalpro4
{
	public static void main(String[] args)
	{
		int n=81;
		int temp=n;
		int sum=0;
		while (n>0)
		{
			int n1=n%10;
			sum=sum+n1;
			n=n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("the given num is niven number");
		}else
		{
			System.out.println("the given num is niven num is not niven");
		}
	}
}
		