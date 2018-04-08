package de.university.gui;

        import java.awt.Graphics;
        import java.awt.image.BufferedImage;

        import javax.swing.ImageIcon;

public class ImageHandler {

    private ImageIcon[][] pieces;

    public ImageHandler(int piecesX, int piecesY, ImageIcon image) {

        this.pieces = new ImageIcon[piecesX][piecesY];

        BufferedImage bi = new BufferedImage(image.getIconWidth(), image.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        // paint the Icon to the BufferedImage.
        image.paintIcon(null, g, 0, 0);
        g.dispose();

        for (int x = 0; x < piecesX; x++) {
            for (int y = 0; y < piecesY; y++) {
                int width = (int) (image.getIconWidth() / (double) piecesX);
                int height = (int) (image.getIconHeight() / (double) piecesY);
                this.pieces[x][y] = new ImageIcon(bi.getSubimage(width * x, height * y, width, height));
            }
        }

    }

    public ImageIcon getImagePiece(int x, int y) {
        return this.pieces[x][y];
    }
}
