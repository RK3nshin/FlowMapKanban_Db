package com.br.flowMap.flowMap.model.Entities;

import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cards")
public class card {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  Long id;

    private String iUuid ;
    private  String nome;
    private int  index;
    private Date createDate;
    private Date updateDate;

    @OneToMany()
    @JoinColumn(name="tasks_id")
    private  ArrayList<task> tasks = new ArrayList<>();

    public card(){
    }
    
  
    public card(String  iUuid , String nome, int index) {
        this.iUuid  = iUuid ;
        this.nome = nome;
        this.index = index;
        this.updateDate = this.createDate = new Date();
       
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setiUuid(String iUuid) {
        this.iUuid = iUuid;
    }
    public String getiUuid(){
        return  iUuid;
    }
  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public ArrayList<task> getTasks() {
        return tasks;
    }
    public void setTasks(ArrayList<task> tasks) {
        this.tasks = tasks;
    }


    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
