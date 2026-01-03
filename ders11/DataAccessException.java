package ders11;

public class DataAccessException  extends RuntimeException{
    public DataAccessException(String mesaj, Throwable e) {
        super(mesaj, e);
    
   }
}
