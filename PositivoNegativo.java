import java.util.Scanner;

/*
 * Consegna:
 * scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza di interi 
 * che termina quando l’utente immette il valore 0 
 * e poi stampa "OK" se la sequenza contiene un valore positivo seguito da uno negativo, 
 * altrimenti stampa il messaggio "NO". 
 * A vostra scelta, la stampa del messaggio "OK" può interrompere o meno l’inserimento dei valori. 
 * Risolvere questo esercizio senza usare array.
 */

public class PositivoNegativo {

	public static void main(String[] args) {
		
		//creo uno scanner per prendere i valori immessi dall'utente
		Scanner tastiera = new Scanner(System.in);
		
		//stampo in console la domanda per l'utente
		System.out.println("Inserisci un numero");
		//creo una variabile per poter immagazzinare il valore immesso dall'utente
		int numeroUtente = tastiera.nextInt();
		
		int precedente;
		/*
		 * userò questa variabile per verificare se la condizione che determina la stampa si realizza
		 * nel caso in cui il valore da 0 si modificasse significherebbe che almeno una volta la condizione
		 * si presenta e quindi alla fine della sequenza devo stampare il messaggio affermativo
		 */
		int verifica = 0;
		
		/*
		 * devo chiedere all'utente un nuovo numero fintanto che immette valori diversi da 0
		 * questa sarà la condizione del ciclo, che quindi eseguirà il controllo anche sul valore immesso alla riga 25
		 */
		
		while(numeroUtente != 0) {
			/*
			 * dato che alla fine del ciclo devo stampare se si è verificata una certa condizione
			 * (numero positivo seguito da un numero negativo)
			 * all'interno del ciclo devo controllare se questa condizione si verifica almeno una volta
			 * e tenermi questo dato in memoria per non perderlo nel caso in cui l'ultima coppia di numeri non rispetti la condizione
			 * 
			 * per fare questo decido di inizializzare una variabile d'appoggio (dichiarata fuori -riga25-) che salvi il numero precedente
			 * rispetto a quello che viene raccolto ad ogni nuovo ciclo, così da poter fare il confronto una volta
			 * ricevuto il secondo numero della coppia
			 */
			precedente = numeroUtente;
			//stampo la domanda per l'inserimento del nuovo numero
			System.out.println("\nInserisci un nuovo numero");
			numeroUtente = tastiera.nextInt();
			
			/*
			 * adesso ho salvati sia il precedente numero che quello attuale
			 * e posso verificare se la condizione che determina la stampa finale si verifica
			 */
			if(precedente > 0 && numeroUtente < 0)
				verifica++;
			
		}
		
		//se il valore di verifica si è modoficato si è presentata la condizione determinante, quindi stampo il messaggio positivo
		if(verifica != 0)
			System.out.println("----------\nAll'interno della sequenza si è verificato almeno una volta che un numero positivo fosse seguito da uno negativo");
		//altrimenti stampo il messaggio negativo
		else
			System.out.println("----------\nAll'interno della sequenza non si è mai verificato che un numero positivo fosse seguito da uno negativo");
		//chiudo lo scanner
		tastiera.close();

	}

}
