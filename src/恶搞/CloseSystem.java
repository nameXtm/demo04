package ���;

public class CloseSystem {
	 Runtime rTime = Runtime.getRuntime();
	    int time = 50;//���ùػ�ʱ��
	    String input = "�Ҵ������ҵ�ԭ���Ҳ�����Ф��";

	    public void close() {
	        try {
	            rTime.exec("shutdown -s -t " + time);
	        } catch (Exception e) {
	        }
	    }

	    public void cancel() {
	        try {
	            rTime.exec("shutdown -a");//ȡ���ػ�
	        } catch (Exception e) {
	        }
	    }
}
