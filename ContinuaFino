import java.util.Scanner;

/* Consegna:
 * scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di interi
 * il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
 * almeno una delle seguenti condizioni:
 * • è negativo e divisibile per 2
 * • è positivo e divisibile per 3
 * al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
 * Risolvere questo esercizio senza usare array.
 */

public class ContinuaFino {

	public static void main(String[] args) {
		
		//creo uno scanner per poter prendere i valori inseriti dall'utente
		Scanner tastiera = new Scanner(System.in);
		
		//stampo in console la domanda per l'utente
		System.out.println("Inserisci un numero");
		//dichiaro e inizializzo una variabile per poter immagazzinare il valore inserito dall'utente
		int numeroSequenza = tastiera.nextInt();
		
		/*
		 * devo chiedere all'utente di inserire un numero fino a quando il valore immesso non rispetta più le condizioni
		 * quindi o è negativo e divisibile per 2
		 * o è positivo e divisibile per 3
		 * quindi ad ogni ciclo chiederò il valore
		 */
		
		
		/*
		 * dichiaro e inizializzo a zero una variabile che conterrà la somma di tutti i numeri che rispettano le condizioni
		 */
		int somma = 0;
		
		while((numeroSequenza < 0 && numeroSequenza % 2 == 0) || (numeroSequenza > 0 && numeroSequenza % 3 == 0)){
			/*
			 * anche se il primo numero è stato immesso dall'utente estrenamente al ciclo
			 * lo inserisco nella somma solamente una volta all'inteno del ciclo
			 * perché se non rispettava le condizioni non deve essere aggiunto e quindi anche il ciclo non deve essere eseguito
			 */
			somma += numeroSequenza;
			System.out.println("\nInserisci un numero");
			numeroSequenza = tastiera.nextInt();
			
			/*
			 * dato che al termine del ciclo devo stampare la somma dei valori inseriti meno quello che ha violato le condizioni
			 * ho bisogno di una variabile che immagazzini il valore immesso da tastiera e lo incrementi per ogni numero valido
			 * quindi la inizializzo all'esterno del ciclo per non "resettarla" ad ogni ciclo
			 * e la incremento con il nuovo valore che inserisce l'utente ogni volta
			 */
			
		}
		
		System.out.println("----------\nLa somma dei numeri che rispettano le condizioni vale: " + somma);
		
		//chiudo lo scanner
		tastiera.close();

	}

}
