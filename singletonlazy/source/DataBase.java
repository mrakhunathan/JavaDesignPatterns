package source;

public class DataBase {
	String s1;
	String s2;

	private DataBase() {
		setS1("Default S1");
		setS2("Default S2");
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	private static DataBase dataBase;

	public static DataBase getDataBaseInstance() {
		if (dataBase == null)
			dataBase = new DataBase();

		return dataBase;
	}

}
