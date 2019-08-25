package theRubrix;

public class face {
	
	private String faceColors[][];
	private String directionCenter;
	private int direction;
	
	public face(String faceColors[][], String directionCenter,int direction)
	{
		this.faceColors = faceColors;
		this.directionCenter = directionCenter;
		this.direction = direction;
	}
	
	public String getFaceColor(int x, int y)
	{
		return faceColors[x][y];
	}
	
	public String getDirectionColor()
	{
		return directionCenter;
	}
	
	public int getDirection()
	{
		return direction;
	}
	
	public String[][] getEntireFace()
	{
		return faceColors;
	}
	
	public String[] getRow(int pos)
	{
		return faceColors[pos];
	}
	
	public void setRow(String [] input, int pos)
	{
		faceColors[pos]=input;
	}
	
	public void setEntireFace(String[][] input)
	{
		faceColors=input;
	}
	
	
	
	

}
