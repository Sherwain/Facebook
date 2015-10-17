package test;

public class Company {
	
	class Employee {
        private String name;
        Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
	
    class Department {
        private String name;

        Department (String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public Employee employed(String name) {
        return new Employee(name);
    }
    
    public Department department(String name) {
        return new Department(name);
    }
    
    public void newStarter(String name, String department) {
        Employee emp = employed(name);
        Department dpt = department(department);
        System.out.println(emp.getName() + " is a member of " + dpt.getName());
    }
    
    public static void main(String[] args) {
        Company c = new Company();
        c.newStarter("kingsley", "IT");
        // Referencing inner classes
   }
}
