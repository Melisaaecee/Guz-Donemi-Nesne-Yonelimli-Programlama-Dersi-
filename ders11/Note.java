package ders11;


public class Note {
    private int id;
    private String title;
    private String text;

    public Note(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    String toLine() {
        return id + "-" + title + "-" + text;
    }

    public static Note fromLine(String line) {
        String[] dizi = line.split("-");

        int id = Integer.parseInt(dizi[0]);
        String title = dizi[1];
        String text = dizi[2];

        return new Note(id,title,text);
    }

    public String toString() {
      return  "Title: " + title + " Text: " + text;
    }

}
