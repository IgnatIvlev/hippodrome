import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void move(){
        for(Horse horse:horses){
            horse.move();
        }
    }

    public void print(){
        for(Horse horse:horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public Horse getWinner(){
        double distanceMax = 0;
        int index = 0;
        for(Horse horse:horses){
            if(horse.getDistance() > distanceMax){
                index = horses.indexOf(horse);
                distanceMax = horse.getDistance();
            }
        }
        return horses.get(index);
    }

    public void printWinner(){
        System.out.println( "Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Black", 3, 0));
        list.add(new Horse("Chaki", 3, 0));
        list.add(new Horse("Tony", 3, 0));

        game = new Hippodrome(list);

        game.run();

        game.printWinner();
    }

}
