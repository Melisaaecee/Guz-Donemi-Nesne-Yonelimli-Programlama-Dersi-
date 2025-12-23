package ders8;

public class Adres {
    private String sokak;
    private String şehir;

    public Adres(String sokak, String şehir) {
        this.sokak = sokak;
        this.şehir = şehir;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getŞehir() {
        return şehir;
    }

    public void setŞehir(String şehir) {
        this.şehir = şehir;
    }

}
