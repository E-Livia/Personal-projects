import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    //int level=1;
    Counter counter=new Counter();
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Level()
    {
        setImage(new GreenfootImage("Level: "+counter.level, 30, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("Level: "+counter.level, 30, Color.WHITE, Color.BLACK));
    }
}
