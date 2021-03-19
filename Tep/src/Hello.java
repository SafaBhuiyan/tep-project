import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Hello {
	static String[] vehicles = { "Bus", "Helicopter", "Boat" };
	static String[][] drivers = { { "Joe", "Sue", "Mary" }, { "Asish", "Ratan", "Kamal", "Polash" },
			{ "Tom", "Harry", "Donald" } };

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");

		Map<String, Set<String>> personal = new HashMap<>();
		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
//            System.out.println(vehicle + ":");
			String[] driverList = drivers[i];
			Set<String> driversList = new LinkedHashSet<>();
			for (String driver : driverList) {
//                System.out.println(driver);
				driversList.add(driver);
			}
			personal.put(vehicle, driversList);
		}
		for (String vehicle : personal.keySet()) {
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> allDriverList = personal.get(vehicle);
			for (String driver : allDriverList) {
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
