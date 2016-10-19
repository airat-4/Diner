package dao;

import entity.User;

/**
 * Created by airat on 19.10.16.
 */
public class UserProxy implements User {
    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    @Override
    public boolean authorize(String passWord) {
        return user.authorize(passWord);
    }

    @Override
    public long getId() {
        return user.getId();
    }

    @Override
    public String getName() {
        return user.getName();
    }

    @Override
    public void setName(String name) {
        user.setName(name);
    }

    @Override
    public int getType() {
        return user.getType();
    }

    @Override
    public void setType(int type) {
        user.setType(type);
    }

    @Override
    public double getBalance() {
        return user.getBalance();
    }

    @Override
    public boolean refillBalance(User manager, double amountRefill) {
        return user.refillBalance(manager, amountRefill);
    }

    @Override
    public User getManager() {
        return user.getManager();
    }

    @Override
    public void setManager(User manager) {
        user.setManager(manager);
    }

    @Override
    public boolean changePassWord(String oldPassWord, String newPassWord) {
        return user.changePassWord(oldPassWord, newPassWord);
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }
}
