package collectionsreview;

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
