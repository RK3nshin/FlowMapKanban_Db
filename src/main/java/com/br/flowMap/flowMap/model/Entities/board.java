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
@Table(name = "boards")
public class board {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean isPublic;
    private Date createDate;
    private Date updateDate;

    @OneToMany()
    @JoinColumn(name = "board_id")
    private ArrayList<card> cards = new ArrayList<>();

    public board(){
        
    }

    public board(String nome, Boolean isPublic) {
        this.nome = nome;
        this.isPublic = isPublic;
        this.createDate = new Date();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
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

    public ArrayList<card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<card> cards) {
        this.cards = cards;
    }

}
