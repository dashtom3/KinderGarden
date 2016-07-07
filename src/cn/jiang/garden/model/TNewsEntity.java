package cn.jiang.garden.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/5/29.
 */
@Entity
@Table(name = "t_news")
public class TNewsEntity {
    private Long id;
    private String name;
    private String intro;
    private Date publishDate;
    private Integer type;
    private Long imgId1;
    private Long imgId2;
    private Long imgId3;
    private Long imgId4;
    private Long imgId5;
    private Long imgId6;
    private Long imgId7;


    private List<TFileEntity> homeBanner;
    private List<TFileEntity> homePic;
    private List<TFileEntity> newsPic;

    @Transient
    public List<TFileEntity> getNewsPic() {
        return newsPic;
    }

    public void setNewsPic(List<TFileEntity> newsPic) {
        this.newsPic = newsPic;
    }

    @Transient
    public List<TFileEntity> getHomePic() {
        return homePic;
    }
    public void setHomePic(List<TFileEntity> homePic) {
        this.homePic = homePic;
    }

    @Transient
    public List<TFileEntity> getHomeBanner() {
        return homeBanner;
    }

    public void setHomeBanner(List<TFileEntity> homeBanner) {
        this.homeBanner = homeBanner;
    }


    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "intro")
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "publish_date")
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "img_id1")
    public Long getImgId1() {
        return imgId1;
    }

    public void setImgId1(Long imgId1) {
        this.imgId1 = imgId1;
    }

    @Basic
    @Column(name = "img_id2")
    public Long getImgId2() {
        return imgId2;
    }

    public void setImgId2(Long imgId2) {
        this.imgId2 = imgId2;
    }

    @Basic
    @Column(name = "img_id3")
    public Long getImgId3() {
        return imgId3;
    }

    public void setImgId3(Long imgId3) {
        this.imgId3 = imgId3;
    }


    @Basic
    @Column(name = "img_id4")
    public Long getImgId4() {
        return imgId4;
    }

    public void setImgId4(Long imgId4) {
        this.imgId4 = imgId4;
    }

    @Basic
    @Column(name = "img_id5")
    public Long getImgId5() {
        return imgId5;
    }

    public void setImgId5(Long imgId5) {
        this.imgId5 = imgId5;
    }

    @Basic
    @Column(name = "img_id6")
    public Long getImgId6() {
        return imgId6;
    }

    public void setImgId6(Long imgId6) {
        this.imgId6 = imgId6;
    }

    @Basic
    @Column(name = "img_id7")
    public Long getImgId7() {
        return imgId7;
    }

    public void setImgId7(Long imgId7) {
        this.imgId7 = imgId7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TNewsEntity that = (TNewsEntity) o;

        if (id != that.id) return false;
        if (imgId1 != that.imgId1) return false;
        if (imgId2 != that.imgId2) return false;
        if (imgId3 != that.imgId3) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (publishDate != null ? !publishDate.equals(that.publishDate) : that.publishDate != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (int) (imgId1 ^ (imgId1 >>> 32));
        result = 31 * result + (int) (imgId2 ^ (imgId2 >>> 32));
        result = 31 * result + (int) (imgId3 ^ (imgId3 >>> 32));
        return result;
    }
}
