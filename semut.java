import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class semut extends Actor
{
    /**
     * Act - do whatever the semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hitKadals();
        // Add your action code here.
        if(Greenfoot.isKeyDown("up")){
            move(5);
    }  

        if(Greenfoot.isKeyDown("down")){
            move(-5);
    } 
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
    }  
        if(Greenfoot.isKeyDown("right")){
            turn(5);
    }  
}

public void hitKadals(){
    Actor kadals = getOneIntersectingObject(kadal.class);
    if (kadals !=null){
        World myWorld = getWorld();
        GameOver gameover = new GameOver();
        myWorld.addObject(gameover, myWorld.getWidth()/2,myWorld.getHeight()/2);
        myWorld.removeObject(this);
}
}
}