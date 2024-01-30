import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score=0;
    static int level=1;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter()
    {
        setImage(new GreenfootImage("Score: "+score, 30, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("Score: "+score, 30, Color.WHITE, Color.BLACK));
        YouWin();
        
    }
    public void addScore()
    {
        score++;
    }
    public void YouWin()
    {
        if(score==15)
        {
            //getWorld().addObject(new YouWin(),300,300);
            //Greenfoot.stop();
            if(level==1)
            {
                    Counter.level++;
                    Greenfoot.setWorld(new Level2());
            }
            else if(level==2)
            {
                getWorld().addObject(new YouWin(),300,300);
                Greenfoot.stop();
            }
        }
    }
}
