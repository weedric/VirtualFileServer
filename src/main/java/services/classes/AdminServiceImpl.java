package services.classes;

import builder.DaoObjectBuilder;
import dao.interfaces.AdminDao;
import dao.interfaces.UserDao;
import models.classes.User;
import models.exceptions.UserEmptyException;
import services.exceptions.AdminAlreadyExistsException;
import services.interfaces.AdminService;

import static models.constants.UserConstants.GC_EMPTY_USER;
import static services.constants.AdminServiceConstants.GC_ADMIN_ALREADY_EXISTS;

public class AdminServiceImpl implements AdminService {
    private AdminDao gob_adminDao = DaoObjectBuilder.getAdminDaoObject();
    private UserDao gob_userDao = DaoObjectBuilder.getUserDaoObject();

    public boolean addNewAdmin(User iob_user) {
        if (iob_user.testisEmpty()) {
            throw new UserEmptyException(GC_EMPTY_USER);
        }

        User lob_user = gob_userDao.getUser(iob_user.getEmail());
        if (lob_user.getAdminId() > 0) {
            throw new AdminAlreadyExistsException(GC_ADMIN_ALREADY_EXISTS);
        }

        return gob_adminDao.addAdmin(iob_user);
    }
}
