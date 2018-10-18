public class Card
{
    private int value;
    private String shape;

    public Card(int value, String shape)
    {
        this.value = value;
        this.shape = shape;
    }

    public int getValue()
    {
        return value;
    }

    public String getShape()
    {
        return shape;
    }
}