package testng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RcbTeamUtil {

	public static void main(String[] args) {
		String filePath = "src/test/resources/TeamRCB.json";
		String stubbedJsonResponse = getStubbedData(filePath);
		System.out.println(stubbedJsonResponse);
	}
	
	public static String getStubbedData(String filePath) {
		String stubbedJsonResponse = "";				

		StringBuilder contentBuilder = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));		

		    String sCurrentLine;
		    while ((sCurrentLine = br.readLine()) != null) {
		        contentBuilder.append(sCurrentLine).append("\n");
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}

		stubbedJsonResponse = contentBuilder.toString();		
		
		return stubbedJsonResponse;
	}	

}
