package model.entities;

import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC();
    }
}
