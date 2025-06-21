package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args){

        SellerDao sellerDao = DaoFactory.creatSellerDao();//dessa forma o programa não conhece as dependencias só a interface

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
