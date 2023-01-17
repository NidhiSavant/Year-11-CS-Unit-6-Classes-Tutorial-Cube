public class Cube {
    private int side;

    public Cube()
    {
        side = 1;
    }

    public Cube(int side)
    {
        if (side < 1)
        {
            throw new IllegalArgumentException("Side is less than 1");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1)
        {
            throw new IllegalArgumentException("side is less than 1");
        }
        this.side = side;
    }

    public int getVolume()
    {
        return (int) Math.pow(side,3);
    }

    public int getSurfaceArea()
    {
       return (int) (6 * Math.pow(side,2));
    }

}
