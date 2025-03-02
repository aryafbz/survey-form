import javax.swing.*;
import packages.informationPage;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("survey form");
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("survey form");
        title.setFont(new Font("Arial", Font.BOLD, 10));
        title.setBounds(10, 10, 100, 20);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Create start button
        JButton startButton = new JButton("begin!");
        startButton.setFont(new Font("Arial", Font.BOLD, 15));
        startButton.setBounds(10, 40, 100, 20);
        startButton.setHorizontalAlignment(JLabel.CENTER);
        panel.add(startButton, BorderLayout.NORTH);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
