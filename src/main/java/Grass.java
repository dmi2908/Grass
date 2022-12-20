import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grass {
    static int width = 800, height = 600;
    static int size = 50;
    static JFrame frame = new JFrame();

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("./image/grass.jpg")).getSubimage(0,0,size,size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Растет трава у дома");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        for (int i = 0; i < width/size; i++){
            for (int j = 0; j < height/size; j++){
                new GrowGrass(image, i, j);
            }
        }
        frame.setVisible(true);
    }

    public static class GrowGrass {
        public JLabel l;
        public GrowGrass(BufferedImage im, int i, int j) {
            l = new JLabel(new ImageIcon(im));
            l.setBounds(i*size, j*size, size, size);
            frame.add(l);
        }
    }
}
