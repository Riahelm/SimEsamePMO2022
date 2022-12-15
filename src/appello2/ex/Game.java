package appello2.ex;

import java.util.List;

/**
 * Modella un semplice gioco composto da un numero di livelli definito all'atto della creazione del gioco.
 * A ciascun livello è associato un punteggio, inizialmente pari a zero, 
 * e un numero massimo di mosse eseguibili in quel livello.
 * Per semplicità assumiamo che il numero massimo di mosse consentite sia uguale per tutti i livelli.
 * Il gioco inizia dal primo livello. A seguito di ogni mossa viene decrementato il numero di mosse ancora 
 * consentite per quel livello e aggiornato il punteggio acquisito nel livello corrente.
 * Quando non ci sono più mosse eseguibili, oppure si è accumulato nel livello già un punteggio superiore a un 
 * valore soglia che poniamo a un valore costante pari a 50 in questo gioco, si passa al livello successivo. 
 * Il giocatore può eseguire una mossa solo se il gioco non è terminato. Il gioco termina O perché si è accumulato 
 * un punteggio totale negativo, O perché si sono terminate tutte le mosse dell'ultimo livello.
 * Al termine del gioco è possibile ispezionare l'andamento della partita, e ottenere il punteggio complessivo. 
 */

public interface Game {
	
	/**
     * Implementa una mossa efficace, che ha l'effetto di aumentare di points il punteggio acquisito in quel livello
     * @param numero di punti accumulati con una mossa vincente
     * @throws GameOverException non può essere eseguita se il gioco è terminato
     */
	void successMove(int points) throws GameOverException;
	
	/**
     * Implementa una mossa non efficace, che ha l'effetto di decrementare di penalities il punteggio acquisito in quel livello
     * Se a seguito del decremento si raggiunge un punteggio totale negativo, il gioco termina
     * @param numero di penalità subite per effetto di una mossa sbagliata
     * @throws GameOverException non può essere eseguita se il gioco è terminato
     */
	void wrongMove(int penalities) throws GameOverException;
	
	/**
     * @return il totale dei punti maturati nel gioco fino al livello in cui il giocatore sta giocando. 
     * Al calcolo del punteggio complessivo maturato,
     * concorre anche una premialità per ogni livello precedente in cui il numero di mosse fatte
     * è inferiore alla metà del numero di mosse eseguibili per quel livello. 
     * Si pone il premio per ogni livello che soddisfa questi requisiti a un valore costante pari a 10.
     */
	int totalPoints();
	
	/**
	 * @param numero del livello
     * @return il totale dei punti maturati nel livello x
     */
	int pointsAtLevelX(int x);
	
	/**
     * @return se il gioco è terminato
     */
	boolean isOver();
	
	/**
     * @return il livello corrente in cui il giocatore sta giocando
     */
	int getLevel();
	
	/**
     * @return il numero dei livelli in cui il giocatore ha ottenuto un punteggio strettamente positivo
     */
	List<Integer> successfulLevels();
	
	/**
     * @return il numero di mosse che sono state necessarie per superare ciascun livello
     */
	int[] movesDonePerLevel();
	
}
