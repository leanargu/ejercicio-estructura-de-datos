import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class OrdenadorDeEstructuras {


	private static HashMap<String, LinkedList<A�oPremio>> mapaDeEntrada = new HashMap<>();
	private static TreeMap <Integer, LinkedList<TenistaPremio>> mapaDeSalida = new TreeMap<>();
	
	public static void agregarTenista (String tenista, int a�o, String premio) {
		
		/*Si nuestro mapa no tiene cargada a la tenista como clave agregarla y crearle como valor una nueva linkedlist */
		if (!mapaDeEntrada.containsKey(tenista)) {
			mapaDeEntrada.put(tenista, new LinkedList<A�oPremio>());
		}
		/*Si el mapa tiene cargado  a la tenista obtengo la linkedList de esa tenista y le agrego el objeto a�o, premio*/
		mapaDeEntrada.get(tenista).add(new A�oPremio(a�o, premio));
		
	}
	
	public static void ordenar() {
		/*Recorrer las claves la estructura de entrada(Recorro las tenistas)*/
		for(String tenista : mapaDeEntrada.keySet()) {
			/*Recorro la lista de premios asociada a esa tenista*/
			for(A�oPremio a�oPremio : mapaDeEntrada.get(tenista)) {
				/*Si mi mapa de salida no tiene cargado el a�o como clave, lo cargo y creo valor una nueva linkedlist*/
				if(!mapaDeSalida.containsKey(a�oPremio.getA�o())) {
					mapaDeSalida.put(a�oPremio.getA�o(), new LinkedList<TenistaPremio>());
				}
				/*Si mi mapa de salida tiene cargado el a�o como clave, obtengo la linkedList de ese a�o y le agrego un nuevo objeto tenista premio*/
				mapaDeSalida.get(a�oPremio.getA�o()).add(new TenistaPremio(tenista,a�oPremio.getPremio()));
			}
		}
	}
	
//	2. Se recibe una lista de deportistas premiados con indicaci�n de campeonato y a�o del premio. Como resultado se debe devolver
//	una lista ordenada por a�o y para cada a�o todos los deportistas premiados y el campenato ganado. Por ejemplo, si la lista que se
//	recibe es [(�Gabriela Sabatini�, 1990, �Individual F US Open�), (�Gabriela Sabatini�, 1988, �Dobles F US Open�), (�Steffi Graf�, 1988,
//	�Dobles F US Open�), (�Gabriela Sabatini�, 1991, �Dobles F Wimbledon�), (�Steffi Graf�, 1991, �Dobles F Wimbledon�)] 
//	el resultado
//	debe ser [(1988, [(�Steffi Graf�, �Dobles F US Open�), (�Gabriela Sabatini�, �Dobles F US Open�)]), (1990, [(�Gabriela Sabatini�,
//	�Individual F US Open�)]), (1991, [(�Steffi Graf�, �Wimbledon�), (�Gabriela Sabatini�, �Dobles F Wimbledon�)])].
	
	
	public static void main(String[] args) {
		agregarTenista("GabrielaSabatini",1990,"Individual F US Open");
		agregarTenista("GabrielaSabatini",1988,"Dobles F US Open");
		agregarTenista("Steffi Graf", 1988,"Dobles F US Open");
		agregarTenista("GabrielaSabatini", 1991, "Dobles F Wimbledon");
		agregarTenista("Steffi Graf", 1991, "Dobles F Wimbledon");
		ordenar();
		System.out.println(mapaDeSalida);
	}
	
}
