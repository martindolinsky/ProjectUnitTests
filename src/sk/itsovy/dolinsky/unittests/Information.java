package sk.itsovy.dolinsky.unittests;

/**
 * @author Martin Dolinsky
 */
public class Information {

	String convertToBinary(int x) {
		StringBuilder binaryText = new StringBuilder();
		while (x > 0) {
			binaryText.insert(0, ((x % 2) == 0 ? "0" : "1"));
			x = x / 2;
		}
		return binaryText.toString();
	}
}
