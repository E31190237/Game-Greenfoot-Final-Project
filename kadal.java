import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kadal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kadal extends Actor
{
    int horizontalSpeed = Greenfoot.getRandomNumber(5)-3;
    int verticalSpeed = Greenfoot.getRandomNumber(5)-3;
    /**
     * Act - do whatever the kadal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        move(2);
        removeAtEdge();
        if(Greenfoot.getRandomNumber(100)<10)
          turn (Greenfoot.getRandomNumber(15)-30);
    }
    public void removeAtEdge(){
        gerak();
    }
    public void gerak()
    {
        int x = getX();
        int y = getY();
        setLocation(x,y); 
        if (getY()==600){
            setLocation(Greenfoot.getRandomNumber(1),getY());
        }
        if (getY()==800){
             setLocation(Greenfoot.getRandomNumber(1),getX());
        }
       
    }
    
}  


        