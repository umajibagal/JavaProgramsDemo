package stringprograms;

public class ReplaceCharacter {

	public static void main(String[] args) {
		replaceAll("Abc",'c');
	}
	
	public static void replaceAll(String str,char ch) {
		System.out.println(str.replace(Character.toString(ch), ""));
	}

}
