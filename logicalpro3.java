class Logicalpro3
{
	public static void main(String[] args)
	{
		int n=2434;
		int sum=0;
		while (n>0)
		{
			int n1=n%10;
			sum=sum+n1;
			n=n/10;
		}
				System.out.println("the sum of digits of given num is:"+sum);
			}
		}
	
