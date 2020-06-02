package com.controller;

import com.entity.Account;
import com.service.AccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("controller执行...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        for (Account account:list){
            System.out.println(account);
        }
        return "success";
    }
    @RequestMapping("save")
    public void save(HttpServletResponse response, HttpServletRequest request,Account account) throws Exception {
        System.out.println("save执行....");
        int count = accountService.saveAccount(account);
        if (count != 0){
            response.sendRedirect(request.getContextPath()+"/account/findAll");
        }else{
            System.out.println("错误....");
        }
        return ;
    }
}
