import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter=new Counter();
    private int enemiesAdded=0;
    private int enemies2Added=0;
    private int enemies3Added=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    //to add enemies random
    public void act()
    {
        addEnemy1();
        addEnemy2();
        addEnemy3();
        
    }
    public void addEnemy1()
    {
        //if(enemiesAdded<15)
        //{
            if(Greenfoot.getRandomNumber(60)<1)
            {
                addObject(new Enemy1(),Greenfoot.getRandomNumber(600),0);
                enemiesAdded++;
            }
        //}
    }
    public void addEnemy2()
    {
        if(enemies2Added<5)
        {
            if(Greenfoot.getRandomNumber(150)<1)
            {
                addObject(new Enemy2(),Greenfoot.getRandomNumber(600),0);
                enemies2Added++;
            }
        }
    }
    public void addEnemy3()
    {
        if(enemies3Added<5)
        {
            if(Greenfoot.getRandomNumber(60)<1)
            {
                addObject(new Enemy3(),Greenfoot.getRandomNumber(600),0);
                enemies3Added++;
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
