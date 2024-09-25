package uz.pdp.back.model;

public class Tariff extends AuditEntity{
    private String name; // unique
    private Float price;
    private int mb;
    private int sms;
    private int minute;
    private boolean mbUnlimited;
    private boolean smsUnlimited;
    private boolean minuteUnlimited;
    private Float pricePerMinute;
    private Float pricePerMb;
    private Float pricePerSms;

    public Tariff(String name, Float price, int mb, int sms, int minute, boolean mbUnlimited, boolean smsUnlimited, boolean minuteUnlimited) {
        this.name = name;
        this.price = price;
        this.mb = mb;
        this.sms = sms;
        this.minute = minute;
        this.mbUnlimited = mbUnlimited;
        this.smsUnlimited = smsUnlimited;
        this.minuteUnlimited = minuteUnlimited;
    }

    public Tariff(String name, Float price, int mb, int sms, int minute, boolean mbUnlimited, boolean smsUnlimited, boolean minuteUnlimited, Float pricePerMinute, Float pricePerMb, Float pricePerSms) {
        this.name = name;
        this.price = price;
        this.mb = mb;
        this.sms = sms;
        this.minute = minute;
        this.mbUnlimited = mbUnlimited;
        this.smsUnlimited = smsUnlimited;
        this.minuteUnlimited = minuteUnlimited;
        this.pricePerMinute = pricePerMinute;
        this.pricePerMb = pricePerMb;
        this.pricePerSms = pricePerSms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public boolean isMbUnlimited() {
        return mbUnlimited;
    }

    public void setMbUnlimited(boolean mbUnlimited) {
        this.mbUnlimited = mbUnlimited;
    }

    public boolean isSmsUnlimited() {
        return smsUnlimited;
    }

    public void setSmsUnlimited(boolean smsUnlimited) {
        this.smsUnlimited = smsUnlimited;
    }

    public boolean isMinuteUnlimited() {
        return minuteUnlimited;
    }

    public void setMinuteUnlimited(boolean minuteUnlimited) {
        this.minuteUnlimited = minuteUnlimited;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mb=" + mb +
                ", sms=" + sms +
                ", minute=" + minute +
                ", mbUnlimited=" + mbUnlimited +
                ", smsUnlimited=" + smsUnlimited +
                ", minuteUnlimited=" + minuteUnlimited +
                '}';
    }
}
