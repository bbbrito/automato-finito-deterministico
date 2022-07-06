package det_finite_automaton;

import java.util.HashMap;
import java.util.Map;

public class Automaton {
	
	/**
	 * Estados do Automato Finito Deterministico (AFD)
	 */
	private Map<Integer, State> states;
	
	/**
	 * Constructor
	 */
	public Automaton() {
		states = new HashMap<>();
		
		// Autômato da questão 1a - expressão regular: (ab*c*)*
		State q0 = new State(true);
		q0.addTransition('ɛ', 0);
		q0.addTransition('a', 1);
		q0.addTransition('$', 0);
		states.put(0, q0);
		
		State q1 = new State(true);
		q1.addTransition('a', 1);
		q1.addTransition('b', 2);
		q1.addTransition('c', 3);
		q1.addTransition('$', 1);
		states.put(1, q1);
		
		State q2 = new State(true);
		q2.addTransition('a', 1);
		q2.addTransition('b', 2);
		q2.addTransition('c', 3);
		q2.addTransition('$', 2);
		states.put(2, q2);
		
		State q3 = new State(true);
		q3.addTransition('a', 1);
		q3.addTransition('c', 3);
		q3.addTransition('$', 3);
		states.put(3, q3);
	
		// Autômato da questão 1b - expressão regular: aaa(b | c)* | (b | c)* aaa
		/*State q0 = new State(false);
		  q0.addTransition('a', 1);
		  q0.addTransition('b', 3);
		  q0.addTransition('c', 2);
		  states.put(0, q0);
		
		  State q1 = new State(false);
		  q1.addTransition('a', 4);
		  states.put(1, q1);
		
		  State q2 = new State(false);
		  q2.addTransition('a', 5);
		  q2.addTransition('b', 3);
		  q2.addTransition('c', 2);
		  states.put(2, q2);
		
		  State q3 = new State(false);
		  q3.addTransition('a', 5);
		  q3.addTransition('b', 3);
		  q3.addTransition('c', 2);
		  states.put(3, q3);
		
		  State q4 = new State(false);
		  q4.addTransition('a', 6);
		  states.put(4, q4);
		
		  State q5 = new State(false);
		  q5.addTransition('a', 7);
		  states.put(5, q5);
		
		  State q6 = new State(true);
		  q6.addTransition('b', 9);
		  q6.addTransition('c', 8);
		  q6.addTransition('$', 6);
		  states.put(6, q6);
		
		  State q7 = new State(false);
		  q7.addTransition('a', 10);
		  states.put(7, q7);
		
		  State q8 = new State(true);
		  q8.addTransition('b', 9);
		  q8.addTransition('c', 8);
		  q8.addTransition('$', 8);
		  states.put(8, q8);
		
		  State q9 = new State(true);
		  q9.addTransition('b', 9);
		  q9.addTransition('c', 8);
		  q9.addTransition('$', 9);
		  states.put(9, q9);
		
		  State q10 = new State(true);
		  q10.addTransition('$', 10);
		  states.put(10, q10);*/
		
		// Autômato da questão 1c - expressão regular: a*b | ab* 
		/*State q0 = new State(false);
		  q0.addTransition('a', 2);
		  q0.addTransition('b', 1);
		  states.put(0, q0);
		
		  State q1 = new State(true);
		  q1.addTransition('$', 1);
		  states.put(1, q1);
		
		  State q2 = new State(true);
		  q2.addTransition('a', 4);
		  q2.addTransition('b', 3);
		  q2.addTransition('$', 2);
		  states.put(2, q2);
		
		  State q3 = new State(true);
		  q3.addTransition('b', 5);
		  q3.addTransition('$', 3);
		  states.put(3, q3);
		
		  State q4 = new State(false);
		  q4.addTransition('a', 4);
		  q4.addTransition('b', 1);
		  states.put(4, q4);
		
		  State q5 = new State(true);
		  q5.addTransition('b', 5);
		  q5.addTransition('$', 5);
		  states.put(5, q5);*/
		
		// Autômato da questão 1d - expressão regular: a*b* (a | ac*) 
		/* State q0 = new State(false);
		  q0.addTransition('a', 2);
		  q0.addTransition('b', 1);
		  states.put(0, q0);
		
		  State q1 = new State(false);
		  q1.addTransition('a', 3);
		  q1.addTransition('b', 1);
		  states.put(1, q1);
		
		  State q2 = new State(true);
		  q2.addTransition('a', 2);
		  q2.addTransition('b', 1);
		  q2.addTransition('c', 4);
		  q2.addTransition('$', 2);
		  states.put(2, q2);
		
		  State q3 = new State(true);
		  q3.addTransition('c', 4);
		  q3.addTransition('$', 3);
		  states.put(3, q3);
		
		  State q4 = new State(true);
		  q4.addTransition('c', 4);
		  q4.addTransition('$', 4);
		  states.put(4, q4);*/

	}

	/**
	 * Formatar o estado para impressao
	 *
	 * @param state estado
	 * @return estado formatado para impressao
	 */
	// VERSÃO PARA O USUÁRIO DIGITAR A ENTRADA
	private String formatState(Integer state) {
	
		if((states.size() < 100) && (state < 10)) {
			return "\nq" + state + "  - ";
		}
		
		return "\nq" + state + " - ";
	}
	
	/**
	 * Reconhecer a sentenca de entrada
	 *
	 * @param sentence sentenca de entrada
	 * @return true caso a sentenca de entrada pertenca a linguagem,
	 *   false em caso contrario
	 */
	public boolean recognize(String sentence) {
	
		// VERSÃO PARA O USUÁRIO DIGITAR A ENTRADA
		String input = sentence + "$";
		
		System.out.print("Observação: \"$\" representa o fim da sentença");
		
		Integer state = 0;
		
		for(int symbol = 0; symbol < input.length(); symbol++) {
			System.out.print(formatState(state));
	
			for(int i = 0; i < input.length(); i++)	{
				if(i != symbol)	{
					System.out.print(" " + input.charAt(i) + " ");
				} else {
				System.out.print("[" + input.charAt(i) + "]");
				}
			}
			state = states.get(state).getTransition(input.charAt(symbol));
	
			if(state == null) {
				if(sentence.isEmpty()) {
					sentence = "{ }";
				}
				System.out.println(" - REJEITA");
				return false;
			}
		}
		
		if(states.get(state).isAccept()) {
			System.out.println(" - ACEITA");
		} else {
			System.out.println(" - REJEITA");
		}
		
		return states.get(state).isAccept();
	
		// VERSÃO PARA ENTRADAS PREVIAMENTE INSERIDAS
		/*String input = sentence + "$";
		Integer state = 0;
	
		for(int symbol = 0; symbol < input.length(); symbol++) {
			state = states.get(state).getTransition(input.charAt(symbol));
	
			if(state == null) {
				if(sentence.isEmpty()) {
					sentence = "{ }";
				}
				System.out.print(sentence);
				System.out.println(" - REJEITA");
				return false;
			}
		}
	
		System.out.print(sentence);
	
		if(states.get(state).isAccept()) {
			System.out.println(" - ACEITA");
		} else {
			System.out.println(" - REJEITA");
		}
	
		return states.get(state).isAccept();*/
	}

}
