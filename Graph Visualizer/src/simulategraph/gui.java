/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulategraph;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author elitesf
 */
class gui  extends JFrame implements ActionListener, MouseListener {
    
    Shape circle= new Ellipse2D.Float(10,10,10,10);
    
    public void actionPerformed(ActionEvent a)
    {
        
    }
    
    public void drawCircle(int x,int y)
    {
        Graphics gr = this.getGraphics();
        gr.drawOval(x,y,x,y);
        gr.setColor(Color.BLUE);
        gr.fillOval(x, y, y, y);
    }
    
    public void mouseClicked(MouseEvent e)
    {
       drawCircle(e.getX(), e.getY());
       repaint();
    }
    
    public void mouseExited(MouseEvent e)
    {
        
    }
    public void mousePressed(MouseEvent e)
    {
        
    }
    public void mouseReleased(MouseEvent e)
    {
        
    }
    public void mouseEntered(MouseEvent e)
    {
        
    }
}
