package actions;

import java.util.Date;

public class Action3 {
	public void supplier()
	{
		Action1 action1 = new Action1();
		Action2 action2 = new Action2();
		action1.activityOnAction1();
		action2.activityOnAction2(new Date());
		action3Fun();
	}

	public static void action3Fun() {
		System.out.println("Action 3 Succesful");
	}
}
