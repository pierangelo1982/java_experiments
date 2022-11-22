package basic_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GenerateFirstMessage.generateMessage());
		System.out.println(AnotherMessage.generateAnotherMessage());
		
		System.out.println(AnotherClass.messageOne());
		System.out.println(AnotherClass.messageTwo());

	}
}

class GenerateFirstMessage {
	static String generateMessage() {
		return "Ciao Mondo!";
	}
};

class AnotherMessage {
	static String generateAnotherMessage() {
		return "Hello World!";
	}
}

class AnotherClass {
	static String messageOne() {
		return "Oggi fa caldo!";
	}
	
	static String messageTwo() {
		return "Oggi fa freddo!";
	}
}