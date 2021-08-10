package com.example;

import javax.persistence.*;

@Entity
@Table(name = "simple_object")
@TableGenerator(name = "PRIMARY_KEY", table = "primary_keys", pkColumnName = "ckey", pkColumnValue = "simpleobject", valueColumnName = "cvalue", allocationSize = 1)
public class SimpleObject {

    private Integer objid;

    private String data;

    @Id
    // Removing the ID generation makes persisting work
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PRIMARY_KEY")
    public Integer getObjid() {
        return objid;
    }

    public void setObjid(Integer objid) {
        this.objid = objid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
