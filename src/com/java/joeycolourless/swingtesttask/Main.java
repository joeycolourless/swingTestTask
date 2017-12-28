package com.java.joeycolourless.swingtesttask;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class Main {
    private static int count = 0;


    public static void main(String[] args){


        JFrame jFrame = new JFrame("Test swing App");

        jFrame.setSize(500, 500);
        jFrame.setMaximumSize(new Dimension(500, 500));
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JLabel jLabelOne = new JLabel();

        JLabel jLabelTwo = new JLabel();
        jLabelTwo.setForeground(new Color(0, 0, 0));
        jLabelTwo.setLocation(300, 400);
        jLabelTwo.setSize(150, 50);

        JPanel jPanel = new JPanel();
        jPanel.setSize(100, 100);
        jPanel.setLocation(200, 200);
        Color color = new Color(100, 100, 100);
        jPanel.setBackground(color);
        jPanel.add(jLabelOne);

        jFrame.add(jPanel);
        jFrame.add(jLabelTwo);

        jFrame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                jPanel.setBackground(new Color(e.getX()/ 2, e.getY()/ 2, e.getX()/ 2));
            }
        });

        jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Random random = new Random();
                jPanel.setLocation(random.nextInt(400), random.nextInt(400));
                jPanel.setBackground(new Color(jPanel.getY()/2, jPanel.getX()/2, jPanel.getY()/2));
                count++;
                if (count > 10){
                    jLabelOne.setText("Maybe enough?");
                }
                if (count > 15){
                    jLabelTwo.setText("Ok, your decision?");

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        jFrame.setVisible(true);
    }
}
