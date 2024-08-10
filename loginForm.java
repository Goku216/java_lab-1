import javax.swing.*;
import java.awt.*;

public class Fall20184a {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel nameLabel = new JLabel("Enter Name: ");
        gbc.gridx =0;
        gbc.gridy = 0;
        panel.add(nameLabel,gbc);


        JTextField nameField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField,gbc);

        JLabel addressLabel = new JLabel("Enter Address: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(addressLabel,gbc);


        JTextField addressField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(addressField,gbc);

        JLabel genderLabel = new JLabel("Gender");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(genderLabel,gbc);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        JPanel p = new JPanel();
        p.add(male);p.add(female);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(p,gbc);

        JLabel cityLabel = new JLabel("City: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(cityLabel,gbc);
        DefaultListModel<String> city = new DefaultListModel<>();
        city.addElement("Biratnagar");
        city.addElement("Kathmandu");
        city.addElement("Bhaktapur");
        city.addElement("Pokhara");
        JList<String> citylist = new JList<>(city);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(citylist,gbc);

        JButton submit = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(submit,gbc);
        JButton cancel = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(cancel,gbc);





        frame.add(panel);
        frame.setVisible(true);


    }
}
