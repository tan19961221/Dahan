package s6;

public class Cd extends Thread {
    SuanShu resource;

    public Cd(SuanShu resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            resource.reduce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        run();
    }
}

