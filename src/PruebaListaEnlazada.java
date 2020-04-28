import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {

		LinkedList<String> paises = new LinkedList<String>();
		paises.add("1 BOLIVIA");
		paises.add("2 ARGENTINA");
		paises.add("3 MEXICO");
		paises.add("4 ESPAÑA");
		paises.add("5 BRASIL");
		paises.add("6 URUGUAY");
		paises.add("7 JAPON");
		paises.add("8 ESTAOS UNIDOS");
		paises.add("9 CANADA");
		paises.add("10 PERU");

		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("1 Sucre");
		capitales.add("2 Buenos Aires");
		capitales.add("3 Df");
		capitales.add("4 Madrid");
		capitales.add("5 Sao Paulo");
		capitales.add("6 Montevideo");
		capitales.add("7 Tokio");
		capitales.add("8 Washington");
		capitales.add("9 Toronto");
		capitales.add("10 Lima");
		
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();

		System.out.println("\n--- Listas originales paises y capitales---");
		System.out.println(paises);
		System.out.println(capitales);
		
		System.out.println("\n--- Insertamos la lista capitales a paises, intercalado---");
		while (iterB.hasNext()) {
			if (iterA.hasNext()) {
				iterA.next();
			}
			iterA.add(iterB.next());
		}
		System.out.println(paises);

		
		System.out.println("\n--- Eliminamos un objeto cada 2 de la lista capitales ---");
//		Es la forma de volver al inicio de la lista del iterador
		iterB = capitales.listIterator();
		while (iterB.hasNext()) {
			iterB.next();

			if (iterB.hasNext()) {
				iterB.next();
				iterB.remove();
			}
		}
		System.out.println(capitales);
		
		System.out.println("\n--- Eliminamos un objeto cada 3 de la lista paises ---");
		iterA = paises.listIterator();
		while (iterA.hasNext()) {
			iterA.next();
			if (iterA.hasNext()) {
				iterA.next();
				if (iterA.hasNext()) {
					iterA.next();
					iterA.remove();
				}
			}
		}
		System.out.println(paises);
		
		System.out.println("\n---Eliminamos las capitales, de una lista desordenada.---");
		paises.removeAll(capitales);
		System.out.println(paises);
	}

}
