package org.academiadecodigo.alphateam.animal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public abstract class Animal {

    private Integer Id;
    private String name;
    private String birthdate;
    private SizeAnimal size;
    private String color;
    private double weigth;
    /*
    shot  list
     */
    
    // do relashionships

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public SizeAnimal getSize() {
        return size;
    }

    public void setSize(SizeAnimal size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}