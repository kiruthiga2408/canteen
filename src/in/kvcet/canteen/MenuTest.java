package in.kvcet.canteen;

public class MenuTest {

	public static void main(String[] aargs) {
		Menu m1 = new Menu("Chapathi", 10);
		System.out.println(m1);
		System.out.println("Name:" + m1.name + ",price:" + m1.price);

		Menu m2 = new Menu("Pongal", 20);
		System.out.println("Name:" + m2.name + ",price:" + m2.price);
	}

}
	