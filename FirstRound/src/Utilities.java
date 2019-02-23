import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.Data;
import Model.Server;

public class Utilities {
	// Method that reads the file.
	public static Data readFile(String inputFileName) {
		// Try to read the file. In case it fails, the exception is caught.
		try {
			String line; // Variable where each line will be registered.
			String [] data; // Array of strings that contains the different cells.
			
			// Open and read the input file.
			FileReader read = new FileReader(inputFileName);
			BufferedReader bufferedReader = new BufferedReader(read);
			
			// Save data of the first line.
			line = bufferedReader.readLine(); // Read the next line.
			data = line.split(" ");
			
			// Instantiate object to return.
			Data dataObject = new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
			
			// Move the unavailable slots to data center.
			for (int i = 0; i < dataObject.getUnavailableSlots(); i++) {
				line = bufferedReader.readLine(); // Read the next line.
				data = line.split(" ");
				dataObject.getDataCenter()[Integer.parseInt(data[0])][Integer.parseInt(data[1])] = "X";
			}
			
			// Move servers to the list.
			for (int i = 0; i < dataObject.getServers(); i++) {
				line = bufferedReader.readLine(); // Read the next line.
				data = line.split(" ");
				dataObject.getServerList().add(new Server(i, Integer.parseInt(data[0]), Integer.parseInt(data[1])));
			}
			
			bufferedReader.close();
			
			return dataObject;
		} catch(IOException e) {
			System.out.println("The file does not exist!");
			return null;
		}
	}
	
	// Method that writes the file.
	public static void writeFile(String outputFileName) {
		FileWriter file = null;
		PrintWriter printWriter = null;
		
		try {
			// Declare and open the file.
			file = new FileWriter(outputFileName);
			printWriter = new PrintWriter(file);
			
			// Write in the file.
			// TODO.
			// String output = "Example";
			// Example: printWriter.println(output);
			
		} catch(Exception e) {
			e.printStackTrace(); // Show error.
		} finally {
			try {
				file.close(); // Close the file.
			} catch (IOException e) {
				e.printStackTrace(); // Show error.
			}
		}
		
	}

	// Method that orders a list by 2 criteria.
	public static List<Server> orderServerList(List<Server> serverList) {
		/*Collections.sort(serverList, new Comparator<Object>() {

	        public int compare(Object o1, Object o2) {

	            Float d1 = ((Server) o1).getDensity();
	            Float d2 = ((Server) o2).getDensity();
	            int sComp = d1.compareTo(d2);
	            System.out.println(sComp);
	            if (sComp != 0) {
	               return sComp;
	            } 

	            Integer s1 = ((Server) o1).getSlots();
	            Integer s2 = ((Server) o2).getSlots();
	            return s1.compareTo(s2);
	    }});*/
		
		
		
		return serverList;
	}
}
