public class SbiUser extends BankApp {
    public SbiUser(String name){

        super(name);
        System.out.println("I'm from SBI");
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("Name of Tax info is:" + taxDetail);
    }
}
