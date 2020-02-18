package sk.itsovy.dolinsky.unittests;

/**
 * @author Martin Dolinsky
 */
public class Text {

	String reverse(String text) {
		StringBuilder result = new StringBuilder();
		for (int i = text.length()-1; i >= 0; i--) {
			result.append(text.charAt(i));
		}
		return result.toString();
	}
}
