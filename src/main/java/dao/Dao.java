package dao;

import entity.Dish;
import entity.Order;
import entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by airat on 18.10.16.
 */
public interface Dao {

    User getUser(long id);

    List<User> getAllUsers();

    List<User> getManagers();

    void createUser(String login, String passWord);

    void removeUser(User user);

    Dish getDish(long id);

    List<Dish> getDishes(Date dishDate);

    void addDish(Dish dish);

    void removeDishesAndOrdersBeforeData(Date before);

    Order getOrder(long id);

    List<Order> getOrders(User user, Date dishDate);

    List<Order> getOrdersByManager(User manager, Date dishDate);

    void addOrder(Order order);

    void flush();

}
