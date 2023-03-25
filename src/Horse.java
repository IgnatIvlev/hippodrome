public class Horse {
    private String name;
    private double speed;
    private double distance;

//    public Horse(String name) {
//        this.name = name;
//    }
//
//    public Horse(String name, double speed) {
//        this.name = name;
//        this.speed = speed;
//    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move(){
        this.distance += speed * Math.random();
    }

    public void print(){
        int count = (int) Math.floor(distance);
        for (int i = 0; i < count; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
