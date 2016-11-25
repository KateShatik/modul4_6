/**
 * Created by Катя on 26.11.2016.
 */
public interface BankSystem {
    abstract void withdrawOfUser(User user, int amount);
    abstract  void fundUser(User user, int amount);
    abstract void transferMoney(User fromUser, User toUser, int amount);
    abstract  void paySalary(User user);
}
