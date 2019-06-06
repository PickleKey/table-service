package com.picklekey.table.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@javax.persistence.Table(name="table_reserve")
public class Table implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="table_id")
    private int id;

    @Column(name="table_num")
    private double tableNum;

    public Table() {
    }

    public Table(double tableNum) {
        this.tableNum = tableNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTableNum() {
        return tableNum;
    }

    public void setTableNum(double tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", tableNum=" + tableNum +
                '}';
    }
}
