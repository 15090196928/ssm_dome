package junxia.ma.test;

import junxia.ma.dao.AccountDao;
import junxia.ma.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TextMyBatis {

    @Test
    public  void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取到带理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //新增数据
        Account account1 = new Account();
        account1.setMoney(440d);
        account1.setName("老大");
        dao.saveAccount(account1);
        session.commit();
        //查询数据
        List<Account> list = dao.findAll();
        for (Account account: list
             ) {
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();

    }
}
