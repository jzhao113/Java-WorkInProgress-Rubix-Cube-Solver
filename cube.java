package theRubrix;

public class cube {
	
	private face faces[] = new face[6];
	
	public cube(face before[])
	{
		//improve on this 
		for(int i=0;i<faces.length;i++)
		{
			for(int j=0;j<faces.length;j++)
			{
				if(before[j].getDirection()==i)
					faces[i]=before[j];
			}
		}
	}
	
	public String getFrontColor()
	{
		return faces[1].getDirectionColor();
	}
	
	public String[][] getEntireFront()
	{
		return faces[1].getEntireFace();
	}
	
	public String getRightColor()
	{
		return faces[4].getDirectionColor();
	}
	
	public String[][] getEntireRight()
	{
		return faces[4].getEntireFace();
	}
	
	public String getLeftColor()
	{
		return faces[2].getDirectionColor();
	}
	
	public String[][] getEntireLeft()
	{
		return faces[2].getEntireFace();
	}
	
	public String getBackColor()
	{
		return faces[3].getDirectionColor();
	}
	
	public String[][] getEntireBack()
	{
		return faces[3].getEntireFace();
	}
	public String getTopColor()
	{
		return faces[0].getDirectionColor();
	}
	
	public String[][] getEntireTop()
	{
		return faces[0].getEntireFace();
	}
	public String getBottomColor()
	{
		return faces[5].getDirectionColor();
	}
	
	public String[][] getEntireBottom()
	{
		return faces[5].getEntireFace();
	}
	
	public void topClockWise()
	{
		//first part
		String tempRows[][] = new String[4][3]; 
		for(int i=0;i<4;i++)
			tempRows[i]=faces[i+1].getRow(0);
		
		for(int i=0;i<5;i++)
			faces[i+1].setRow(tempRows[(i+3)%4],0);
		
		//second part
		String tempTop[][] = faces[0].getEntireFace();
		String newTop[][] = new String[3][3];
		int counter=2;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				newTop[j][counter]=tempTop[i][j]; // i j j counter for counter clockwise 
			counter--;
		}
		
		faces[0].setEntireFace(newTop);
	}
	
	public void topCounterClockWise()
	{
		//first part
		String tempRows[][] = new String[4][3];
		//getting all current rows
		for(int i=0;i<4;i++)
			tempRows[i]=faces[i+1].getRow(0);
		//setting them, the 0 is the pos of which row to replace
		for(int i=0;i<5;i++)
			faces[i+1].setRow(tempRows[(i+5)%4],0);
				
		//second part
		String tempTop[][] = faces[0].getEntireFace();
		String newTop[][] = new String[3][3];
		int counter=2;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				newTop[i][j]=tempTop[j][counter]; // i j j counter for counter clockwise 
			counter--;
		}
				
			faces[0].setEntireFace(newTop);
	}

}
