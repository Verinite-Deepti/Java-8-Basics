package SortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

            public class Employee{
			private int id;
			private String name;
			private int age;
			private long salary;
			
			public Employee(int id, String name, int age, long salary) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
				this.salary = salary;
			}
			
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public long getSalary() {
				return salary;
			}
			public void setSalary(long salary) {
				this.salary = salary;
			}
			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(20,"Donald",45,40000));
		employees.add(new Employee(60,"Justin",39,60000));
		employees.add(new Employee(50,"Halsey",25,30000));
		employees.add(new Employee(10,"Rose",55,90000));
		
		//descending order higher salary to lower salary
		List<Employee>employeesSortedList1=employees.stream()
				.sorted((a,b) -> (int) (b.getSalary()-a.getSalary())).collect(Collectors.toList());
		
		
		//ascending order lower salary to higher salary
		List<Employee>employeesSortedList2=employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		
		
		//ascending order for age
		List<Employee>employeesSortedList3=employees.stream()
				.sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
						
			//descending order for age			
			List<Employee>employeesSortedList4=employees.stream()	
					.sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
						
						
			//ascending order for name			
						List<Employee>employeesSortedList5=employees.stream()
					.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
						
			//descending order for name
						List<Employee>employeesSortedList6=employees.stream()
								.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
						
						
		System.out.println(employeesSortedList1);
		System.out.println(employeesSortedList2);
		System.out.println(employeesSortedList3);
		System.out.println(employeesSortedList4);
		System.out.println(employeesSortedList5);
		System.out.println(employeesSortedList6);
		}
		
		
		
	}


