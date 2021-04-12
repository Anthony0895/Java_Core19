package lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Serializable;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file_Name = new File("serialize.io");

		Employee empl = new Employee("Andrijan", 1, 13000);
		Methods.serialize(file_Name, empl);
		System.out.println(Methods.deserealize(file_Name));
		System.out.println();

		ArrayList<Employee> arrEmpl = new ArrayList<Employee>();
		arrEmpl.add(new Employee("Olja", 1, 235677));
		arrEmpl.add(new Employee("Taras", 2, 4567));
		arrEmpl.add(new Employee("Sanja", 3, 45790));
		arrEmpl.add(new Employee("Vova", 4, 2345));

		File file_Name2 = new File("serialize2.io");
		Methods.serialize(file_Name2, arrEmpl);

		ArrayList<Employee> arrEmplDes = new ArrayList<Employee>();
		arrEmplDes = (ArrayList<Employee>) Methods.deserealize(file_Name2);

		for (Employee employee : arrEmplDes) {
			System.out.println(employee);
		}

	}
}