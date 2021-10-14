package labs.lab_5;

import javax.swing.*;

public class Viewer
{
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage java labs.lab_5.Viewer {FILE}");
            return;
        }

        String filename = args[0];

        JFrame f = new JFrame("Viewer");
        ImageIcon icon = new ImageIcon(filename);
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
    }
}