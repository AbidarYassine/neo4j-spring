package com.irisi.immo.model.repository;

import com.flipkart.hbaseobjectmapper.AbstractHBDAO;
import com.irisi.immo.model.bean.User;
import org.apache.hadoop.hbase.client.Connection;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends AbstractHBDAO<String, User> {

    public UserDao(Connection connection) {
        super(connection);
    }

}
