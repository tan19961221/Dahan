public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Chinese");
        book1.setPageNum(150);
        book1.detail();
        Book book2 = new Book();
        book2.setTitle("Math");
        book2.setPageNum(100);
        book2.setPageNum(300);
        book2.detail();
        Book book3 = new Book();
        book3.setTitle("English");
        book3.setPageNum(300);
        book3.detail();
    }
}
