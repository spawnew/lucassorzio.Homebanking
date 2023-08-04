package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
// tiene q ver con la persistencia de datos pa meterlo en la base de datos


public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
  @GenericGenerator(name="native",strategy = "native")
  private Long id;
  // long sirve para numeros muy grandes
  private  String dni;
  private   String name;
  private  String lastname;
private String mail;
  public Client(){

  }
  // me pide un constructor vacio el entity
  public Client(String dni, String name, String lastname, String mail) {
    this.dni = dni;
    this.name = name;
    this.lastname = lastname;
    this.mail=mail;
  }

  public Long getId() {
    return id;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
}
