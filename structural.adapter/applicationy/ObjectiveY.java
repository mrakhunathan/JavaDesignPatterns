package applicationy;

public class ObjectiveY implements YInterface {
	String[] Data = new String[10];

	public void initializeData() {
		Data[0] = "One";
		Data[1] = "Two";
		Data[2] = "Three";
		Data[3] = "Four";
		Data[4] = "Five";
		Data[5] = "Six";
		Data[6] = "Seven";
		Data[7] = "Eight";
		Data[8] = "Nine";
		Data[9] = "Ten";
	}

	public String[] getData() {
		initializeData();
		return Data;
	}

	public void setData(String[] data) {
		Data = data;
	}
}
