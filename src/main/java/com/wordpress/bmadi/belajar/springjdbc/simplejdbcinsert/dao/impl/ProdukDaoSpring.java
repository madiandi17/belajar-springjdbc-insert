package com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.dao.impl;

import com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.dao.ProdukDao;
import com.wordpress.bmadi.belajar.springjdbc.simplejdbcinsert.model.Produk;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository("produkDaoSpring")
public class ProdukDaoSpring implements ProdukDao {
    
    private SimpleJdbcInsert insertProduk;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        insertProduk = new SimpleJdbcInsert(dataSource)
                .withTableName("PRODUK")
                .usingColumns("kode", "nama", "harga")
                .usingGeneratedKeyColumns("id");
    }
    
    @Override
    public void simpan(Produk p) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kode", p.getKode());
        params.put("nama", p.getNama());
        params.put("harga", p.getHarga());
        
        Number id = insertProduk.executeAndReturnKey(params);
        p.setId(id.intValue());
    }
    
}
