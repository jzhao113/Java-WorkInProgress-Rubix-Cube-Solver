

public class main {
	
	public static void main(String[]args)
	{
		String top[][]= {{"W","R","O"},{"O","W","B"},{"Y","O","B"}};
		
		String front[][]= {{"G","W","Y"},{"W","R","G"},{"R","Y","Y"}};
		String left[][]= {{"O","G","R"},{"W","G","B"},{"R","G","W"}};
		String right[][]= {{"O","Y","G"},{"R","B","B"},{"O","W","Y"}};
		String back[][]= {{"W","B","B"},{"O","O","R"},{"R","O","B"}};
		
		String bottom[][]= {{"G","R","G",},{"Y","Y","G"},{"W","Y","B"}};
		
		face topFace = new face(top,"W",0);
		face frontFace = new face(front,"R",1);
		face leftFace = new face(left,"G",2);
		face rightFace = new face(right,"B",4);
		face backFace = new face(back,"O",3);
		face bottomFace = new face(bottom,"Y",5);
		
		face cube[] = new face[6];
		cube[0]=topFace;
		cube[1]=frontFace;
		cube[2]=leftFace;
		cube[3]=rightFace;
		cube[4]=backFace;
		cube[5]=bottomFace;
		cube rubrix = new cube(cube);
		
		rubrix.topCounterClockWise();
		String[][]temp1 = rubrix.getEntireFront();
		String[][]temp2 = rubrix.getEntireLeft();
		String[][]temp3 = rubrix.getEntireRight();
		String[][]temp4 = rubrix.getEntireBack();
		String[][]temp5 = rubrix.getEntireTop();
		for(int i=0;i<3;i++)
		{
			System.out.print(temp2[0][i]);
		}
		
	}

}
