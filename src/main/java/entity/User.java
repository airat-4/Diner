package entity;

/**
 * Created by airat on 18.10.16.
 */
public interface User {
    int TUPE_USER = 0;
    int TUPE_MANAGER = 1;

    boolean authorize(String passWord);

    long getId();

    String getName();

    void setName(String name);

    int getType();

    void setType(int type);

    double getBalance();

    boolean refillBalance(User manager, double amountRefill);

    User getManager();

    void setManager(User manager);

    boolean changePassWord(String oldPassWord, String newPassWord);

    String getLogin();

}
