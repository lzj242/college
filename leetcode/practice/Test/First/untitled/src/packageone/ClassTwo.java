package packageone;
/*
 * @Author : 墨宣
 * @Time : 2022/6/23 16:13
 * @File : ClassTwo
 * 任务 :
 */

import javax.swing.*;
import java.awt.*;A

public class ClassTwo extends JFrame {

    public ClassTwo() {
        initialize();
    }

    private void initialize() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawPanel());
        setTitle("绘画实例1");
    }

    static class DrawPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            int OVAL_WIDTH = 80;
            int OVAL_HEIGHT = 80;
            g.drawOval(10, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.setColor(Color.red);
            g.drawOval(80, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.setColor(Color.blue);
            g.drawOval(150, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.setColor(Color.BLACK);
            g.drawOval(50, 70, OVAL_WIDTH, OVAL_HEIGHT);
            g.setColor(Color.green);
            g.drawOval(120, 70, OVAL_WIDTH, OVAL_HEIGHT);
            g.setColor(Color.pink);
        }
    }

    public static void main(String[] args) {
        new ClassTwo().setVisible(true);
    }
}

