public class Toy implements Present {
    @Override
    public void whoAmI() {
        System.out.println("Toy");
    }

    @Override

    public String it_can_be_presented(String i) {
        return i;
    }
}