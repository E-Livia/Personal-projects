import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1()
    {
        GreenfootImage image=new GreenfootImage("chicken.png");
        
        int newWidth=70;
        int newHeight=70;
        image.scale(newWidth,newHeight);
        
        setImage(image);
    }
    public void act()
    {
        moveEnemy();
        hitByProjectile();
    }
    public void hitByProjectile()
    {
        Actor projectile= getOneIntersectingObject(Projectile.class);
        //if the projectile hits an enemy, the enemy and the projectile
        //will be removed
        if(projectile != null)
        {
            getWorld().removeObject(projectile);
            
            //for the counter to work
            World world=getWorld();
            MyWorld myWorld=(MyWorld)world;
            Counter counter=myWorld.getCounter();
            counter.addScore();
            
            getWorld().removeObject(this);
        }
        else
        {
            removeEnemy();
        }
    }
}
