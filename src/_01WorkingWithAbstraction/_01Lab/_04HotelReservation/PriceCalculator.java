package _01WorkingWithAbstraction._01Lab._04HotelReservation;

public class PriceCalculator {
    protected static double calcPrice(double pricePerDay, int days, Season season, DiscountType discountType) {
        double priceForAllDays = pricePerDay * days;

        double priceForSeason = priceForAllDays * season.getCoefficient();

        double priceWithDiscount = priceForSeason - priceForSeason * (discountType.getPercentage() / 100);

        return priceWithDiscount;
    }
}
