package s6;

public class Ab extends Thread {
    SuanShu resource;

    public Ab(SuanShu resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            resource.add();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run();
    }
}

