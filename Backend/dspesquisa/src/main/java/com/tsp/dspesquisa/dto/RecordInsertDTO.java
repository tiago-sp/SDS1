package com.tsp.dspesquisa.dto;

import java.io.Serializable;
import java.util.Objects;

public class RecordInsertDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer age;
    private Long gameId;


    public RecordInsertDTO() {
    }

    public RecordInsertDTO(String name, Integer age, Long gameId) {
        this.name = name;
        this.age = age;
        this.gameId = gameId;
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

    public Long getGameId() {
        return this.gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public RecordInsertDTO name(String name) {
        this.name = name;
        return this;
    }

    public RecordInsertDTO age(Integer age) {
        this.age = age;
        return this;
    }

    public RecordInsertDTO gameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RecordInsertDTO)) {
            return false;
        }
        RecordInsertDTO recordInsertDTO = (RecordInsertDTO) o;
        return Objects.equals(name, recordInsertDTO.name) && Objects.equals(age, recordInsertDTO.age) && Objects.equals(gameId, recordInsertDTO.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gameId);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", gameId='" + getGameId() + "'" +
            "}";
    }
    
}
