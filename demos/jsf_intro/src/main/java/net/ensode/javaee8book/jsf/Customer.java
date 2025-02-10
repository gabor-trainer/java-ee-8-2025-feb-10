package net.ensode.javaee8book.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
// POJO: Plain Old Java Object
// We never instantiate this class with the new keyword, we let the container do it (with other the Big Brother)
// using DI (Dependency Injection)
public class Customer implements Serializable {

  // Instance variables, never make them public
  private String firstName;
  private String lastName;
  private String email;

  // Accessors and mutators, getters  and setters
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
