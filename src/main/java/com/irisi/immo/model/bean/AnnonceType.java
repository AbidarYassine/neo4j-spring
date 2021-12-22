package com.irisi.immo.model.bean;

import com.flipkart.hbaseobjectmapper.Family;
import com.flipkart.hbaseobjectmapper.HBColumn;
import com.flipkart.hbaseobjectmapper.HBRecord;
import com.flipkart.hbaseobjectmapper.HBTable;

import java.io.Serializable;
import java.util.List;

@HBTable(name = "annonceTypes", families = {
        @Family(name = "main")
})
public class AnnonceType implements HBRecord<String>, Serializable {

    private String id;
    @HBColumn(family = "main", column = "type")
    private String type;
    @HBColumn(family = "main", column = "annonces")
    private List<Annonce> annonces;

    @Override
    public String composeRowKey() {
        return type;
    }

    @Override
    public void parseRowKey(String s) {
        id = s;
    }
}
