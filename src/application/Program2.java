package application;

import model.dao.DepartmentDao;
import model.entities.DaoFactory;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("===== Test 1: Department Insert =====");
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
        Department department = new Department(null, "Music");
        departmentDao.insert(department);
        System.out.println("Department Insered!");

        System.out.println("===== Test 2: Department Update =====");
        Department dep = new Department(3, "D2");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("===== Test 3: department findById =====");
        dep = departmentDao.findById(1);
        System.out.println(dep);
        System.out.println();

        System.out.println("===== Test 4: Department findByAll =====");
        List<Department> list;
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("===== Test 6: seller delete =====");
        int id = leitor.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted!!");

    }
}
