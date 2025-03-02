/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.Date;

/**
 *
 * @author senju
 */
public class userInfo {
    private int id;
    private String name;
    private String img;
    private String course;
    private int age;
    private Date date;
    
    public userInfo(int id, String img, String name, int age, String course, Date date){
        this.id = id;
        this.img = img;
        this.name = name;
        this.age = age;
        this.course = course;
        this.date = date;
    }
    
    public int getId(){
        return id;
    }
    public String getImg(){
        return img;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
    public Date getDate(){
        return date;
    }
}
