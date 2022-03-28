public class BuckFoiOutfit implements IOutfit {
    @Override
    public IShirt wearShirt() {
        return new BurberryShirt();
    }

    @Override
    public IShoes wearShoes() {
        return new NikeShoes();
    }
}
