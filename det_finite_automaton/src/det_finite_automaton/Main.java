package det_finite_automaton;

import java.util.Scanner;

public class Main {
	/**
	 * Constructor
	 */
	private Main() {

	}

	public static void main(String[] args) {
		
		// VERSÃO PARA O USUÁRIO DIGITAR A ENTRADA
		Scanner scanner = new Scanner(System.in);

		System.out.print("Analise a sentença: ");
		String sentence = scanner.nextLine().trim();

		scanner.close();
		
		if(sentence.indexOf("$") >= 0) {
			System.out.println("A sentença \"" + sentence + "\" é inválida");
			return;
	    }
		
		Automaton afd = new Automaton();
		afd.recognize(sentence);
		
		// VERSÃO PARA ENTRADAS PREVIAMENTE INSERIDAS
		/*Automaton afd = new Automaton();
		
		// Question 1a
		String sentences[] = {"a", "ac", "ab", "abc", "aba", "abac", "aabb", "aaaccc", "aaaaaaaaac",
						"aaaaaaaaaccccccc", "aaaaabbbbaccccc", "abacaaaabbbba", "aaaabbbbcccc",
						"abbbbbbbbba", "aaaabbbbac", "aaaaaaaaa", "acababac", "aaabbbba", "accccccc",
						"ɛ", "bbbbbbbbbaccccccc", "bbbbbbbbbac", "bbbbbbbb", "ccccccccc",
						"bbcc", "bca", "cb", "bc", "b", "c"};*/
		
		// Question 1b
		/*String sentences[] = {"aaa", "aaab", "aaac", "aaabbbb", "aaacccc", "aaabcbccbcb",
								"baaa", "caaa", "bbbbaaa", "ccccaaa", "bcaaa",
								"cbaaa", "bbccbcbcaaa", "ɛ", "bcbc", "abcbc", "aaaabbbbc",
								"aaabbbba", "accccccc", "aabcbc", "abc", "aaaaaa", "bbbbbb", "ccccccc",
								"bbcc", "bca", "cb", "bc", "b", "c"};*/
		
		// Question 1c
		/*String sentences[] = {"b", "a", "ab", "aab", "abb", "aaab",
							"abbb", "aaaab", "abbbb", "aaaaab", "abbbbb",
							"aaaaaab", "abbbbbb", "aaaaaaab", "abbbbbbb", "ɛ", "baaaaaaa",
							"bbbbbbba", "aaaabbbb", "bbbbaaaa", "aaabbbba", "bbbbaaaab", "aaaaaa",
							"bbbbbb", "baba", "abab", "baaa", "ba", "aabb", "bbaa"};*/
			
		// Question 1d
		/*String sentences[] = {"a", "ac", "accccccc", "aaaaaaaaa", "bbbbbbbbba", "aaaaaaaaac",
					"aaaaaaaaaccccccc", "bbbbbbbbbac", "bbbbbbbbbaccccccc", "aba", "abac",
					"aaaabbbbac", "aaaaabbbbaccccc", "aaabbbba", "aaaccc", "aaaabbbbc", "aaaabbbbcccc",
					"ab", "aabb", "bc", "bbcc", "bbbbbbbb", "ccccccccc", "abacaaaabbbba", "b", "c", ""};*/
		
		/*for (String sentence : sentences) {
			if(sentence.indexOf("$") >= 0) {
				System.out.println("A sentença \"" + sentence + "\" é inválida");
				return;
			}
			afd.recognize(sentence);
		}*/
		
	}

}
