public class Electric extends Vechile {
    private boolean isCharged = false;

    // violation of LSP
    @Override
    public void start() {
        if (isCharged) {
            System.out.println("Electric vechile is starting");
        } else {
            throw SomeError;
        }
    }
}
