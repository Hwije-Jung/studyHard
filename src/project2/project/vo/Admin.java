package project2.project.vo;

public class Admin extends Person {
  private String id = "Admin";
  private String password = "Admin1234";


  public Admin(String name, String phone) {
    super(name, phone);
  }

  public Admin(String name, String phone, String id, String password) {
    super(name, phone);
    this.id = id;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

}
