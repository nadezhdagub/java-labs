public class Picture implements Present {
    @Override
    public void whoAmI() {
        System.out.println("Picture");
    }

    @Override
    public String it_can_be_presented(String i) {
        return i;
    }
}