package Library.Dao.DaoImpl;

import Library.Config.HibernateConnector;
import Library.Dao.UserDao;
import Library.Model.TestUser;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rajalakshmi on 20/4/18.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    HibernateConnector hibernateConnector;

  /*  @Autowired
    SessionFactory sessionFactory*/

    public List getAllRecords()
    {
        SessionFactory sessionFactory = (SessionFactory) HibernateConnector.buildSessionFactory().openSession();
        Session session = sessionFactory.getCurrentSession();
        Criteria cr = session.createCriteria(TestUser.class);
        session.beginTransaction();
        List records = cr.list();
        return  records;

    }
}
