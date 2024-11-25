// high level class
public class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void use() {
        keyboard.type();
    }
}

public class Main {
    public static void main(String[] args) {
        WiredKeyboard wired = new WiredKeyboard();
        Computer computer = new Computer(wired); // pass wired or wireless keyboard object
        computer.use(); // Typing on wired keyboard

        WirelessKeyboard wireless = new WirelessKeyboard();
        Computer computer = new Computer(wireless); // pass wired or wireless keyboard object
        computer.use(); // Typing on wireless keyboard
    }
}
