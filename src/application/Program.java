package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args){

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj );

        SellerDao sellerDao = DaoFactory.creatSellerDao();//dessa forma o programa não conhece as dependencias só a interface

        System.out.println(seller);

    }
}
