import java.util.*;
public class PruebaLinkedList {

	public static void main(String[] args) {

		LinkedList	<String> personas = new LinkedList<String>();
		personas.add("Julio");
		personas.add("Sandra");
		personas.add("Martin");
		personas.add("Laura");
		System.out.println(personas.size());
		personas.add("Romina");
		personas.add(2, "Jose");
		
		ListIterator <String> it = personas.listIterator();
		it.next();
		it.add("Renzo");

		for (String persona : personas) {
			System.out.println(persona);
		}
	}
}
