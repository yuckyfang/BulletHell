package application;
//abstract method????
public abstract class Bullet 
{//aod is angle of direction and it will always be >=0 and <360
 //(implement mod 360 if you need to)
	int xPos,yPos;
	double bSpeed, bDamage, aod;
	boolean bHole; //For black hole bullets      
	String imgName;
	int[] hBox; //bHoles do not have one, Moon bullets will be circular so array will
				//only have radius and center.Everything else will be image coords {x1,y1,x2,y2}
	public Bullet(int x, int y, double speed, double damage, double angle, boolean isBHole, String imageName,int[] hitBox)
	{
		bSpeed=speed;bDamage=damage;aod=angle; bHole=isBHole; imgName=imageName; 
		hBox=hitBox;
	}
	public void Move(int xShift, int yShift)
	{
		xPos+=xShift; yPos+=yShift;
	}
}
