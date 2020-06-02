package com.dao;

import com.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    int saveAccount(Account account);
}
