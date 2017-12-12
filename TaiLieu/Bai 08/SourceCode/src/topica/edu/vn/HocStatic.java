package topica.edu.vn;

public class HocStatic {
	public static int x=5;//x chính là class member
	public int y;
	
	public static void fn()
	{
		//System.out.println(y);//không được
		System.out.println(x);
	}
	public void fn2()
	{
		System.out.println(y);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
	}
}
