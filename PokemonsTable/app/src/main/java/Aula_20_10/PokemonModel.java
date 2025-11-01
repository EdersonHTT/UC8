/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_20_10;

/**
 *
 * @author EDERSONDASILVASCHMID
 */
public class PokemonModel {
    private String name;
    private String type;
    private int lvl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public PokemonModel(String name, String type, int lvl) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
    }
}
