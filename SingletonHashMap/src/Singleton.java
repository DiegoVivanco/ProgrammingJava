import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import Objects.Employee;



public class Singleton {
 
	private List<Employee> employees = new ArrayList<Employee>();
	private static Singleton singletonInstance = null;
	private Objects object = new Objects();
 
	public static Singleton getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
 
	public void addEmployee(Employee employees) {
		synchronized (employees) {
			employees.add(employee);
		}
	}
 
	public List<Employee> getEmployee() {
		return employees;
	}
 
	public void addObject(Object object) {
		synchronized (object) {
			this.object = object;
		}
	}
 
	public String getObject() {
		JSONObject obj = new JSONObject();
		obj.put("name", object.getName()); 
		obj.put("address", object.getAddress());
 
		JSONArray employeeJson = new JSONArray();
		for (Employee emp : employees) {
 
			Map<String, String> employeeData = new HashMap<String, String>();
			employeeData.put("firstName", emp.getFirstName());
			employeeData.put("lastName", emp.getLastName());
			employeeData.put("phoneNumber", emp.getPhoneNumber() + "");
 
			employeeJson.put(employeeData);
		}
		obj.put("employees", employeeJson);
		return obj.toString();
	}
}


