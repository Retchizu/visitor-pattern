
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8,true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, ((Telco) smart).getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, ((Telco) globe).getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, ((Telco) ditto).getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, ((Telco) smart).getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli, ((Telco) globe).getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli, ((Telco) ditto).getUnliCallText()));
    }
}