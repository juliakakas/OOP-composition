public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email, char gender){

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        return super.toString();
    }
}
