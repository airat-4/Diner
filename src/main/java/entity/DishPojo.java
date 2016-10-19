package entity;

import java.util.Date;

/**
 * Created by airat on 19.10.16.
 */
public class DishPojo implements Dish {
    private long id;
    private String name;
    private double prise;
    private String amount;
    private Date dishDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getDishDate() {
        return dishDate;
    }

    public void setDishDate(Date dishDate) {
        this.dishDate = dishDate;
    }
}
