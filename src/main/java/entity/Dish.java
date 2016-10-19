package entity;

import java.util.Date;

/**
 * Created by airat on 18.10.16.
 */
public interface Dish {

    long getId();

    String getName();

    void setName(String name);

    double getPrise();

    void setPrise(double prise);

    String getAmount();

    void setAmount(String amount);

    Date getDishDate();

    void setDishDate(Date dishDate);
}
