public class MembershipCard {

    // Static fields
    static String libraryName;
    static String validUntil;

    // Instance field
    String studentName;

    // Static block
    static {

        libraryName = "SRM Central Library";
        validUntil = "May 2027";

        System.out.println("Library info loaded");
    }

    // Constructor
    public MembershipCard(String studentName) {

        this.studentName = studentName;
    }

    // Print confirmation
    public void printConfirmation() {

        System.out.println(
            "Membership card issued: "
            + studentName
        );
    }

    public static void main(String[] args) {

        String[] names = {
            "Ananya",
            "Rohan",
            "Priya",
            "Arjun",
            "Sneha"
        };

        // Create cards in a loop
        for (String name : names) {

            MembershipCard card =
                new MembershipCard(name);

            card.printConfirmation();
        }
    }
}