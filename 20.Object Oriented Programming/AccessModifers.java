public class AccessModifers{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username="JapjotSingh";
        myAcc.setPassword("TheycallmeSJ");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}