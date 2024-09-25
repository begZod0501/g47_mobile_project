package uz.pdp.back.model;

public class SimCard extends AuditEntity{

    private String phone; // unique
    private User user;
    private Tariff tariff;
    private float balance;
    private int remainingMb;
    private int remainingSms;
    private int remainingMinute;

    public SimCard() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getRemainingMb() {
        return remainingMb;
    }

    public void setRemainingMb(int remainingMb) {
        this.remainingMb = remainingMb;
    }

    public int getRemainingSms() {
        return remainingSms;
    }

    public void setRemainingSms(int remainingSms) {
        this.remainingSms = remainingSms;
    }

    public int getRemainingMinute() {
        return remainingMinute;
    }

    public void setRemainingMinute(int remainingMinute) {
        this.remainingMinute = remainingMinute;
    }
}
