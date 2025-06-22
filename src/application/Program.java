package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args){

        System.out.println("===== Test 1: seller findById =====");
        SellerDao sellerDao = DaoFactory.creatSellerDao();//dessa forma o programa não conhece as dependencias só a interface
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("===== Test 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

    }
}
