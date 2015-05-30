
public class SingletonDemoTest
{

	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
//		Singleton s3 = new Singleton();
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s3);
	}

}
