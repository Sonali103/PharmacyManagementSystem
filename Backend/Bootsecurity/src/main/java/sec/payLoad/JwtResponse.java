package sec.payLoad;

import java.util.List;

import lombok.Data;

@Data

public class JwtResponse {
  private String token;

  private String type = "Bearer";

  private String userId;

  private String username;

  private String email;

  private List<String> roles;

  public JwtResponse(String accessToken, String userId, String username, String email, List<String> roles) {

    this.token = accessToken;
    this.userId = userId;
    this.username = username;
    this.email = email;
    this.roles = roles;
  }

  public JwtResponse() {

  }

  /**
   * @return token
   */
  public String getToken() {

    return this.token;
  }

  /**
   * @param token new value of {@link #gettoken}.
   */
  public void setToken(String token) {

    this.token = token;
  }

  /**
   * @return type
   */
  public String getType() {

    return this.type;
  }

  /**
   * @param type new value of {@link #gettype}.
   */
  public void setType(String type) {

    this.type = type;
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
   * @return roles
   */
  public List<String> getRoles() {

    return this.roles;
  }

  /**
   * @param roles new value of {@link #getroles}.
   */
  public void setRoles(List<String> roles) {

    this.roles = roles;
  }

}
