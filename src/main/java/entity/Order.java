package entity;

/**
 * Created by airat on 18.10.16.
 */
public interface Order {

    long getId();

    Dish getDish();

    void setDish(Dish dish);

    User getUser();

    void setUser(User user);

}
