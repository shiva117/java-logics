  class Logicalpro1
  {
	  static int a[]={5,3,1,7};
	  void array()
	  {
		  for(int i=0;i<a.iength;i++)
		  {
			  System.out.println(a[i]);
	  }
	  }
	  public static void main(String[] args)
	  {
		  Logicalpro1 l=new Logicalpro1();
		  System.out.println("Before sorting");
		  l.array();
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;i<a.length;j++)
			  {
				  if(a[i]>a[j])
				  {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
		  System.out.println("After sorting");
		  l.array();
	  }
  }
		  