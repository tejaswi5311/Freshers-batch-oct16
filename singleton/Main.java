package singleton;

public class Main {

	public static void main(String[] args) {
		Database db1;
		db1=Database.getInstance();
		db1.getConnection();
		

	}

}
