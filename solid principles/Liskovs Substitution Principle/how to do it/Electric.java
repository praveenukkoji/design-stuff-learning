public class Electric extends Vechile {
    private boolean isCharged = false;

    @Override
    public void start() {
        if (isCharged) {
            System.out.println("Electric vechile is starting");
        } else {
            System.out.println("Electric vechile not charged");
        }
    }
}
