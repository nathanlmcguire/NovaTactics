import java.util.ArrayList;

public class Soldier
	{
	private String name;
	private int hitPoints;
	private int accuracy;
	private int xCoord, yCoord;
	
	ArrayList <Soldier> army = new ArrayList<Soldier>();
	
	public Soldier(int x, int y)
		{
		name = "John";
		hitPoints = 20;
		accuracy = 50;
		xCoord = x;
		yCoord = y;
		}
	}
