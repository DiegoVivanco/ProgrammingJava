import java.util.HashMap;
import java.util.Map;

public class Product {
	
	private double price;
	private String name;
	private ProductType type;
	private Map<String, Object> instanceProperties;
	
	
	public Product(String name, double price, ProductType type) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.instanceProperties = new HashMap<>();
}
	public double getPrice() {
		return price;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setProperty(String property, Object value) {
		validateProperty(property);
		instanceProperties.put(property, value);
	}
	
	
	public Object getProperty(String property) {
		validateProperty(property);
		if (!instanceProperties.containsKey(property)) {
		// Get the default initialized property from the type
			return type.getInstanceProperty(property);
		}
		return instanceProperties.get(property);
	}
	
	public Object getStaticProperty(String property) {
		if (!type.isStaticProperty(property))
			throw new IllegalArgumentException("Static property "+property+
					" not valid for type: "+type.getName());
		return type.getStaticProperty(property);
		}
	
	
	private void validateProperty(String property) {
		if (!type.isInstanceProperty(property))
			throw new IllegalArgumentException("Property "+property+
					" not valid for type: "+type.getName());
		}
}