package Library.Controller;

import Library.Dao.DaoImpl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rajalakshmi on 20/4/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDaoImpl userDao;

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    List getUserDetails()
    {
       List records = userDao.getAllRecords();
       return  records;
    }

}
