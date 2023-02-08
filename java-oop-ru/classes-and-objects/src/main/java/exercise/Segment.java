package exercise;

class Segment {
    private Point BeginPoint;
    private Point EndPoint;

    public Segment(Point beginPoint, Point endPoint) {
        BeginPoint = beginPoint;
        EndPoint = endPoint;
    }

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        BeginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return EndPoint;
    }

    public void setEndPoint(Point endPoint) {
        EndPoint = endPoint;
    }

    public Point getMidPoint() {
        int start = (BeginPoint.getX() + EndPoint.getX()) / 2;
        int end = (BeginPoint.getY() + EndPoint.getY()) / 2;
        Point midPoint = new Point(start, end);
        return midPoint;
    }
}
