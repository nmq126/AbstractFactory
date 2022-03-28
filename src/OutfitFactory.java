public class OutfitFactory {
    private OutfitFactory(){
    }
    public static IOutfit getOutfit(OutfitType outfitType){
        switch (outfitType){
            case BUCK_FOI:
                return new BuckFoiOutfit();
            case RACING_BOI:
                return new RacingBoiOutfit();
            default:
                throw new IllegalArgumentException("This outfit type is not supported");
        }
    }
    public enum OutfitType {

        RACING_BOI, BUCK_FOI;

    }
}
