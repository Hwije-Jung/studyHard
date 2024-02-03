package javaStudy.jdbcconnect;
import lombok.*;

@Data // Constructor, Getter, Setter, HashCode(), equals(), toString() 자동 생성

public class User {
  private String userid;
  private String userName;
  private String userPassword;
  private int userAge;
  private String userEmail;

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public int getUserAge() {
    return userAge;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public String toString() {
    return "User{" +
            "userid='" + userid + '\'' +
            ", userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", userAge=" + userAge +
            ", userEmail='" + userEmail + '\'' +
            '}';
  }
}
