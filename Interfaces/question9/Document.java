package OOPS.Interfaces.question9;

public class Document implements Searchable{
    String content ;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}
