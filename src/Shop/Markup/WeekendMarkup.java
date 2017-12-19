package Shop.Markup;

public class WeekendMarkup extends Markup {
    @Override
    public float GetMarkups() {
        System.out.print("WeekendMarkup - 15%");
        return 1.15f;

    }
}