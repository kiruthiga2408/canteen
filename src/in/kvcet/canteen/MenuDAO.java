package in.kvcet.canteen;

public class MenuDAO {

	//public static void addMenu(String name, Integer price, Integer quantity, Integer rating) throws Exception {
		public static void addMenu(Menu menu) throws Exception{

			// Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			System.out.println(connection);
			
//			String query = "INSERT INTO naresh_canteen_menus (NAME,price) VALUES
			//( 'Chapathi', 10)";
			
			StringBuilder queryStr = new StringBuilder();
			queryStr.append("INSERT INTO naresh_canteen_menus(name, price) VALUES('")
			.append(menu.name).append("',") .append(menu.price).append(")");
			
			String query = queryStr.toString();
			System.out.println(query);
			
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(query);
			System.out.println("No of rows inserted:" + rows);
			
			
			statement.close();
			connection.close();
			
		}

	}

}
