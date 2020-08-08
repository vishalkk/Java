public class Main {
    public static void main(String args[]){

        MyClass john = new MyClass("Myname", 5,29);
//        john.name="Ram";
//        System.out.println(john.name);
        john.setAge(4);
        System.out.println(john.getAge());

    }
}

    class MyClass{

    private String name="jane";
    private int age=21;
    private int accNo;

        public MyClass(String name, int age, int accNo) {
            this.name = name;
            this.age = age;
            this.accNo = accNo;
        }

        public int getAge(){
    return age;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAccNo() {
            return accNo;
        }

        public void setAccNo(int accNo) {
            this.accNo = accNo;
        }
    }


