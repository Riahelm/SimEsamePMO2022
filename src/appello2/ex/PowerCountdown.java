package appello2.ex;

/**
 * Interfaccia che modella un contatore con caratteristiche aggiuntive. 
 * Può essere resettato in ogni momento, e la velocità di decremento può essere aumentata.
 */
public interface PowerCountdown extends Countdown {
    
    /**
     * Utilizzato per resettare il contatore alle sue condizioni iniziali (le stesse della fase di costruzione iniziale)
     */
    void reset();
    
    /**
     * Aumenta la velocità di decremento a seconda della scelta implementativa.
     */
    void speedup();

}
