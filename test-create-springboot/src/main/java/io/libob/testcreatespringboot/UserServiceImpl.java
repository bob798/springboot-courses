package io.libob.testcreatespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(String username, String password) {
        jdbcTemplate.update("insert into user(username, password) values (?,?)", username, password);
    }

    @Override
    public void update(String username, String password) {
        jdbcTemplate.update("update user set password = ? where username = ?", password, username);

    }

    @Override
    public List list() {
        return jdbcTemplate.queryForList("select * from user");
    }

    @Override
    public List listByUsername(String username) {
        return jdbcTemplate.queryForList("select  * from user where username = ?", username);
    }

    @Override
    public boolean deleteByUsername(String username) {
        return jdbcTemplate.update("delete from user where username = ?", username) > 0;
    }


}
