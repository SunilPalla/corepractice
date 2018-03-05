package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by sunilp on 2/12/18.
 */
public class WordCount {

	public static void main(String[] args) {
		//wordCount();
		wordCountJava8();
	}

	private static void wordCountJava8() {

		try {
			List<String> lines = Files.readAllLines(Paths.get("/Users/sunilp/Downloads/wordcount.txt"));
			lines.stream().forEach(line -> System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void wordCount() {
		try {
			String currentLine = null;
			int wordCount = 0;
			BufferedReader br = new BufferedReader(new FileReader("/Users/sunilp/Downloads/wordcount.txt"));

			while(br.readLine() != null) {
				currentLine = br.readLine();
				wordCount = currentLine.split("\t").length;
				System.out.println("Line "+currentLine+" has " + wordCount);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
