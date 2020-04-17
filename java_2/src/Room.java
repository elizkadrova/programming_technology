public class Room {
    private double length;
    private double width;
    private double height;

    public Room() {
        this.length = 4.0;
        this.width = 4.0;
        this.height = 2.5;
    }

    public Room(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double getSquareOfWalls() {
        return (this.length * this.height + this.width * this.height) * 2;
    }

    public double getSquareOfWallsWithoutDoorAndWindow() {
        double sqWindow = 2 * 1.5;
        double sqDoor = 2 * 0.8;
        return this.getSquareOfWalls() - sqWindow - sqDoor;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Длина комнаты: ");
        str.append(length);
        str.append("\nШирина комнаты: ");
        str.append(width);
        str.append("\nВысота комнаты: ");
        str.append(height);

        return str.toString();
    }
}
