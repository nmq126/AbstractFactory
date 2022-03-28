public class YoungBoi {
    public static void main(String[] args) {
        IOutfit outfit =  OutfitFactory.getOutfit(OutfitFactory.OutfitType.BUCK_FOI);
        outfit.wearShirt().getName();
        outfit.wearShoes().getName();
    }
}
