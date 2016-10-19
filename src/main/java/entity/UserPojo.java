package entity;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by airat on 18.10.16.
 */
public class UserPojo implements User {
    private static final String SALT = "6@_GlaDiOLus_5#9";

    private long id;
    private String name;
    private String login;
    private int type;
    private double balance;
    private User manager;
    private String passWordHash;
    private boolean authorized;

    @Override
    public boolean authorize(String passWord) {
        if (passWord == null)
            return false;
        String hash = getHash(passWord);
        authorized = hash.equals(passWordHash);
        return authorized;
    }

    private String getHash(String passWord) {
        String passWordWithSalt = passWord + SALT;
        MessageDigest md;
        byte[] hash = null;
        try {
            md = MessageDigest.getInstance("SHA-512");
            hash = md.digest(passWordWithSalt.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return convertToHex(hash);
    }

    private String convertToHex(byte[] raw) {
        StringBuilder sb = new StringBuilder();
        for (byte aRaw : raw) {
            sb.append(Integer.toString((aRaw & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean refillBalance(User manager, double amountRefill) {
        if (manager.getId() != this.manager.getId())
            return false;
        balance += amountRefill;
        return true;
    }

    @Override
    public User getManager() {
        return manager;
    }

    @Override
    public void setManager(User manager) {
        this.manager = manager;
    }

    @Override
    public boolean changePassWord(String oldPassWord, String newPassWord) {
        if (oldPassWord == null || newPassWord == null)
            return false;
        if (!passWordHash.equals(getHash(oldPassWord)))
            return false;
        passWordHash = getHash(newPassWord);
        return true;
    }

    public String getPassWordHash() {
        return passWordHash;
    }

    public void setPassWordHash(String passWordHash) {
        this.passWordHash = passWordHash;
    }

    @Override
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
