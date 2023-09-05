import java.util.Iterator;
import java.util.LinkedList;

public class LinkyList {

	public static void main(String[] args) {

		LinkedList<String> linky = new LinkedList<String>();

		linky.add("Rob");
		linky.add("Alex");
		linky.add("Bicho");

		// methods:
		// linky.remove();
		// linky.clear();

		System.out.println(linky);
		System.out.println(linky.getFirst());

		LinkedList<Integer> linky2 = new LinkedList<Integer>();

		linky2.add(33);
		linky2.add(99);
		linky2.add(66);

		System.out.println(linky2);

		Iterator it = linky2.iterator();

		while (it.hasNext()) {
			if ((int) it.next() == 99) {
				System.out.println("we found 99!");

			}
		}

	}

}
