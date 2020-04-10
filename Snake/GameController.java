package Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements Runnable, KeyListener {
    private final Grid grid;
    private final GameView gameView;

    boolean running;
    boolean restart = false;

    public GameController(Grid grid, GameView gameView) {
        this.grid = grid;
        this.gameView = gameView;
        this.running = true;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                grid.changeDirection(Direction.UP);
                break;
            case KeyEvent.VK_DOWN:
                grid.changeDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_LEFT:
                grid.changeDirection(Direction.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                grid.changeDirection(Direction.RIGHT);
                break;
            default:
        }

        // your code here：处理回车键，重新开始游戏
        if (!running) {
            switch (keyCode) {
                case KeyEvent.VK_ENTER:
                    restart = true;
                    running = true;
                    grid.init();
                    new Thread(this).start();
                    break;
                case KeyEvent.VK_SPACE:
                    running = true;
                    new Thread(this).start();
                    break;
            }
        }
        else {
            if (keyCode == KeyEvent.VK_SPACE) {
                running = false;
            }
        }
    }

    /**
     * 按一定速率自动移动贪吃蛇
     */
    public void run() {

        while (running) {
            try {
                Thread.sleep(Settings.DEFAULT_MOVE_INTERVAL);
            } catch (InterruptedException e) {
                break;
            }
            // 如果结束，则退出游戏
            if (!grid.nextRound()) {
                running = false;
                gameView.showGameOverMessage();
                break;
            }
            // 如果继续，则绘制新的游戏页面
            gameView.draw();
        }
        running = false;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}