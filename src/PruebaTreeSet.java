import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {

		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		ordenaPersonas.add("Julio");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Luis");
		ordenaPersonas.add("Pedro");
		ordenaPersonas.add("Ramon");
		ordenaPersonas.add("Zabala");
		ordenaPersonas.add("Roberto");
		ordenaPersonas.add("Luisana");

		System.out.println("--- ORDENADO POR DEFECTO -> STRING IMPLEMENTA COMPARABLE---");
		for (String op : ordenaPersonas) {
			System.out.println(op);
		}

		Articulo primero = new Articulo(1102, "Primer articulo");
		Articulo segundo = new Articulo(20, "Segundo articulo");
		Articulo tercer = new Articulo(3, "Tercero articulo");
		Articulo cuarto = new Articulo(4, "Cuerto articulo");
		Articulo quinto = new Articulo(1101, "Quinto articulo");
		Articulo sexto = new Articulo(6, "Sexto articulo");

		TreeSet<Articulo> articulo = new TreeSet<Articulo>();
		articulo.add(cuarto);
		articulo.add(quinto);
		articulo.add(segundo);
		articulo.add(tercer);
		articulo.add(sexto);
		articulo.add(primero);

		System.out.println("\n--- ORDENADO POR ARTICULO -> IMPLEMENTAMOS COMPARABLE EN ARTICULO---");
		for (Articulo art : articulo) {
			System.out.println(art.getDescripcion());
		}
	}
}

class Articulo implements Comparable<Articulo> {

	private int numero;
	private String descripcion;

	public Articulo(int numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		return numero - o.numero;
	}

}
