/**
 * Created by Катя on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(11,"US",Currency.USD,1000000,7000,10,100000000);
        Bank euBank = new EUBank(11,"Swiss",Currency.EUR,1000000,17000,5,100000000);
        Bank chinaBank = new ChinaBank(11,"China",Currency.USD,10000,700,20,10000);
        User user1= new User(11,"Olga",1000,10,10000,"Apple",usBank);
        User user2= new User(101,"Mark",179000,10,1003200,"Apple",usBank);
        User user3= new User (102,"Masha",1200,10,10030,"Sony",euBank);
        User user4= new User(102,"Sasha",1200,10,10030,"Sony",euBank);
        User user5= new User(11,"Ohha",1000,10,10000,"Apple",chinaBank);
        User user6= new User(11,"Ollla",1000,10,10000,"Apple",chinaBank);



        System.out.println(user1.getBank().getLimitOfWithdrawal());
        System.out.println(user1.getBank().getLimitOfFunding());
        System.out.println(user1.getBank().getMonthlyRate());
        System.out.println(user1.getBank().getCommission((int)user1.getBalance()));

        System.out.println(user2.getBank().getLimitOfWithdrawal());
        System.out.println(user2.getBank().getLimitOfFunding());
        System.out.println(user2.getBank().getMonthlyRate());
        System.out.println(user2.getBank().getCommission((int)user2.getBalance()));

        System.out.println(user3.getBank().getLimitOfWithdrawal());
        System.out.println(user3.getBank().getLimitOfFunding());
        System.out.println(user3.getBank().getMonthlyRate());
        System.out.println(user3.getBank().getCommission((int)user3.getBalance()));

        System.out.println(user4.getBank().getLimitOfWithdrawal());
        System.out.println(user4.getBank().getLimitOfFunding());
        System.out.println(user4.getBank().getMonthlyRate());
        System.out.println(user4.getBank().getCommission((int)user4.getBalance()));

        System.out.println(user5.getBank().getLimitOfWithdrawal());
        System.out.println(user5.getBank().getLimitOfFunding());
        System.out.println(user5.getBank().getMonthlyRate());
        System.out.println(user5.getBank().getCommission((int)user5.getBalance()));

        System.out.println(user6.getBank().getLimitOfWithdrawal());
        System.out.println(user6.getBank().getLimitOfFunding());
        System.out.println(user6.getBank().getMonthlyRate());
        System.out.println(user6.getBank().getCommission((int)user6.getBalance()));
    }
}
