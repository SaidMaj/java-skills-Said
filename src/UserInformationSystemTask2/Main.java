public class Main {
    public static void main(String[] args) {

        //Here I have declared the First User Called Ahmed
        UserInfo ahmed = new UserInfo("Ahmed", 22, "a@gmsil.com", true);

        //Here I have declared the Second User Called Maha
        UserInfo maha = new UserInfo("Maha", 22, "mm@gmsil.com", false);

        //Here I have declared the Thrid User Called Maha
        UserInfo mike = new UserInfo("Mike", 27, "BigFanOfMikeTyson@gmsil.com", true);

        //Display The First User Info
        ahmed.displayInfo();

        //Display The Second User Info
        maha.displayInfo();

        //Display The Third User Info
        mike.displayInfo();

        //Trying to Change Mike's email
        mike.setEmail("mike@outlock.om");
        System.out.println("Mike Updated Email" + " " + ":" + " " + mike.getEmail());

        //Activating Maha Accounts
        maha.setActive(true);
        System.out.println("Maha Account Status " + " " + ":" + " " + maha.getActive());
    }
}
