import Model.Data;

public class Main {
	
	private static String inputFileName = "dataInput/dc.in", // Root of the input file.
				   		  outputFileName = ""; // Root of the output file.
	
	private static Data dataObject;
	
	public static void main(String[] args) {
		// Read the input file.
		// TODO - Send all required fields as input.
		dataObject = Utilities.readFile(inputFileName);
		
		System.out.println(dataObject.getPools());
		
		// TODO.
		//Utilities.writeFile(outputFileName);
	}
	
	
}
