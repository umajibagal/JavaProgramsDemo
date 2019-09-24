/**
 * Sayaji Bagal 
 */
package stringprograms;

/**
 * @author Sharannya
 *
 */
public class Pallindrom {

	public static void main(String[] args) {

		System.out.println("approach 1");
		String str = "madam";
		if (pallindromString1(str))
			System.out.println("String is pallindrom : " + str);
		else
			System.out.println("String is not pallindrom : " + str);

		System.out.println("approach 2");
		if (pallindromString2(str))
			System.out.println("String is pallindrom : " + str);
		else
			System.out.println("String is not pallindrom : " + str);

	}

	public static boolean pallindromString1(String str) {
		System.out.println("String  : " + str);

		StringBuffer sb = new StringBuffer(str);

		if (sb.reverse().toString().equals(str))
			return true;
		else
			return false;
	}

	public static boolean pallindromString2(String str) {

		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
		}
		return true;
	}

}
