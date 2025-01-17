package GUI;

import java.awt.*;
import javax.swing.*;

public class JF { 
    public static void main(String[] args) throws InterruptedException {
        // Lấy kích thước màn hình
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        while(true) {
            JFrame test1 = new JFrame("MEMORY");

            // Kích thước ngẫu nhiên cho JFrame
            int dodai = 300; // Kích thước tối thiểu là 100, tối đa là 600
            test1.setSize(dodai, dodai);

            // Vị trí ngẫu nhiên trên màn hình
            int x = (int) (Math.random() * (screenWidth - dodai));
            int y = (int) (Math.random() * (screenHeight - dodai));
            test1.setLocation(x, y);
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    
                    // Cài đặt font và căn chỉnh
                    Font font = new Font("Arial", Font.BOLD, 24);
                    g2d.setFont(font);
                    FontMetrics metrics = g2d.getFontMetrics(font);
                    g2d.setColor(Color.PINK);
                    String text = "Nhớ nhớ nhớ em <3";
                    int x = (getWidth() - metrics.stringWidth(text)) / 2;
                    int y = (getHeight() - metrics.getHeight()) / 2 + metrics.getAscent();

                    // Vẽ chữ
                    g2d.drawString(text, x, y);
                }
            };

            test1.add(panel);
            test1.setVisible(true);
            test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

            Thread.sleep(250);
        }
    }
}
