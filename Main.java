import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;

/**
 * @author Walter Saldaña #19897
 * @since 26/03/2020 Programa que simula una lista de atencion a clientes en un
 *        hospital
 */

public class Main {

    public static void main(String[] args) {
		//Uso de JFileChooser: https://www.geeksforgeeks.org/java-swing-jfilechooser/
		//Abrir ventana para seleccionar un archivo
		JFileChooser jfc = new JFileChooser();
		jfc.showSaveDialog(null); 
		File file = jfc.getSelectedFile();

		FactoryPriorityQueue<Paciente> factory = new FactoryPriorityQueue<Paciente>();
		//---------------------------------------------------------------------------------------------------> Aqui se cambia la implementacion
		iPriorityQueue<Paciente> myQueue = factory.getPriorityQueue("vector"); // "jcf" o "vector"
		//------------------------------------------------------------------------------------------------------------------------------------l

		//Leer Archivo
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				String data[] = line.split(", ");
				myQueue.add(new Paciente(data[0], data[1], data[2]));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Respuesta del usuario
		Scanner sc =  new Scanner(System.in);
		while(myQueue.size()>0){
			System.out.println("Presione ENTER para despachar al siguiente paciente con urgencia");
			sc.nextLine();
			System.out.println(myQueue.remove().toString());
		}
		sc.close();
    }
}