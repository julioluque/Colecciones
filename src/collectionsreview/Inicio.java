package collectionsreview;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Inicio {

	public static void main(String[] arg) {

		Cliente c1 = new Cliente("01 - Julio", "1020101", 1233.0);
		Cliente c2 = new Cliente("02 - Julia", "1020102", 17312.2);
		Cliente c3 = new Cliente("03 - Julito", "1020103", 12333.03);
		Cliente c4 = new Cliente("04 - Julita", "1020104", 46543.12);
		Cliente c5 = new Cliente("05 - Julian", "1020105", 76333.06);
		Cliente c6 = new Cliente("06 - Juliana", "1020106", 67233.76);

		Set<Cliente> clienteSet = new HashSet<Cliente>();
		clienteSet.add(c1);
		clienteSet.add(c2);
		clienteSet.add(c3);
		clienteSet.add(c4);
		clienteSet.add(c5);
		clienteSet.add(c6);

		System.out.println("\n--------SET ITERATOR------------------------");

		Iterator<Cliente> iter = clienteSet.iterator();

		while (iter.hasNext()) {
			String nombreCliente = iter.next().getNombre();
			if (nombreCliente.equals("03 - Julito")) {
				iter.remove();
			}
		}
		for (Cliente cliente : clienteSet) {
			System.out.println(cliente.toString());
		}

		System.out.println("\n--------LIST LISTITERATOR------------------------");
		LinkedList<Cliente> clienteList = new LinkedList<Cliente>();
		clienteList.add(c1);
		clienteList.add(c2);
		clienteList.add(c3);
		clienteList.add(c4);
		clienteList.add(0, c5);

		ListIterator<Cliente> listIter = clienteList.listIterator();
		listIter.next();
		listIter.add(c6);

		for (Cliente cliente : clienteList) {
			System.out.println(cliente.toString());
		}

		System.out.println("\n--------EQUALS HASHCODE------------------------");

		Libro java1 = new Libro("Java", "Julio Luque", 11000018);
		Libro java2 = new Libro("Java", "Julio Luque", 14000097);

		// Metodo equals sobreescrito
		if (java1.equals(java2)) {
			System.out.println("Es el mismo!!!");
		} else {
			System.out.println("Es una edicion diferente!!!");
		}

		System.out.println("HashCode Libro 1 : " + java1.hashCode());
		System.out.println("HashCode Libro 2 : " + java1.hashCode());

		System.out.println("\n--------LIST LINKEDLISTSET AMBAS DIRECCIONES------------------------");

		System.out.println("\n--------TREESET COMPARABLE COMPARATOR------------------------");
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
