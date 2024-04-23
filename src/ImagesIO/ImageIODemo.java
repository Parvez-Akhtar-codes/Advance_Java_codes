package ImagesIO;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIODemo {
    public static void main(String[] args) {
        int width=963;
        int height = 640;

        BufferedImage image = null;

        image = readFromFile(width,height,image);

        writeToFile(image);
    }
    public static BufferedImage readFromFile(int width , int height ,BufferedImage image){
        try{
            File samplefile = new File("E:\\source.jpg");
            image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(samplefile);
            System.out.println("Reading Complete");

        }catch (IOException e){
            e.printStackTrace();
        }
        return image;
    }
    public static void writeToFile(BufferedImage image){
        try{
            File output = new File("D:\\javatuts\\out.jpg");
            ImageIO.write(image ,"jpg",output);
            System.out.println("Writing Complete");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
