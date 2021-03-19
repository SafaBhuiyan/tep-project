public class Practice {

	public static void main(String[] args) {

		String word = "mirrorrrrrr";

		int rcount = 0;
		System.out.println(word.charAt(0));
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 'r') {

				rcount++;
			}

		}
		System.out.println("The words has " + rcount + " no of r's in it");
	}

}
