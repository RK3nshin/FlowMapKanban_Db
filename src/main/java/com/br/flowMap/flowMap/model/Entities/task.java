package com.br.flowMap.flowMap.model.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String iUuid;

    private String title;

    @Column(length=500)
    private String description;

    private int index;
    private int prioridade;
    private Date deadline;
    private Date createDate;
    private Date updateDate;

    public task(){
        
    }
    
    public task(String title, String description, int prioridade, Date deadline, int index, String iUuid) {
        this.title = title;
        this.description = description;
        this.prioridade = prioridade;
        this.deadline = deadline;
        this.index =index;
        this.iUuid=iUuid;
        this.updateDate=this.createDate = new Date();
        
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getiString() {
        return iUuid;
    }
    public void setiUuid(String iUuid) {
        this.iUuid = iUuid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public Date getDeadline() {
        return deadline;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
}
