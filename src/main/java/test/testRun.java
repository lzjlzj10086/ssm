package test;

import com.dao.AccountDao;
import com.entity.Account;
import com.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testRun {

    @Test
    public void runSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ac.getBean("accountService",AccountService.class);
        accountService.findAll();
    }
    @Test
    public void runMybatis() throws Exception {
        InputStream in =Resources.getResourceAsStream("sqlApplication.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for (Account account:list){
            System.out.println(account);
        }
        session.close();
        in.close();
    }
    @Test
    public void save() throws Exception {
        InputStream in =Resources.getResourceAsStream("sqlApplication.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setId(4);
        account.setName("ssm3");
        account.setMoney(2637);
        int count = dao.saveAccount(account);
        session.commit();
        session.close();
        in.close();
    }
}
