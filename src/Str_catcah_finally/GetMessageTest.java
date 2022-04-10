package Str_catcah_finally;

public class GetMessageTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 String str = "123";
	     str = "abc";
	   int num=0;
	   try {
		   num = Integer.parseInt(str);
		   
	   }catch(Exception e) {
		  System.out.println(e.getMessage());
	   }
	}

}
