import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyledButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Styled JButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a custom-styled JButton
        JButton styledButton = new JButton("Styled Button");
        styledButton.setUI(new CustomButtonUI());
        styledButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.setSize(800,600);
        frame.add(styledButton);
        //frame.pack();
        frame.setVisible(true);
    }

    // Custom UI delegate for the JButton
    static class CustomButtonUI extends BasicButtonUI {
        @Override
        public void installUI(JComponent c) {
            super.installUI(c);
            AbstractButton button = (AbstractButton) c;
            button.setOpaque(false);
            button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            button.setBackground(new Color(66, 139, 202)); // Set background color
            button.setForeground(Color.WHITE); // Set text color
            button.setFocusPainted(false); // Remove focus border
        }

        @Override
        public void paint(Graphics g, JComponent c) {
            AbstractButton b = (AbstractButton) c;
            ButtonModel model = b.getModel();
            Color color = b.getBackground();

            if (model.isPressed()) {
                color = color.darker();
            } else if (model.isRollover()) {
                color = color.brighter();
            }

            b.setBackground(color);
            super.paint(g, c);
        }
    }
}
