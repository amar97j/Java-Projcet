import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private double amount;

    public Transaction(String transactionType, double amount) {
        this.date = new Date();
        this.type = transactionType;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}