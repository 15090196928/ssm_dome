package junxia.ma.service.Impl;

import junxia.ma.dao.AccountDao;
import junxia.ma.domain.Account;
import junxia.ma.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有用户信息");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存用户信息");
        accountDao.saveAccount(account);
    }
}
