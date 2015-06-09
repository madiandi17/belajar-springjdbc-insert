package com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.main;

import com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.dao.ProdukDao;
import com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.model.Produk;
import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringJdbcInsert {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:springjdbc.xml");

        ProdukDao pd = (ProdukDao) ctx.getBean("produkDaoSpring");

    }

}
