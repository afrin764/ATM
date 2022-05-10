// Keypad.java

// Represents the keypad of the ATM

package atmmachine;

import java.util.Scanner;

public class Keypad {
    private Scanner input;
    
    public Keypad() {
        input = new Scanner(System.in);
    }
    
    public int getInput() {
        return input.nextInt();
    }
}
