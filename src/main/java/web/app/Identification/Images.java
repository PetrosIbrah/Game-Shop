package web.app.Identification;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Images {

    @Id
    private Integer Imageid;

    private String Cover;
    private String Background;
    private String Screenshot1;
    private String Screenshot2;
    private String Screenshot3;

    public Images() {}

    public Images(Integer Imageid,
                String Cover, String Background, String ScreenShot1, String Screenshot2, String Screenshot3) {
        this.Imageid = Imageid;
        this.Cover = Cover;
        this.Background = Background;
        this.Screenshot1 = ScreenShot1;
        this.Screenshot2 = Screenshot2;
        this.Screenshot3 = Screenshot3;
    }

    public Integer getImageid() {return Imageid;}
    public void setImageid(Integer imageid) {Imageid = imageid;}

    public String getCover() {return Cover;}
    public void setCover(String cover) {Cover = cover;}

    public String getBackground() {return Background;}
    public void setBackground(String background) {Background = background;}

    public String getScreenshot1() {return Screenshot1;}
    public void setScreenshot1(String screenshot1) {Screenshot1 = screenshot1;}

    public String getScreenshot2() {return Screenshot2;}
    public void setScreenshot2(String screenshot2) {Screenshot2 = screenshot2;}

    public String getScreenshot3() {return Screenshot3;}
    public void setScreenshot3(String screenshot3) {Screenshot3 = screenshot3;}
}
