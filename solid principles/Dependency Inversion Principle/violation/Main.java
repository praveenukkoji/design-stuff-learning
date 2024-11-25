// high level class
public class Computer {
    private WiredKeyboard keyboard;

    Computer() {
        this.keyboard = new WiredKeyboard();
    }

    public void use() {
        keyboard.type();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.use(); // typing on wired keyboard
    }
}
