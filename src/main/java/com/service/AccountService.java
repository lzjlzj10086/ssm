package com.service;

import com.dao.AccountDao;
import com.entity.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service
public class AccountService {

    @Resource
    private AccountDao accountDao;

    public List<Account> findAll(){
        System.out.println("spring执行...");
        List<Account> list =accountDao.findAll();
        return list;
    }

    public int saveAccount(Account account){

        return accountDao.saveAccount(account);
    }
}
