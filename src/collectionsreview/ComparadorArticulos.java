package collectionsreview;

import java.util.Comparator;

class comparadorArticulos implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descA = o1.getDescripcion();
		String descB = o2.getDescripcion();

		return descA.compareTo(descB);
	}

}
