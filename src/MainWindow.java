import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow{
    public MainWindow() {
        JFrame frame = new JFrame();
        frame.setTitle("Maringo Sports Club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("MARINGO SPORTS CLUB SYSTEM");
        titleLabel.setBorder(new LoginForm.RoundBorder(4) );
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setBounds(10,20,700,30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel);

        JLabel image = new JLabel(new ImageIcon("src/istockphoto-1364827675-612x612.jpg"));
        image.setBounds(340,80,400,400);
        frame.add(image);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBounds(20,50,300,400);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.CENTER;

        Dimension buttonSize = new Dimension(250,50);

        JButton registrationButton = new JButton("Membership");
        registrationButton.setFont(new Font("Arial", Font.BOLD, 18));
        registrationButton.setPreferredSize(buttonSize);
        registrationButton.setFocusable(false);
        registrationButton.setBorderPainted(false);
        registrationButton.setFocusPainted(false);

        registrationButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registrationButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registrationButton.setBorderPainted(false);
            }
        });

        JButton storeButton = new JButton("Store");
        storeButton.setFocusable(false);
        storeButton.setPreferredSize(buttonSize);
        storeButton.setFont(new Font("Arial", Font.BOLD, 18));
        storeButton.setBorderPainted(false);
        storeButton.setFocusPainted(false);

        storeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                storeButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                storeButton.setBorderPainted(false);
            }
        });

        JButton membershipButton = new JButton("Membership Fee");
        membershipButton.setFocusable(false);
        membershipButton.setFont(new Font("Arial", Font.BOLD, 18));
        membershipButton.setPreferredSize(buttonSize);
        membershipButton.setBorderPainted(false);
        membershipButton.setFocusPainted(false);
        membershipButton.setVisible(false);

        membershipButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                membershipButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                membershipButton.setBorderPainted(false);
            }
        });

        JButton facilitationButton = new JButton("Game Facilitation");
        facilitationButton.setFocusable(false);
        facilitationButton.setFont(new Font("Arial", Font.BOLD, 18));
        facilitationButton.setPreferredSize(buttonSize);

        facilitationButton.setBorderPainted(false);
        facilitationButton.setFocusPainted(false);

        facilitationButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                facilitationButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                facilitationButton.setBorderPainted(false);
            }
        });

        JButton reportsButton = new JButton("Reports");
        reportsButton.setFocusable(false);
        reportsButton.setFont(new Font("Arial", Font.BOLD, 18));
        reportsButton.setPreferredSize(buttonSize);
        reportsButton.setBorderPainted(false);
        reportsButton.setFocusPainted(false);

        reportsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                reportsButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reportsButton.setBorderPainted(false);
            }
        });

        // Button Actions (Navigate to respective interfaces)
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                openRegistrationInterface();
                new ClubMembership(frame);
            }
        });
        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openStoreInterface();
                new StoreItems(frame);
            }
        });
        membershipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        facilitationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openFacilitationInterface();
                //new GameFacilitation(frame);
            }
        });
        reportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportsInterface();
            }
        });

        // Add buttons to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(registrationButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(storeButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(membershipButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        buttonPanel.add(facilitationButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        buttonPanel.add(reportsButton,gbc);

        // Add button panel to the center of the frame
        frame.add(buttonPanel);

        // Set frame size and visibility
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    // Methods to open respective interfaces (to be implemented)
    private void openRegistrationInterface() {
        // Implement logic to open registration interface
        //new AddMember(new JFrame());
    }

    private void openStoreInterface() {
        // Implement logic to open store interface
        //new StoreItems(frame);
    }

    private void openMembershipInterface() {
        // Implement logic to open membership fee interface
    }

    private void openFacilitationInterface() {
        // Implement logic to open game facilitation interface
    }

    private void openReportsInterface() {
        // Implement logic to open reports interface
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}

