package Lesson7.space;

public class Run {
    public static void main(String[] args) {
        IStart shattle = new Shuttle();
        Cosmodrome cosmo = new Cosmodrome();
        cosmo.launch(shattle);
        IStart falcon9 = new Falcon9(4);
        cosmo.launch(falcon9);
    }
}
