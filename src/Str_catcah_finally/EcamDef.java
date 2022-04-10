package Str_catcah_finally;

public class EcamDef {
public static void main(String[] args) {
	     

	try {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		int result = ecm(i,j);
		System.out.println(result);
	} catch (NumberFormatException e) {
		 System.out.println("�������Ͳ�һ��");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ȱ������������");
	}catch(ArithmeticException e) {
		System.out.println("��0");	
	}catch(EcDef e) {
		System.out.println(e.getMessage());;
	}
	System.out.println();
}
   public static int ecm(int i , int j) throws EcDef {
	   if(i < 0 || j <0) {
		   throw new EcDef("���ӻ��ĸΪ������");
	   }
	   return i / j;
   }
}
