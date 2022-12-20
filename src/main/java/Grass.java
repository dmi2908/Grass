import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grass {
    static int width = 800, height = 600;
    static JFrame frame = new JFrame();
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("./image/grass.jpg"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Растет трава у дома");
        frame.setBounds(x,y,width, height);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
        while (x <= width) {
            JLabel label = new JLabel(new ImageIcon(image));
            label.setBounds(x,y,image.getWidth(),image.getHeight());
            System.out.println("check x1::: " + x);
            System.out.println("check y1::: " + y);
            frame.add(label);
            x +=50;
            if (x >= width) {
                
            }
//            switch (x) {
//                case 800:
//                    System.out.println("check x2::: " + x);
//                    label.setBounds(x,y,image.getWidth(),image.getHeight());
//                    frame.add(label);
//                    y += 50;
//                    x = 0;
//                    break;
//            }
        }
    }
}
