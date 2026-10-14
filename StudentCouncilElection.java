
class Candidate {
    String name;
    int rollNumber;
    String position;
    int votes;

    Candidate(String name, int rollNumber, String position, int votes) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.position = position;
        this.votes = votes;
    }


    Candidate(String name, int rollNumber, String position) {
        this(name, rollNumber, position, 0);
    }

    void display() {
        display(false);
    }

    void display(boolean uppercase) {
        System.out.println("Candidate Registered Successfully");
        System.out.println("Candidate Name  : "
                + (uppercase ? name.toUpperCase() : name));
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Position        : " + position.toUpperCase());
        System.out.println("Votes Received  : " + votes);
    }

    boolean isDuplicate(Candidate other) {
        return name.equalsIgnoreCase(other.name)
                && position.equalsIgnoreCase(other.position);
    }
}

public class StudentCouncilElection {

    public static void main(String[] args) {

        System.out.println("====== STUDENT COUNCIL ELECTION ======");

        Candidate c1 = new Candidate("Ananya", 101, "President", 125);
        Candidate c2 = new Candidate("Rahul", 102, "President", 98);
        Candidate c3 = new Candidate("ANANYA", 103, "President", 50);

        c1.display(true);
        System.out.println();

        c2.display(true);
        System.out.println();

        System.out.println("Duplicate Candidate Check:");
        System.out.println("Candidate Name  : " + c3.name.toUpperCase());

        if (c1.isDuplicate(c3)) {
            System.out.println("Status          : Duplicate Nomination");
        } else {
            System.out.println("Status          : Valid Nomination");
        }

        Candidate winner;

        if (c1.votes >= c2.votes) {
            winner = c1;
        } else {
            winner = c2;
        }

        System.out.println();
        System.out.println("========== ELECTION RESULTS ==========");
        System.out.println("Position          : PRESIDENT");
        System.out.println("Winning Candidate : " + winner.name.toUpperCase());
        System.out.println("Total Votes       : " + winner.votes);
        System.out.println("======================================");
    }
}

