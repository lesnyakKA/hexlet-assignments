package exercise;

class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {

        return area;
    }

    @Override
    public int compareTo(Home other) {
        int result = 0;
        if (area > other.getArea()) {
            result = 1;
        } else if (area < other.getArea()) {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }
}
