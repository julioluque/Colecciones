import java.util.HashSet;
import java.util.Set;

public class CuentaUsuarios {

	public static void main(String[] args) {

//		Creada la clase, la instanciamos con nuevos clientes
		Cliente c1 = new Cliente("Julio", "0001011", 200000);
		Cliente c2 = new Cliente("Juan", "0001012", 300000);
		Cliente c3 = new Cliente("Maria", "0001013", 400000);
		Cliente c4 = new Cliente("Martina", "0001014", 500000);
		Cliente c5 = new Cliente("Julio", "0001011", 200000);

//		Creamos la coleccion

		Set<Cliente> clientesBanco = new HashSet<Cliente>();

//		agregamos los clientes a dicha coleccion
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		clientesBanco.add(c5);

		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getNroCuenta() + " " + cliente.getSaldo() + " "
					+ cliente.hashCode() + " | " + cliente.toString());

		}

	}

}
