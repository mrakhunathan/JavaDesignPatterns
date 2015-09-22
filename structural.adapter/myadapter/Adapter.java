package myadapter;

import java.util.ArrayList;
import java.util.List;

import applicationx.ObjectiveX;
import applicationy.ObjectiveY;

public class Adapter 
{
	public static void adapterObjectives() 
	{
		ObjectiveX objectiveX = new ObjectiveX();
		ObjectiveY objectiveY = new ObjectiveY();
		List<String> listData = new ArrayList<String>();

		for (String Data : objectiveY.getData()) 
		{
			listData.add(Data);
		}
		objectiveX.printInputs(listData);
	}
}
