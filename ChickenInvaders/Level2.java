import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    Counter counter=new Counter();
    int enemies2Added=0;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public void act()
    {
        addEnemy2();
    }
    public void addEnemy2()
    {
        if(enemies2Added<30)
        {
            if(Greenfoot.getRandomNumber(60)<1)
            {
                addObject(new Enemy2(),Greenfoot.getRandomNumber(600),0);
                enemies2Added++;
            }
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,282,410);
        player.setLocation(283,403);

        addObject(counter,160,103);
        counter.setLocation(74,41);
        Level level = new Level();
        addObject(level,518,43);
        level.setLocation(532,43);

        player.setLocation(290,539);
        Reset reset = new Reset();
        addObject(reset,576,575);
    }
}
