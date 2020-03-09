public class Book {


    public  String title;
    public  int pageNum=200;

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println(this.title+"书的页数不得少于200");
        }else{
            this.pageNum = pageNum;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void detail(){
        System.out.println("教材名："+getTitle()+"   "+"页数："+getPageNum());
    }

}
