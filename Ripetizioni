import java.util.Scanner;

/*
 * Consegna: 
 * scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di caratteri
 * (chiedendo prima quanti caratteri voglia inserire)
 * e li ristampa man mano che vengono inseriti.
 * L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
 * dovrà essere ripetuto 5 volte. Risolvere questo esercizio senza usare array.
 */

public class Ripetizioni {

	public static void main(String[] args) {
		
		//creo una variabile di tipo scanner per salvare i dati inseriti dall'utente da tastiera
		Scanner tastiera = new Scanner(System.in);
		
		/*
		 * dato che devo chiedere all'utente 5 sequenze di caratteri
		 * devo creare un ciclo che venga eseguito 5 volte appunto
		 * e creare una variabile che controlli quante sequenze ho chiesto,
		 * quindi sarà un intero inzializzato a 0 (fuori dal ciclo altrimenti l'incremento viene sovrascrito con 0 all'inizio di ogni ciclo)
		 * che incrementa 1 ad ogni esecuzione
		 * 
		 * conta le sequenze eseguite, che devono essere 5 totali
		 */		
		int ripetizioni = 0;
		
		/*
		 * dato che questo è il ciclo che chiede quante lettere l'utente vuole inserire nella sequenza
		 * deve ciclare per 5 volte totali
		 */
		while(ripetizioni < 5) {
			//stampo in console la domanda per l'utente chiedendo quanti caratteri vuole inserire
			System.out.println("Quanti caratteri vuoi inserire?");
			/*
			 * dichiaro una variabile e la inizializzo con il valore immesso dall'utente
			 * mi servirà per determinare quante volte devo eseguire il ciclo (interno) che chiede un carattere appartenente alla sequenza
			 */
			int caratteriSequenza = tastiera.nextInt();
			
			/*
			 * devo chiedere all'utente il carattere che vuole inserire e salvarlo in una variabile
			 * e devo ripetere questa parte tante volte quanto vale il numero inserito alla riga 43
			 * per fare questo uso un ciclo while
			 * e per definire questa condizione ho bisogno di una variabile che memorizzi il numero di caratteri inseriti
			 * così che quando il limite viene raggiunto passo a una nuova sequenza (5 totali)
			 */
			int contoCaratteri = 0;
			while(contoCaratteri < caratteriSequenza) {
				
				//stampo in console la domanda per l'utente, chiedendo di inserire un carattere
				System.out.println("Inserisci un carattere");
				/*
				 * dichiaro una variabile di tipo char che contenga il carattere inserito dall'utente
				 * devo salvarla anche perché devo stamparla subito dopo che è stata inserita
				 * 
				 * essendo una variabile di tipo char e NON String
				 * non è sufficiente usare il metodo .next() perché trasforma ciò che l'utente scrive in una stringa
				 * ma poichè la variabile è di tipo char e non String appunto, si verificherebbe un errore
				 * quindi devo aggiungere il metodo .charAt() passando come parametro lo 0
				 */
				char carattere = tastiera.next().charAt(0);
				
				//stampo in console il carattere appena immesso dall'utente
				System.out.println("hai inserito il carattere " + carattere + "\n");
				
				/*
				 * incrememnto contoCaratteri di 1 per indicare che è stato aggiunto un carattere alla sequenza 
				 * e tenere in memoria il numero di cicli eseguiti
				 * 
				 * se non lo facessi contoCaratteri rimarrebbe con il valore iniziale, quindi 0 
				 * e una volta eseguite tutte le istruzioni del while
				 * tornando a leggere la riga 53 per verificare se la condizione (contoCaratteri < caratteriSequenza)
				 * risulta vera e capire se va eseguito nuovamente il ciclo 
				 * mi troverei sempre davanti ad un valore affermativo e quindi ignorerei il volere dell'utente (caratteriSequenza)
				 * ripetendo la richiesta di un carattere e salvandolo all'infinito
				 */
				contoCaratteri++;
			}
			//incremento la variabile che tiene il conto del numero di sequenze chieste			
			ripetizioni++;
			
		}
		
		//chiudo lo scanner
		tastiera.close();
		
	}

}
