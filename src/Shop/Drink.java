package Shop;

public abstract class Drink {
    protected String name;
    public abstract String getName();
    public abstract void setName(String name);

    protected float cost;
    public  abstract float getCost();
    public abstract void setCost(float cost);

    protected String category;
    public  abstract String getCategory();
    public abstract void setCategory(String cost);

    protected int quantity;
    public  abstract int getQuantity();
    public abstract void setQuantity(int cost);
}
