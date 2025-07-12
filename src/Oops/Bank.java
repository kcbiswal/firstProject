package Oops;

public class Bank {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setName("kanha");
        ac.setPassword(1234);

        System.out.println(ac.getName());
        System.out.println(ac.getPassword());
    }
}
