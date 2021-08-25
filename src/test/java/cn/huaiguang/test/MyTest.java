package cn.huaiguang.test;

import cn.huaiguang.pojo.Books;
import cn.huaiguang.service.impl.BooksServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksServiceImpl booksServiceImpl = (BooksServiceImpl)ac.getBean("booksServiceImpl");
        List<Books> all = booksServiceImpl.getAll();
        for (Books books : all) {
            System.out.println(books);
        }
    }

}
