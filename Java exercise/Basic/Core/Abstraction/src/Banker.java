public  abstract class Banker {
    private String name;
    private String tax;
    private double bal;

    public Banker(String name, String tax, double bal) {
        this.name = name;
        this.tax = tax;
        this.bal = bal;
    }


    public void greets(){
        System.out.println("Name is:" + this.name +"Balanceis :" + this.bal );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
