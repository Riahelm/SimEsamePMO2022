package appello2.ex;

/**
 * Interfaccia che modella un contatore, che partee da un valore iniziale e viene decrementato fino a un valore finale.
 * Quando il valore finale è raggiunto, non può più essere decrementato, altrimenti viene lanciata una eccezione.
 */
public interface Countdown {

    /**
     * Decrementa il valore corrente del contatore
     *  @throws IllegalStateException non può essere decrementato perché il contatore è terminato
     */
    void decrease(); // can throw a IllegalStateException
    
    /**
     * @return il valore corrente del contatore
     */
    int getValue();
    
    /**
     * @return se il contatore è terminato o meno
     */
    boolean isOver(); 
    
}
