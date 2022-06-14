package com.exam.exam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table7")
public class Table7 {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title10")
    private String title10;

    @Column(name="hight")
    private Short hight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle10() {
        return title10;
    }

    public void setTitle10(String title10) {
        this.title10 = title10;
    }

    public Short getHight() {
        return hight;
    }

    public void setHight(Short hight) {
        this.hight = hight;
    }
}
