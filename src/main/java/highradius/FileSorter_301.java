package highradius;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FileSorter_301 {

	public FileSorter_301() {
	}

	private static final String INPUT_FILE_PATH = "/Users/sunilp/301/person.csv";
	private static final String OUTPUT_FILE_PATH = "/Users/sunilp/301/person_sorted.csv";
	private static final String FILE_HEADER = "Name,Age,Gender";
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	private static Comparator<Person_301> AGE_COMPARATOR =
					(Person_301 o1, Person_301 o2) -> o1.getAge() - o2.getAge();

	public void sortFile(String inputFilePath, String outputFilePath) {
		List<Person_301> persons = new ArrayList<>();
		//file reading and sorting
		try {
			Stream<String> stream = Files.readAllLines(Paths.get(inputFilePath)).stream();
			//skip the header
			stream.skip(1).forEach(s -> {
				String lines[] = s.split(",");
				Person_301 person = new Person_301(lines[0],Integer.parseInt(lines[1]),lines[2]);
				persons.add(person);
			});
			//sort by age.
			Collections.sort(persons,AGE_COMPARATOR);

			//Write to output file.
			writeSortedFile(persons,outputFilePath);

		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Person_301 eachPerson : persons) {
			System.out.println("Person : "+ eachPerson.toString());
		}

	}

	//file writing to a csv file after sorting
	public void writeSortedFile(List<Person_301> persons, String outputFilePath) {

		try {
			FileWriter writer = new FileWriter(Paths.get(outputFilePath).toFile());
			writer.append(FILE_HEADER);
			writer.append(NEW_LINE_SEPARATOR);
			persons.stream().forEach(person -> {
				try {
					writer.append(person.getName());
					writer.append(COMMA_DELIMITER);
					writer.append(String.valueOf(person.getAge()));
					writer.append(COMMA_DELIMITER);
					writer.append(person.getGender());
					writer.append(NEW_LINE_SEPARATOR);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			System.out.println("CSV file created successfully !!!");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileSorter_301 fileSorter = new FileSorter_301();
		fileSorter.sortFile(INPUT_FILE_PATH, OUTPUT_FILE_PATH);
	}
}
