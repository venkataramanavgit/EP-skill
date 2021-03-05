package com.hb.crud.hbcrud;



import javax.persistence.*;

@Entity
@Table
public class bean 
{
  @Id
  private int id;
  private String name;
  private String email;
  private String dob;
  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }
  public String getCourse() {
    return course;
  }
  public void setCourse(String course) {
    this.course = course;
  }
  private String course;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail()
  {
    return email;
  }
  public void setEmail(String email)
  {
    this.email = email;
  }
  @Override
  public String toString() {
    return "bean [id=" + id + ", name=" + name + ", email=" + email + ", dob="+ dob +",course=" +course +"]";
  }
  

}