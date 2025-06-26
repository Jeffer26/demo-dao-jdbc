package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("===== Test 1: seller findById =====");
        SellerDao sellerDao = DaoFactory.creatSellerDao();//dessa forma o programa não conhece as dependencias só a interface
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("===== Test 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println();


        System.out.println("===== Test 3: seller findByAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("===== Test 4: seller Insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


        System.out.println("===== Test 5: seller Update =====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("===== Test 6: seller delete =====");
        System.out.print("Enter id for delete: ");
        int id = leitor.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");



    }
}
