import Model.Data;

public class Main {
	
	private static String inputFileName = "dataInput/dc2.in", // Root of the input file.
				   		  outputFileName = ""; // Root of the output file.
	
	private static Data dataObject;
	
	public static void main(String[] args) {
		// Read the input file.
		dataObject = Utilities.readFile(inputFileName);
		
		dataObject.showServerList();
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO.
		//Utilities.writeFile(outputFileName);
		
		
		
		
		
		/*for (int i = 0; i < dataObject.getRows(); i++) {
			for (int j = 0; j < dataObject.getSlotsPerRow(); j++) {
				System.out.print(dataObject.getDataCenter()[i][j] + " ");
			}
			System.out.println("");
		}*/
	}
	
	
}
