import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{
    int hitCounter=4;
    /**
     * Act - do whatever the Enemy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy3()
    {
        GreenfootImage image=new GreenfootImage("asteroid.png");
        
        int newWidth=90;
        int newHeight=90;
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
            hitCounter--;
        }
        else
        {
            removeEnemy();
        }
        if(hitCounter==0)
        {
            //for the counter to work
            World world=getWorld();
            MyWorld myWorld=(MyWorld)world;
            Counter counter=myWorld.getCounter();
            counter.addScore();
            
            getWorld().removeObject(this);
        }
        
    }
}
