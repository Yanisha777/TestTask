
import java.util.Date;

/**
 * Created by Yanika on 01.10.2020.
 */
 public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Status status;
    private Date timestamp;
    

   public User(String firstname, String lastname, int age, String email, Status status, Date timestamp) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.age = age;
      this.email = email;
      this.status = status;
      this.timestamp = timestamp;
   }

   @Override
   public String toString() {
      return "User{" +
              "firstname='" + firstname + '\'' +
              ", lastname='" + lastname + '\'' +
              ", age=" + age +
              ", email='" + email + '\'' +
              ", status=" + status +
              ", timestamp=" + timestamp +
              '}';
   }

   public String getFirstname(){
      return firstname;
   }

   public void setFirstname(String firstname){
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public Date getTimestamp() {
      return timestamp;
   }

   public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
   }
}
