import java.util.Objects;

public class User {
    @Validator
    private String name;
    private String email;
    @Validator
    private String secondName;


    public User() {
    }

    public User(String name, String email, String secondName) {
        this.name = name;
        this.email = email;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getSecondName(), user.getSecondName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getEmail(), getSecondName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
