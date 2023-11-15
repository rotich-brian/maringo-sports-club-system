import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindoww {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Maringo Sports Admin");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null); // Center the frame on the screen

            JPanel mainPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10); // Insets for components
            gbc.anchor = GridBagConstraints.WEST;

            //ClubMember clubMember = new ClubMember();

            JTextField txtUsername = new JTextField(20);
            JPasswordField txtPassword = new JPasswordField(20);

            // Adding components with GridBagConstraints
            gbc.gridx = 2;
            gbc.gridy = 0;
            mainPanel.add(new JLabel("Admin Page Login"), gbc);

            // Adding components with GridBagConstraints
            gbc.gridx = 0;
            gbc.gridy = 2;
            mainPanel.add(new JLabel("UserName:"), gbc);
            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            mainPanel.add(txtUsername, gbc);

            // Password
            gbc.gridx = 0;
            gbc.gridy = 3;
            mainPanel.add(new JLabel("Password:"), gbc);
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            mainPanel.add(txtPassword, gbc);


            // Login Button
            JButton loginButton = new JButton("Log In");
            gbc.gridx = 1;
            gbc.gridy = 12;
            gbc.gridwidth = 1;
            mainPanel.add(loginButton, gbc);

            // Re Button Action Listener
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                    //NewWindow newWindow = new NewWindow();
                    new GameFacilitation(frame);

                }
            });

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }

    // Utility method to create a panel with the Gender radio buttons
    private static JPanel createGenderPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(new JRadioButton("Male"));
        panel.add(new JRadioButton("Female"));

        return panel;
    }
}
