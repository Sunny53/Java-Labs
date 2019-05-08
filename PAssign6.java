import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PAssign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner (new File("grades.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}

}
