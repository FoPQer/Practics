package Prac22.Number1;

public class SimbolException extends Exception {
    private final char chr;

    public char getChr() {
        return chr;
    }

    SimbolException(String message, char chr){
        super(message);
        this.chr = chr;
    }
}
