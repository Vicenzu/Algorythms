package Lezione8;

public class PairT1T2 <T1, T2>{
    private T1 first;
    private T2 second;

    public PairT1T2() {}

    public PairT1T2(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }

    public T1 getFirst(){
        return first;
    }
    public T2 getSecond(){
        return second;
    }
    public void setFirst(T1 first){
        this.first = first;
    }
    public void setSecond(T2 second){
        this.second = second;
    }

}
