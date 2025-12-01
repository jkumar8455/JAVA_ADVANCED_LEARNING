package scenario40;

public class Main {
    public static void main(String[] args) {
        Content vidContent=new Video();
        Content imaContent=new Image();
        Content articleContent=new Article();
        vidContent.display();
        imaContent.display();
        articleContent.display();
    }
}
