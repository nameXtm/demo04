package Str_catcah_finally;

public class PrintStackTrace_Test {
   public static void main(String[] args) {
	 String str = "123";
     str = "abc";
   int num=0;
  
	   try {
		num = Integer.parseInt(str);
	} catch (NumberFormatException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	   
 
   }
}
