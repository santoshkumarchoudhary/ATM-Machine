import java.util.*;

 class ATM{
    float balance;
    int pin = 1234;
    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int EnteredPin = sc.nextInt();
        if(EnteredPin==pin){
            menu();
        }else{
            System.out.println("Enter valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. check A/C balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option ==1){
            check_balance();
        }else if(option==2){
            withdraw_money();
        }else if(option==3){
            deposit_money();
        }else if(option==4){
            System.out.println("Thank you");
        }else{
            System.out.println("Enter a valid choice");
        }
    }
    public void check_balance(){
        System.out.println("Balance: "+ balance);
        menu();
    }
    public void withdraw_money(){
        System.out.println("Enter your amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>=balance){
            System.out.println("Insufficient fund");
        }else{
            balance-=amount;
            System.out.println("please collect your money");

        }
        menu();
    }
    public void deposit_money(){
        System.out.println("Enter your amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance+=amount;
        System.out.println("Your money has been successfully deposited");
        menu();
    }
}
 class ATMMachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}