package ���;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Countdown extends Thread{
	CloseSystem cs = new CloseSystem();
    String afx;

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cs.time--;
            if (cs.time == 5) {//��ֻʣ��5��ʱ
                JLabel sb = new JLabel("����ʱ������ȷ����������");
                sb.setFont(new java.awt.Font("����", 1, 24));
                sb.setBackground(Color.GREEN);
                JPanel pa = new JPanel();
                pa.add(sb);
                MyFrame.myJF.add(pa);
                MyFrame.myJF.setVisible(true);
                MyFrame.edit.setVisible(false);
                MyFrame.ca.setEnabled(false);
                MyFrame.ok.setEnabled(false);
            }
            afx = "����ʱ��" + cs.time;
            MyFrame.label.setText(afx);
            MyFrame.jp03.add(MyFrame.label);
            if (cs.time == 0) {
                System.exit(0);
            }
        }
    }
}
