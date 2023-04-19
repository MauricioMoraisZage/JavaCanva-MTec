import java.awt.Color;
import java.awt.Graphics;

public class Classcanva {
    String tipo;
    int posX, posY, largura, Comprimento;
    Color cor;
    
    void pintar(Graphics g){
        g.setColor(cor);
        switch(tipo){
            case "FOval":      
                g.fillOval(posX, posY, largura, Comprimento);
                break;
            case "FRect":
                g.fillRect(posX, posY, largura, Comprimento);
                break; 
            case "Oval":      
                g.drawOval(posX, posY, largura, Comprimento);
                break;
            case "Rect":
                g.drawRect(posX, posY, largura, Comprimento);
                break; 
            case "Line":
                g.drawLine(posX, posY, largura, Comprimento);
                break; 
        }
    }
}

