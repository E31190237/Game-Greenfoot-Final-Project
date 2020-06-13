import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orangtua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class orangtua extends Actor
{
    int timerOrangtua = 150;
    /**
     * Act - do whatever the orangtua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void kenaSemut()
    {
        if (isTouching(semut.class))
        {
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
}
}
 public void act() 
    {
       if(getX()==0)
       {
           setLocation(0,getY());
           }
           setLocation(getX()-4,getY());
           
       kenaSemut();
}
}


     

