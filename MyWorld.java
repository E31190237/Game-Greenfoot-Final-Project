import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public Counter getCounter(){
    return counter;
    }
    
    private void munculOrangtua(){
    addObject(new orangtua(),Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    
}
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100,40);
        semut semut = new semut();
        addObject(semut,33,45);
        semut semut2 = new semut();
        addObject(semut2,237,77);
        semut2.setLocation(209,126);
        removeObject(semut2);
        munculOrangtua();
        kadal kadal = new kadal();
        addObject(kadal,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        kadal kadal2 = new kadal();
        addObject(kadal2,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        kadal kadal3 = new kadal();
        addObject(kadal3,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        kadal kadal4 = new kadal();
        addObject(kadal4,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        kadal kadal5 = new kadal();
        addObject(kadal5,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        
        
    }


    public boolean cekOrangtua(){
        return getObjects(orangtua.class).size()==0;
}
public void act (){
    if(cekOrangtua()){
        munculOrangtua();
    }
}
}