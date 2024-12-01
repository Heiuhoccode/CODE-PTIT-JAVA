/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawer extends JFrame {
    private JComboBox<String> shapeSelector;
    private JCheckBox filledCheckBox;
    private JButton colorButton;
    private JPanel canvas;
    private Color selectedColor = Color.BLACK;

    public ShapeDrawer() {
        setTitle("Shape Drawer");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel điều khiển
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // ComboBox chọn loại hình
        shapeSelector = new JComboBox<>(new String[]{"Square", "Rectangle", "Circle", "Polygon"});
        controlPanel.add(new JLabel("Select Shape:"));
        controlPanel.add(shapeSelector);

        // CheckBox chọn kiểu rỗng/đặc
        filledCheckBox = new JCheckBox("Filled");
        controlPanel.add(filledCheckBox);

        // Nút chọn màu
        colorButton = new JButton("Select Color");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose a Color", selectedColor);
                if (color != null) {
                    selectedColor = color;
                    colorButton.setBackground(selectedColor);
                }
            }
        });
        controlPanel.add(colorButton);

        add(controlPanel, BorderLayout.NORTH);

        // Canvas vẽ hình
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawShape(g);
            }
        };
        add(canvas, BorderLayout.CENTER);

        // Nút làm mới canvas
        JButton drawButton = new JButton("Draw");
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.repaint();
            }
        });
        add(drawButton, BorderLayout.SOUTH);
    }

    private void drawShape(Graphics g) {
        g.setColor(selectedColor);
        String shape = (String) shapeSelector.getSelectedItem();
        boolean filled = filledCheckBox.isSelected();
        int width = 100, height = 100, x = 200, y = 200;

        switch (shape) {
            case "Square":
                if (filled) {
                    g.fillRect(x, y, width, width);
                } else {
                    g.drawRect(x, y, width, width);
                }
                break;
            case "Rectangle":
                if (filled) {
                    g.fillRect(x, y, width * 2, height);
                } else {
                    g.drawRect(x, y, width * 2, height);
                }
                break;
            case "Circle":
                if (filled) {
                    g.fillOval(x, y, width, width);
                } else {
                    g.drawOval(x, y, width, width);
                }
                break;
            case "Polygon":
                int[] xPoints = {x, x + 50, x + 100, x + 75, x + 25};
                int[] yPoints = {y, y - 50, y, y + 75, y + 75};
                int nPoints = 5;
                if (filled) {
                    g.fillPolygon(xPoints, yPoints, nPoints);
                } else {
                    g.drawPolygon(xPoints, yPoints, nPoints);
                }
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeDrawer frame = new ShapeDrawer();
            frame.setVisible(true);
        });
    }
}
