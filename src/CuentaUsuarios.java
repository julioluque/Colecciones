import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentaUsuarios {

	public static void main(String[] args) {

//		Creada la clase, la instanciamos con nuevos clientes
		Cliente c1 = new Cliente("Julio Luque", "0001011", 200000);
		Cliente c2 = new Cliente("Juan Martinez", "0001012", 300000);
		Cliente c3 = new Cliente("Sol Noelia ", "0001013", 400000);
		Cliente c4 = new Cliente("Aldana Maldonado", "0001014", 500000);
		Cliente c5 = new Cliente("Julio Luque", "0001011", 200000);

//		Creamos la coleccion

		Set<Cliente> clientesBanco = new HashSet<Cliente>();

//		agregamos los clientes a dicha coleccion
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		clientesBanco.add(c5);

		System.out.println("----------------------- Recorremos con un foreach comun");
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getNroCuenta() + " " + cliente.getSaldo() + " "
					+ cliente.hashCode() + " | " + cliente.toString());
		}

		System.out.println("----------------------- Recorremos con un iterador");
		Iterator<Cliente> it = clientesBanco.iterator();

		while (it.hasNext()) {
			String nombre = it.next().getNombre();
			System.out.println(nombre);
		}

		System.out.println("----------------------- Recorremos y eliminamos un objeto con un for");
		try {
			for (Cliente cliente : clientesBanco) {
				if (cliente.getNombre().equals("Julio Luque")) {
					clientesBanco.remove(cliente);
				}
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Error de concurrencia ");
		}

		System.out.println("----------------------- Recorremos y elminamos un objeto ocn un iterador");
		Iterator<Cliente> itRemove = clientesBanco.iterator();

		while (itRemove.hasNext()) {
			String cliente = itRemove.next().getNombre();
			if (cliente.equals("Julio Luque")) {
				itRemove.remove();
			}
		}

		System.out.println("----------------------- Re-impresion con foreach");
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getNroCuenta() + " " + cliente.getSaldo() + " "
					+ cliente.hashCode());
		}

	}

}
