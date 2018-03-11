package ru.grbi3yh.orderproducts.repositories.entities;

public enum Status {

    ACCEPTED("Принят"),
    CANCELED("Отмененн"),
    PROCESSING("В процессе");

    private String name;

    private int number;

    Status( String name){
        this.name = name;
    }
}
