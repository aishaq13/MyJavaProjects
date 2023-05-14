package Chapter11Assingment;

import java.util.Scanner;

class DivisionException extends Exception {
    public DivisionException() {
        super("Error: you cannot divide by zero");
    }
}

