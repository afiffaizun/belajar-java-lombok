package data.lombok;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileHelperTest {
	
	@Test
	void testPom() throws Exception {
		String text = FileHelper.loadFile("pom.xml");
		System.out.println(text);
	}
	
	@Test
	void testFileNotFound() {
		Assertions.assertThrows(FileNotFoundException.class, () -> {
			FileHelper.loadFile("tidakada.txt");
		});
	}
}
