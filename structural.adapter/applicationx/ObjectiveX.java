package applicationx;

import java.util.List;

public class ObjectiveX implements XInterface {
	public void printInputs(List<String> data) {
		for (int i = 0; i < data.size(); i++) {
			System.out.println("Data[" + i + "] = " + data.get(i));
		}
	}
}
