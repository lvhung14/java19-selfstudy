package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrow {
	public static void main(String[] args) {
		
	}
	private static boolean createFile(String fileName) throws IOException {
		File file = new File(fileName);
		return file.createNewFile();
	}
}
