import java.util.Comparator;
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

		System.out.println("\n--- ORDENADO POR ARTICULO -> IMPLEMENTAMOS COMPARABLE EN ARTICULO---");

		TreeSet<Articulo> articulosComparable = new TreeSet<Articulo>();
		articulosComparable.add(cuarto);
		articulosComparable.add(quinto);
		articulosComparable.add(segundo);
		articulosComparable.add(tercer);
		articulosComparable.add(sexto);
		articulosComparable.add(primero);

		for (Articulo art : articulosComparable) {
			System.out.println(art.toString());
		}

		System.out.println("\n--- ORDENADO POR DESCRIPCION -> IMPLEMENTAMOS COMPARATOR EN ARTICULO---");

//		OPCION 1 -> usamos solo la clase articulo pero definimos dos intefaces en ella
//		Articulo comparaArt = new Articulo(); 
//		TreeSet<Articulo> articulosComparator = new TreeSet<Articulo>(comparaArt);

//		OPCION 2 -> Heredamos comparador en ComapradorArticulos e implementamos una interfaz en cada una
//		comparadorArticulos comparaArt = new comparadorArticulos(); 
//		TreeSet<Articulo> articulosComparator = new TreeSet<Articulo>(comparaArt);

//		OPCION 3 -> Usamos clases internas
		TreeSet<Articulo> articulosComparator = new TreeSet<Articulo>(new Comparator<Articulo>() {
			@Override
			public int compare(Articulo o1, Articulo o2) {
				String descA = o1.getDescripcion();
				String descB = o2.getDescripcion();
				return descA.compareTo(descB);
			}
		});

		articulosComparator.add(primero);
		articulosComparator.add(segundo);
		articulosComparator.add(tercer);
		articulosComparator.add(cuarto);
		articulosComparator.add(quinto);
		articulosComparator.add(sexto);

		for (Articulo art : articulosComparator) {
			System.out.println(art.toString());
		}

	}
}

class Articulo implements Comparable<Articulo> /* , Comparator<Articulo> */ {

	private int numero;
	private String descripcion;

//	public Articulo() {
//	}

	public Articulo(int numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int compareTo(Articulo o) {
		return numero - o.numero;
	}

	@Override
	public String toString() {
		return "Articulo [numero=" + numero + ", descripcion=" + descripcion + "]";
	}


}

