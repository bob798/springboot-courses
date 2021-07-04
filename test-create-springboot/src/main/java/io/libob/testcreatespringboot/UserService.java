package io.libob.testcreatespringboot;

import java.util.List;

public interface UserService {

    void insert(String username, String password);
    void update(String username, String password);

    List list();

    List listByUsername(String username);

    boolean deleteByUsername(String username);
}
