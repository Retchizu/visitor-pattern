public class UnliCallTextPackage implements UnliCallTextOffer{

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text package: " +
                (unliCallText ? telcoName + " provides unlimited calls and texts for your convenience!"
                        : telcoName + " does not currently offer unlimited calls and texts.");
    }
}
