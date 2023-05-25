package desenho;

import javax.swing.*;
import java.awt.*;

public class Semafaro extends JFrame {

    public Semafaro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

        // Desenha o retângulo externo do semáforo
        g.drawRect(130, 50, 100, 300);

        // Desenha o retângulo à esquerda
        g.drawRect(30, 150, 100, 200);

        // Desenha o círculo preto
        g.setColor(new Color(51, 51, 51));
        g.fillOval(40, 160, 80, 80);
        
        g.setColor(Color.WHITE);
        g.fillOval(40, 260, 80, 80);

        // Desenha o círculo com a seta apontando para a esquerda
        //g.setColor(Color.WHITE);
        //g.fillOval(40, 180, 40, 40);
        //g.setColor(Color.BLACK);
        //g.fillPolygon(new int[]{50, 70, 70}, new int[]{200, 190, 210}, 3);

        // Desenha os círculos do semáforo
        g.setColor(Color.RED);
        g.fillOval(140, 60, 80, 80);

        g.setColor(Color.YELLOW);
        g.fillOval(140, 160, 80, 80);

        g.setColor(Color.GREEN);
        g.fillOval(140, 260, 80, 80);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Semafaro();
            }
        });
    }
}
