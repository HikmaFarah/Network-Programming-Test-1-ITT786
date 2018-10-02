/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hikma Farah Ali
 */




import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteCSV {



	public static void main(String[] args) {

		List<OpenCSV> OpenCSV = Arrays.asList(
				
				new OpenCSV("One", "is","Satu"),
				new OpenCSV( "Dua", "iss","Two"),
				new OpenCSV( "THREE", "isss","Tiga"));

		FileWriter fileWriter = null;
                

		try {
			fileWriter = new FileWriter("A.CSV");

			fileWriter.append('\n');

			for (OpenCSV customer : OpenCSV) {

				fileWriter.append(customer.getWord());
				fileWriter.append(',');
				fileWriter.append(customer.getAnd());
				fileWriter.append(',');
                                fileWriter.append(customer.getMeaning());
				fileWriter.append(',');
				fileWriter.append('\n');
			}

			System.out.println("Write CSV successfully!");
		} catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Flushing/closing error!");
				e.printStackTrace();
			}
		}
	}
}
