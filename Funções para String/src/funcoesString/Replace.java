package funcoesString;

public class Replace {

	public static void main(String[] args) {
		
		String original = "abcd FGHI ABC JHB  a a ava   ";

		String s01 = original.replace('a' , 'X');

		System.out.println("original: - " + original);
		System.out.println("substring: - " + s01);

	}

}
