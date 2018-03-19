import java.util.ArrayList;
public class Enemy
	{
	private String name;
	private int hitPoints;
	private int accuracy;
	private int xCoord, yCoord;
	
	ArrayList <Enemy> horde = new ArrayList<Enemy>();
	
	public Enemy(int x, int y)
		{
		name = "Xarz";
		hitPoints = 20;
		accuracy = 50;
		xCoord = x;
		yCoord = y;
		}
	}


