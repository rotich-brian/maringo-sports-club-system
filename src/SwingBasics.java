import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SwingBasics {
    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    JLabel label = new JLabel("Login Form",SwingConstants.CENTER);
    JTextField focusHandle = new JTextField();
    JTextField textField = new JTextField();

    JPasswordField passwordField = new JPasswordField();
    public SwingBasics(){

        frame.add(focusHandle);
        label.setBorder(new LoginForm.RoundBorder(3));
        label.setFont(new Font(null,Font.BOLD,16));
        label.setForeground(Color.BLUE);
        label.setBounds(130,100,150,25);
        button.setBounds(150,250,100,25);

        textField.setBounds(135,150,145,25);
        textField.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        textField.setForeground(Color.GRAY);
        textField.setText("Enter username");
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals("Enter username")) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText("Enter username");
                }
            }
        });

        passwordField.setBounds(135,200,145,25);
        passwordField.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        passwordField.setForeground(Color.GRAY);
        passwordField.setText("Enter password");
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passwordField.getText().equals("Enter password")) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passwordField.getText().isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setText("Enter password");
                    if (passwordField.getEchoChar()=='\u2022')
                        passwordField.setEchoChar((char) 0);
                }
            }
        });

        button.setFocusable(false);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.add(passwordField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SwingBasics();
    }
}
