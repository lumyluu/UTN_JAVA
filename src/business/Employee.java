package business;

public class Employee extends Person {
        private double bankAccount;
        private int antiquity;

        public Employee() {

        }

        public double getBankAccount() {
                return bankAccount;
        }

        public void setBankAccount(double bankAccount) {
                this.bankAccount = bankAccount;
        }

        public int getAntiquity (){
                return antiquity;
        }
        public void setAntiquity(int antiquity) {
                this.antiquity = antiquity;
        }


}
