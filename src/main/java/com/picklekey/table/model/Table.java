package com.picklekey.table.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@javax.persistence.Table(name="table_reserve")
public class Table implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="table_id")
    private int id;

    @Column(name="table_num")
    private double tableNum;

    @Column(name="created_date")
    private LocalDateTime createdDate;

    public Table() {
    }

    public Table(double tableNum, LocalDateTime createdDate) {
        this.tableNum = tableNum;
        this.createdDate = createdDate;
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", tableNum=" + tableNum +
                ", createdDate=" + createdDate +
                '}';
    }
}
