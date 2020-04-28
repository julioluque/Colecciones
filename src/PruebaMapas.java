import java.util.HashMap;
import java.util.Map;
public class PruebaMapas {

	public static void main(String[] args) {

		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		personal.put("145", new Empleado("Delfina"));
		personal.put("146", new Empleado("Martin"));
		personal.put("147", new Empleado("Sofia"));
		personal.put("148", new Empleado("Julio"));
		personal.put("149", new Empleado("Julian"));
		personal.put("150", new Empleado("Daniela"));
		personal.put("151", new Empleado("Cecilia"));
		personal.put("152", new Empleado("Roberto"));
		
		System.out.println(personal);

		personal.remove("146");
		System.out.println(personal);
		
		personal.put("146", new Empleado("Eduardo"));
		personal.put("152", new Empleado("Maldonado"));
		System.out.println(personal);
		
		System.out.println("---------ENTRY SET--------");
		System.out.println(personal.entrySet());
		
		System.out.println("---------ENTRY SET MANUAL--------");
		for (Map.Entry<String, Empleado> p :personal.entrySet()) {
			String clave = p.getKey();
			Empleado valor = p.getValue();
			System.out.println("clave=" + clave + ", valor=" + valor);
		}
	}
}

class Empleado {

	private String nombre;
	private double sueldo;

	public Empleado(String nombre) {
		this.nombre = nombre;
		sueldo = 2000;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}