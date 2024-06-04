package MVC_Exercise.LibraryManeger.model;

public class Journal extends Document{
    private String issueNumber;
    private String monthOfRelease;

    public Journal() {
    }

    public Journal(String issueNumber, String monthOfRelease) {
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public Journal(String documentCode, String imprint, int quantity, String issueNumber, String monthOfRelease) {
        super(documentCode, imprint, quantity);
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(String monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public String toString() {
        return "Journal{" + super.toString() +
                "issueNumber='" + issueNumber + '\'' +
                ", monthOfRelease='" + monthOfRelease + '\'' +
                '}';
    }
}
