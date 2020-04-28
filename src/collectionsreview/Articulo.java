package collectionsreview;

import java.util.Comparator;

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

	private int numero;
	private String descripcion;

	public Articulo() {
	}

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

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descA = o1.getDescripcion();
		String descB = o2.getDescripcion();

		return descA.compareTo(descB);
	}

}