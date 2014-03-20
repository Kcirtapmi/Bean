package me.bean.main.entity;

/**
 * Created by Father on 3/19/2014.
 */
public interface Entity {

    String Name = "null";
    int UID = 0;

    /**
     * Create an instance of the entity
     */
    void initialize();
}
