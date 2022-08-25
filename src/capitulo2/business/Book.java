package capitulo2.business;

public class Book {
    private String title;
    private String writer;
    private String editorial;

    public Book (){

    }

    public Book ( String title,String writer, String editorial){
        this.title = title;
        this.writer = writer;
        this.editorial = editorial;
    }

    public String getTitle (){
        return title;
    }
    public void setTitle ( String title){
        this.title = title;
    }

    public String getWriter (){
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getEditorial (){
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



}
