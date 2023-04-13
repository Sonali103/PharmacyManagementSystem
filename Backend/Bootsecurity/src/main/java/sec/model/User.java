package sec.model;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

@Document(collection = "users")
public class User {
  @Id
  private String userId;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User(String userId, String username, String email, String password) {

    this.userId = userId;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  /**
   * @return userId
   */
  public String getUserId() {

    return this.userId;
  }

  /**
   * @param userId new value of {@link #getuserId}.
   */
  public void setUserId(String userId) {

    this.userId = userId;
  }

  /**
   * @return username
   */
  public String getUsername() {

    return this.username;
  }

  /**
   * @param username new value of {@link #getusername}.
   */
  public void setUsername(String username) {

    this.username = username;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return password
   */
  public String getPassword() {

    return this.password;
  }

  /**
   * @param password new value of {@link #getpassword}.
   */
  public void setPassword(String password) {

    this.password = password;
  }

  /**
   * @return roles
   */
  public Set<Role> getRoles() {

    return this.roles;
  }

  /**
   * @param roles new value of {@link #getroles}.
   */
  public void setRoles(Set<Role> roles) {

    this.roles = roles;
  }

}
