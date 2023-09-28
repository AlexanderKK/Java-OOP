package _01WorkingWithAbstraction._01Lab._04HotelReservation;

public enum DiscountType {
    VIP("VIP", 20),
    SECONDVISIT("SecondVisit", 10),
    NONE("None", 0);

    private String type;
    private double percentage;

    DiscountType(String type, double percentage) {
        this.type = type;
        this.percentage = percentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
