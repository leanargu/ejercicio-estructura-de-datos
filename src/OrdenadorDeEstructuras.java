import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class OrdenadorDeEstructuras {


	private static HashMap<String, LinkedList<AñoPremio>> mapaDeEntrada = new HashMap<>();
	private static TreeMap <Integer, LinkedList<TenistaPremio>> mapaDeSalida = new TreeMap<>();
	
	public static void agregarTenista (String tenista, int año, String premio) {
		
		/*Si nuestro mapa no tiene cargada a la tenista como clave agregarla y crearle como valor una nueva linkedlist */
		if (!mapaDeEntrada.containsKey(tenista)) {
			mapaDeEntrada.put(tenista, new LinkedList<AñoPremio>());
		}
		/*Si el mapa tiene cargado  a la tenista obtengo la linkedList de esa tenista y le agrego el objeto año, premio*/
		mapaDeEntrada.get(tenista).add(new AñoPremio(año, premio));
		
	}
	
	public static void ordenar() {
		/*Recorrer las claves la estructura de entrada(Recorro las tenistas)*/
		for(String tenista : mapaDeEntrada.keySet()) {
			/*Recorro la lista de premios asociada a esa tenista*/
			for(AñoPremio añoPremio : mapaDeEntrada.get(tenista)) {
				/*Si mi mapa de salida no tiene cargado el año como clave, lo cargo y creo valor una nueva linkedlist*/
				if(!mapaDeSalida.containsKey(añoPremio.getAño())) {
					mapaDeSalida.put(añoPremio.getAño(), new LinkedList<TenistaPremio>());
				}
				/*Si mi mapa de salida tiene cargado el año como clave, obtengo la linkedList de ese año y le agrego un nuevo objeto tenista premio*/
				mapaDeSalida.get(añoPremio.getAño()).add(new TenistaPremio(tenista,añoPremio.getPremio()));
			}
		}
	}
	
//	2. Se recibe una lista de deportistas premiados con indicación de campeonato y año del premio. Como resultado se debe devolver
//	una lista ordenada por año y para cada año todos los deportistas premiados y el campenato ganado. Por ejemplo, si la lista que se
//	recibe es [(“Gabriela Sabatini”, 1990, “Individual F US Open”), (“Gabriela Sabatini”, 1988, “Dobles F US Open”), (“Steffi Graf”, 1988,
//	“Dobles F US Open”), (“Gabriela Sabatini”, 1991, “Dobles F Wimbledon”), (“Steffi Graf”, 1991, “Dobles F Wimbledon”)] 
//	el resultado
//	debe ser [(1988, [(“Steffi Graf”, “Dobles F US Open”), (“Gabriela Sabatini”, “Dobles F US Open”)]), (1990, [(“Gabriela Sabatini”,
//	“Individual F US Open”)]), (1991, [(“Steffi Graf”, “Wimbledon”), (“Gabriela Sabatini”, “Dobles F Wimbledon”)])].
	
	
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
