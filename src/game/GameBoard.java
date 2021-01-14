package game;

import pieces.Guard;
import pieces.Leader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

    private ArrayList<Object>  piecesColector;

    public GameBoard(){

        this.piecesColector =new ArrayList<>();

        //Leaders adding
        this.piecesColector.add(new Leader(0,4,'Y'));
        this.piecesColector.add(new Leader(4,0,'G'));

        //Guards adding
        this.piecesColector.add(new Guard(4,4,'G'));
        this.piecesColector.add(new Guard(4,1,'G'));
        this.piecesColector.add(new Guard(4,2,'G'));
        this.piecesColector.add(new Guard(4,3,'G'));
        this.piecesColector.add(new Guard(0,0,'Y'));
        this.piecesColector.add(new Guard(0,1,'Y'));
        this.piecesColector.add(new Guard(0,2,'Y'));
        this.piecesColector.add(new Guard(0,3,'Y'));




        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //filling the gray squares
        g.setColor(Color.GRAY);
        g.fill3DRect(0,100,100,100,true);
        g.fill3DRect(100,100,100,100,true);
        g.fill3DRect(300,100,100,100,true);
        g.fill3DRect(400,100,100,100,true);
        g.fill3DRect(0,300,100,100,true);
        g.fill3DRect(100,300,100,100,true);
        g.fill3DRect(300,300,100,100,true);
        g.fill3DRect(400,300,100,100,true);

        //filling the orange squares
        g.setColor(Color.ORANGE);
        g.fill3DRect(0,0,100,100,true);
        g.fill3DRect(400,0,100,100,true);
        g.fill3DRect(100,400,100,100,true);
        g.fill3DRect(300,400,100,100,true);

        //filling the black squares
        g.setColor(Color.BLACK);
        g.fill3DRect(100,0,100,100,true);
        g.fill3DRect(300,0,100,100,true);
        g.fill3DRect(0,400,100,100,true);
        g.fill3DRect(400,400,100,100,true);

        //filling the white squares
        g.setColor(Color.white);
        g.fill3DRect(200,0,100,100,true);
        g.fill3DRect(200,100,100,100,true);
        g.fill3DRect(200,200,100,100,true);
        g.fill3DRect(200,300,100,100,true);
        g.fill3DRect(200,400,100,100,true);
        g.fill3DRect(0,200,100,100,true);
        g.fill3DRect(100,200,100,100,true);
        g.fill3DRect(300,200,100,100,true);
        g.fill3DRect(400,200,100,100,true);

        //filling the gray circle
        g.setColor(Color.GRAY);
        g.fillOval(225,225,50,50);

        for(int i = 0; i < 2; i++){
            Leader l1 = (Leader) piecesColector.get(i);
            l1.render(g);
        }

        for(int i = 2; i < piecesColector.size(); i++){
            Guard g1 = (Guard) piecesColector.get(i);
            g1.render(g);

        }


    }

}
