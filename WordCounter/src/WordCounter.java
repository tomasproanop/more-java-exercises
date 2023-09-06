import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class WordCounter {

	/*
	 * This program which counts the number of occurrences of each word in a text
	 * file using a FileInputStream, a Scanner, and ArrayLists.
	 */

	public static void main(String[] args) throws IOException {

		// Create input stream & scanner
		FileInputStream fileInStream = new FileInputStream("samplewords.txt");
		Scanner fileInput = new Scanner(fileInStream);

		// Create the ArrayLists

		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();

		// Read through file and find the words
		while (fileInput.hasNext()) {
			// Get next word
			String nextWord = fileInput.next();
			// Determine if word is in ArrayList already

			if (words.contains(nextWord)) {
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index) + 1);
			} else {
				words.add(nextWord);
				count.add(1);
			}
		}

		// Close scanner and file input stream
		fileInput.close();
		fileInStream.close();

		// Print out results
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i) + " occured " + count.get(i) + " time(s).");
		}

	}

}
