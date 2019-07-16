class Logical
{
	public static void main(String[] args)
	{
		String s="java";
		String s1="JAVA";
		String s2="    program";
		String s3="java is a programming language";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s1.length());
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s4[]=s3.split(" ");
		for(String ss:s4){
			System.out.println(ss);
		}
	}
}