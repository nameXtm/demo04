package ���;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {
	 Countdown cd = new Countdown();
	    JLabel caption = new JLabel("���Խ���" + cd.cs.time + "���̲�������롱" + cd.cs.input + "����ȡ����");
	    static JLabel label = new JLabel();
	    static JFrame myJF = new JFrame("�ػ�����");
	    static JButton ok = new JButton("ȷ��");
	    static JButton ca = new JButton("�˳�");
	    static JTextField edit = new JTextField(8);
	    JPanel jp01 = new JPanel();
	    JPanel jp02 = new JPanel();
	    static JPanel jp03 = new JPanel();
	    JPanel jp04 = new JPanel();
	    CloseSystem cs = new CloseSystem();

	    public MyFrame() {
	        myJF.setSize(500, 500);
	        myJF.setLocation(400, 100);
	        myJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        myJF.getRootPane().setDefaultButton(ok);//��Ӧ�س���
	        caption.setFont(new java.awt.Font("�п�", 1, 16));
	        caption.setForeground(Color.BLUE);
	        label.setFont(new java.awt.Font("�п�", 1, 24));
	        label.setForeground(Color.RED);
	        edit.setFont(new java.awt.Font("�п�", 1, 18));
	        jp01.add(caption);
	        jp02.add(edit);
	        jp03.add(label);
	        jp04.add(ca);
	        jp04.add(ok);
	        myJF.add(jp01);
	        myJF.add(jp02);
	        myJF.add(jp03);
	        myJF.add(jp04);
	        myJF.setLayout(new GridLayout(5, 1));
	        cs.close();
	        myJF.setVisible(true);

	        cd.start();

	        ok.addActionListener(new ActionListener() {
	            @SuppressWarnings("deprecation")
	            public void actionPerformed(ActionEvent e) {
	                if (edit.getText().equals(cs.input)) {
	                    cs.cancel();
	                    JOptionPane.showMessageDialog(null, "�ػ���ȡ����",
	                            "", JOptionPane.INFORMATION_MESSAGE);
	                    cd.stop(); //�߳�ֹͣ
	                    edit.setEnabled(false);
	                    ok.setEnabled(false);
	                    ca.setEnabled(false);
	                } else {
	                    JOptionPane.showMessageDialog(null, "�������",
	                            "��ʾ", JOptionPane.ERROR_MESSAGE);
	                    edit.setText("");
	                }
	            }
	        });
	        ca.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null, "ȷ��Ҫ�˳��𣿵�����Ȼ��ػ��ģ�",
	                        "��ʾ", JOptionPane.ERROR_MESSAGE);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        new MyFrame();
	    }


}
