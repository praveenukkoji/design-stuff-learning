public class Robot implements Worker {

    @Override
    public void work() {

    }

    // violation of ISP as robots do not eat or sleep
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
