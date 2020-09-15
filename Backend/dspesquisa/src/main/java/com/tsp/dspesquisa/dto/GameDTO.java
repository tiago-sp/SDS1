package com.tsp.dspesquisa.dto;

import java.io.Serializable;
import java.util.Objects;

import com.tsp.dspesquisa.entites.Game;
import com.tsp.dspesquisa.entites.enums.Platform;

/**
 * GameDTO
 */
public class GameDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long id;
    private String title;
    private Platform platform;


    public GameDTO() {
    }

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.platform = entity.getPlatform();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public GameDTO id(Long id) {
        this.id = id;
        return this;
    }

    public GameDTO title(String title) {
        this.title = title;
        return this;
    }

    public GameDTO platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameDTO)) {
            return false;
        }
        GameDTO gameDTO = (GameDTO) o;
        return Objects.equals(id, gameDTO.id) && Objects.equals(title, gameDTO.title) && Objects.equals(platform, gameDTO.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, platform);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", platform='" + getPlatform() + "'" +
            "}";
    }
    
}