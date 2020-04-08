package Snake;

import java.util.LinkedList;

public class Snake {

    //蛇的身子
    private final LinkedList<Node> body = new LinkedList<>();

    public Node eat(Node food) {
        //蛇吃食物
        

        return food;
    }
    /**
     * 往某个方向移动，蛇的身体可能会重叠，重叠判断由<code>Grid</code>处理。
     *
     * @param direction
     * @return <code>Snake</code>原来的尾部，即最后一个<code>SquareArea</code>
     */
    public Node move(Direction direction) {
       //控制蛇往哪个方向移动 原理:蛇的最后一个节点到蛇最前面
        int headX = getHead().getX();
        int headY = getHead().getY();

        Node newHead = null;
        switch (direction) {
            case UP:
                newHead = new Node(headX, headY - 1);
                break;
            case DOWN:
                newHead = new Node(headX, headY + 1);
                break;
            case LEFT:
                newHead = new Node(headX - 1, headY);
                break;
            case RIGHT:
                newHead = new Node(headX + 1, headY);
                break;
            default:
                break;
        }

        return body.removeLast();
    }

    public Node getHead() {
        return body.getFirst();
    }

    public Node addTail(Node area) {
        this.body.addLast(area);
        return area;
    }

    public LinkedList<Node> getBody() {
        return body;
    }

    private boolean isNeighbor(Node a, Node b) {
        //判断是否是相邻的两个节点
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()) == 1;
    }
}
