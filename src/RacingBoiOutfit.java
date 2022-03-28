public class RacingBoiOutfit implements IOutfit{
    @Override
    public IShirt wearShirt() {
        return new GucciShirt();
    }

    @Override
    public IShoes wearShoes() {
        return new ConverseShoes();
    }
}
