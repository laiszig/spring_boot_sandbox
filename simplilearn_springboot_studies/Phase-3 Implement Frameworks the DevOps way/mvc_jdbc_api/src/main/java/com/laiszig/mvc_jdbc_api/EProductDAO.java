package com.laiszig.mvc_jdbc_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EProductDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<EProduct> getProducts() {
        return jdbcTemplate.query("select * from eproduct", new RowMapper<EProduct>() {

            @Override
            public EProduct mapRow(ResultSet rs, int arg1) throws SQLException {
                EProduct eProduct = new EProduct();
                eProduct.setId(rs.getInt(1));
                eProduct.setName(rs.getString(2));
                eProduct.setPrice(rs.getDouble(3));
                eProduct.setDateAdded(rs.getDate(4));
                return eProduct;
            }
        });
    }
}
