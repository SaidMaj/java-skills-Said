public class UserInfo {
/*
* I have used private access modifier
* to be able to protecting the variables from unnecessary  changes and
* Ensure the user enter vaild Values and the re-use ability when using the set and get function
*
* */
    private String name;
    private  int age;
    private  String email;
    private  Boolean isActive;

    // I have created an empty constructor to handle in case the user want to use only the setter and getters
    public UserInfo() {

    }

    public UserInfo(String name, int age, String email, Boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    /*
        Here I have created a Function called displayInfo it used to print the user info
        in the first line it prints the separator then user details
     */
    public void displayInfo() {
        System.out.println("\n" + "================ UserInfo ================");
        System.out.println("UserName" + " " + ":" + " "+ name);
        System.out.println("UserAge" + "  " + ":" + " " + age);
        System.out.println("UserEmailAddress" + "  " + ":" + " " + email);
        System.out.println("UserAccountStatus" + " " + ":" + " " + isActive);
    }

}
