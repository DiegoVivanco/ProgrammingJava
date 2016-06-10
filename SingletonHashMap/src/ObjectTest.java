
public class ObjectTest {
	public class CrunchifyObjectTest {
		 
		static Singleton instance = Singleton.getSingletonInstance();
	 
		public static void main(String[] args) {
			populateAndSaveDataFromSingletonObject();
			retrieveDataFromSingletonObject();
		}
	 
		private static void retrieveDataFromSingletonObject() {
			String result = instance.getCrunchifyObject();
			System.out.println(result);
		}
	 
		private static void populateAndSaveDataFromSingletonObject() {
	 
			// Create CrunchifyObject
			CrunchifyObject crunchifyObj = new CrunchifyObject();
			crunchifyObj.setName("Crunchify.com");
			crunchifyObj.setAddress("NYC - US");
	 
			// Create Employee1
			Employee emp1 = crunchifyObj.new Employee();
			emp1.setFirstName("Mike");
			emp1.setLastName("Rose");
			emp1.setPhoneNumber(1222222222);
	 
			// Create Employee2
			Employee emp2 = crunchifyObj.new Employee();
			emp2.setFirstName("app");
			emp2.setLastName("shah");
			emp2.setPhoneNumber(1333333333);
	 
			// Create Employee3
			Employee emp3 = crunchifyObj.new Employee();
			emp3.setFirstName("Dexter");
			emp3.setLastName("My");
			emp3.setPhoneNumber(1444444444);
	 
			// Add all Employee Object to CrunchifySingleton object
			instance.addEmployee(emp1);
			instance.addEmployee(emp2);
			instance.addEmployee(emp3);
	 
			// Add Employees to CrunchifyObject
			crunchifyObj.setEmployees(instance.getEmployee());
	 
			// Now finally add CrunchifyObject to same CrunchifySingleton object which will use to retrieve all data
			instance.addCrunchify(crunchifyObj);
		}
	 
	}

}
