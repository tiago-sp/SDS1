package com.tsp.dspesquisa.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Record
 */
@Entity
@Table(name = "tb_record")
public class Record implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;


    public Record() {
    }

    public Record(Long id, String name, Integer age, Instant moment, Game game) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.moment = moment;
        this.game = game;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Record id(Long id) {
        this.id = id;
        return this;
    }

    public Record name(String name) {
        this.name = name;
        return this;
    }

    public Record age(Integer age) {
        this.age = age;
        return this;
    }

    public Record moment(Instant moment) {
        this.moment = moment;
        return this;
    }

    public Record game(Game game) {
        this.game = game;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Record)) {
            return false;
        }
        Record record = (Record) o;
        return Objects.equals(id, record.id) && Objects.equals(name, record.name) && Objects.equals(age, record.age) && Objects.equals(moment, record.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, moment);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", moment='" + getMoment() + "'" +
            "}";
    }


    
}