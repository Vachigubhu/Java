public class Account implements InterfaceBankAccount {
    private int total;
    public Account(){
    }
        public void deposit(int amt){
            this.total += amt;
        }
        public void withdraw(int amt){
            this.total -= amt;
        }
        public int getBal(){
            return total;
        }
        public String getBankName(){
            return InterfaceBankAccount.BANK;
        }
        
        public static void main(String[] args) {
            Account Trinity = new Account();
            Trinity.deposit(25);
            Trinity.withdraw(3);
            System.out.println("Balance: " + Trinity.getBal());
        }
}
