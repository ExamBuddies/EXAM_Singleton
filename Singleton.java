
public class Singleton
{
//	static Singleton instance = null;
	static Singleton instance = new Singleton();
	private Singleton()
	{
		instance = this;
	}
	
//	public synchronized static Singleton getInstance()
//	{
//		if(instance==null)
//		{
//			new Singleton();
//		}
	public static Singleton getInstance()
	{
		return instance;
	}
}
