package _01WorkingWithAbstraction._01Lab._04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String seasonName = input[2];
        String discount = input[3];

        Season season = Season.valueOf(seasonName.toUpperCase());
        DiscountType discountType = DiscountType.valueOf(discount.toUpperCase());

        double holidayPrice = PriceCalculator.calcPrice(pricePerDay, days, season, discountType);
        System.out.printf("%.2f%n", holidayPrice);
    }
}
