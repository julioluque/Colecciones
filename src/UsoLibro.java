public class UsoLibro {

	public static void main(String[] args) {

		Libro libro1 = new Libro("Java I", "Julo", 25);
		Libro libro2 = new Libro("Java II", "Julo", 25);
		
		if (libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
		}else {
			System.out.println("No es el mismo");
		}
		
		System.out.println("------------------------");
		System.out.println("HashCode: Libro1 " + libro1.hashCode());
		System.out.println("HashCode: Libro2 " + libro2.hashCode());
		
		System.out.println("------------------------");
		libro1 = libro2;
		System.out.println("HashCode: Libro1 " + libro1.hashCode());
		System.out.println("HashCode: Libro2 " + libro2.hashCode());

	}

}
