package web.app.Identification;

import jakarta.persistence.*;

@Entity
@Table(name = "Requirements")
public class Requirements {
    @Id
    private Integer Reqid;

    private String Minos;
    private String Minprocessor;
    private String Minmemory;
    private String Mingraphics;
    private String Minstorage;

    private String Recos;
    private String Recprocessor;
    private String Recmemory;
    private String Recgraphics;
    private String Recstorage;


    public Requirements() {}

    public Requirements(Integer Reqid, String Minos, String Minprocessor, String Minmemory, String Mingraphics, String Minstorage,
                        String Recos, String Recprocessor, String Recmemory, String Recgraphics, String Recstorage) {
        this.Reqid = Reqid;
        this.Minos = Minos;
        this.Minprocessor = Minprocessor;
        this.Minmemory = Minmemory;
        this.Mingraphics = Mingraphics;
        this.Minstorage = Minstorage;

        this.Recos = Recos;
        this.Recprocessor = Recprocessor;
        this.Recmemory = Recmemory;
        this.Recgraphics = Recgraphics;
        this.Recstorage = Recstorage;
    }

    public Integer getReqid() {return Reqid;}

    public void setReqid(Integer Reqid) {this.Reqid = Reqid;}

    public String getMinos() {return Minos;}
    public void setMinos(String minos) {Minos = minos;}

    public String getMinprocessor() {return Minprocessor;}
    public void setMinprocessor(String minprocessor) {Minprocessor = minprocessor;}

    public String getMinmemory() {return Minmemory;}
    public void setMinmemory(String minmemory) {Minmemory = minmemory;}

    public String getMingraphics() {return Mingraphics;}
    public void setMingraphics(String mingraphics) {Mingraphics = mingraphics;}

    public String getMinstorage() {return Minstorage;}
    public void setMinstorage(String minstorage) {Minstorage = minstorage;}

    public String getRecos() {return Recos;}
    public void setRecos(String recos) {Recos = recos;}

    public String getRecprocessor() {return Recprocessor;}
    public void setRecprocessor(String recprocessor) {Recprocessor = recprocessor;}

    public String getRecmemory() {return Recmemory;}
    public void setRecmemory(String recmemory) {Recmemory = recmemory;}

    public String getRecgraphics() {return Recgraphics;}
    public void setRecgraphics(String recgraphics) {Recgraphics = recgraphics;}

    public String getRecstorage() {return Recstorage;}
    public void setRecstorage(String recstorage) {Recstorage = recstorage;}
}
