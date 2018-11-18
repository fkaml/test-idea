package dao;

import domain.User;

public interface UserDao {

    User findOne(String name);
}
