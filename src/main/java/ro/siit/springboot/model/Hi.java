package ro.siit.springboot.model;

public class Hi {
    private String hi;
    public Hi(String name){
        this.hi = "Salut " + name;
    }

    public String getHi() {
        return hi;
    }
}
