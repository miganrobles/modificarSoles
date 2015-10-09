/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle suelo;
    private Person persona;
    private Person chino;
    private Triangle gorro;
    private Circle bola;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        suelo = new Circle();
        suelo.changeColor("green");
        suelo.changeSize(1000);
        suelo.moveHorizontal(-500);
        suelo.moveVertical(140);
        suelo.makeVisible();
        
        

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Metodo para mover el sol
     */
    public void moveSun()
    {
        sun.slowMoveVertical(110);
        suelo.changeColor("black");
        sun.changeColor("black");
        wall.changeColor("balck");
        roof.changeColor("balck");
        window.changeColor("white");
        
    }
    
    /**
     * Metodo para mover el sol
     */
    public void addPerson()
    {
        persona = new Person();
        persona.moveVertical(20);
        persona.moveHorizontal(-300);
        persona.makeVisible();
        persona.slowMoveHorizontal(150);
        
    }
    
    /**
     * Metodo que hace apareder un chino subido sobre una bola
     */
    public void chinoEnBola()
    {
        
        bola = new Circle();
        bola.changeColor("blue");
        bola.moveHorizontal(180);
        bola.moveVertical(140);
        bola.changeSize(40);
        bola.makeVisible();
        
        chino = new Person();
        chino.changeColor("yellow");
        chino.moveHorizontal(150);
        chino.moveVertical(5);
        chino.makeVisible();
        
        gorro = new Triangle();  
        gorro.changeSize(10,40);
        gorro.moveHorizontal(220);
        gorro.moveVertical(35);
        gorro.changeColor("green");
        gorro.makeVisible();
        
    }
    
    /**
     * Metodo que hace animacion con chino subido sobre una bola
     */
    public void animaChino()
    {
        
        if (gorro != null)   // only if it's painted already...
        {
            gorro.slowMoveVertical(-20);
            chino.slowMoveVertical(-19);
            gorro.slowMoveVertical(1);
            chino.slowMoveVertical(19);
            gorro.slowMoveVertical(19);
            gorro.slowMoveVertical(-20);
            chino.slowMoveVertical(-19);
            gorro.slowMoveVertical(1);
            bola.slowMoveHorizontal(100);
            chino.slowMoveVertical(150);
            gorro.slowMoveVertical(150);
        }
       

    }
    
   }
