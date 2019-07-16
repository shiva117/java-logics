class Logicalpro
{
	static int a[]={5,3,1,7};
	void array()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
	}
	}
	public static void main(String[] args)
	{
		Logicalpro l=new Logicalpro();
		System.out.println("Before reverse");
		l.array();
	for(int i=0;i<a.length/2;i++)
	{
		int temp=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=temp;
	}
	System.out.println("After reverse");
	l.array();
}
}