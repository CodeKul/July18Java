package abstraction;

public class Football implements Sports,Gym{
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void exercise() {

    }

    public static void main(String[] args) {

        Football obj = new Football();
        obj.play();
    }

    @Override
    public void weight() {

    }
}
