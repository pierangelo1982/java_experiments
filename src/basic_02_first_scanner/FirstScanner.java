package basic_02_first_scanner;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class FirstScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign 
                9 homecoming 1 
                freight car
        """;
		
		try (Scanner scanner = new Scanner(wordsAndNumbers)) {
				scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
		}
		
		try (Scanner scanner = new Scanner(wordsAndNumbers)) {
			var wordRepetitionNumber = scanner.findAll("car").map(MatchResult::group).count();
			System.out.println(wordRepetitionNumber);
		}
		
		try (Scanner scanner = new Scanner(wordsAndNumbers)) {
			var letterRepetitionNumber = scanner.findAll("a").map(MatchResult::group).count();
			System.out.println(letterRepetitionNumber);
		}
		

	}

}
