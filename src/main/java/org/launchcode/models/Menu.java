package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Jorge on 4/26/2017.
 */
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public List<Cheese> getCheeses() {
        return cheeses;
    }

  //  public Menu(String name, List<Cheese> cheeses) {
  //      this.name = name;
  //      this.

  //  }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addItem(Cheese item){
        cheeses.add(item);
    }
}


