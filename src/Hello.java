
public class Hello {
	static int num = 0;

	public static void main(String[] args) {
		System.out.println("hello world");
		p();
	}
	
	static void p(){  
		System.out.println("hello" + num);  
		num++;
		if(num <= 10) {
			p(); 
		}
	}   
}
