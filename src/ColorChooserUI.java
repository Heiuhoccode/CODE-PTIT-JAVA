/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserUI extends JFrame {
    private JPanel colorPanel; // Panel trung tâm để hiển thị màu
    private JComboBox<String> colorComboBox; // ComboBox để chọn màu
    private JButton okButton; // Nút OK

    public ColorChooserUI() {
        // Thiết lập tiêu đề và kích thước của JFrame
        setTitle("Color Chooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tạo panel trung tâm để hiển thị màu
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE); // Màu mặc định là trắng
        add(colorPanel, BorderLayout.CENTER);

        // Tạo panel phía dưới chứa nút OK và combo box
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        southPanel.setSize(1000, 1000);

        // Tạo ComboBox và thêm các màu
        colorComboBox = new JComboBox<>(new String[]{"White", "Red", "Green", "Blue", "Yellow"});
        southPanel.add(colorComboBox);

        // Thêm southPanel vào BorderLayout.SOUTH của JFrame
        add(southPanel, BorderLayout.SOUTH);
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy màu từ combo box và thay đổi màu của colorPanel
                String selectedColor = (String) colorComboBox.getSelectedItem();
                switch (selectedColor) {
                    case "Red":
                        colorPanel.setBackground(Color.RED);
                        break;
                    case "Green":
                        colorPanel.setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        colorPanel.setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        colorPanel.setBackground(Color.YELLOW);
                        break;
                    default:
                        colorPanel.setBackground(Color.WHITE);
                        break;
                }
            }
        });

        // Hiển thị cửa sổ
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooserUI();
    }
}