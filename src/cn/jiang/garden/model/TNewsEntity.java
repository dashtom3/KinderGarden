package cn.jiang.garden.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016/5/28.
 */
@Entity
@Table(name = "t_news")
public class TNewsEntity {
    private int id;
    private String name;
    private String intro;
    private Date publishDate;
    private Integer type;
    private Integer imgId1;
    private Integer imgId2;
    private Integer imgId3;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public Integer getImgId1() {
        return imgId1;
    }

    public void setImgId1(Integer imgId1) {
        this.imgId1 = imgId1;
    }

    @Basic
    @Column(name = "img_id2")
    public Integer getImgId2() {
        return imgId2;
    }

    public void setImgId2(Integer imgId2) {
        this.imgId2 = imgId2;
    }

    @Basic
    @Column(name = "img_id3")
    public Integer getImgId3() {
        return imgId3;
    }

    public void setImgId3(Integer imgId3) {
        this.imgId3 = imgId3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TNewsEntity that = (TNewsEntity) o;

        if (id != that.id) return false;
        if (imgId1 != null ? !imgId1.equals(that.imgId1) : that.imgId1 != null) return false;
        if (imgId2 != null ? !imgId2.equals(that.imgId2) : that.imgId2 != null) return false;
        if (imgId3 != null ? !imgId3.equals(that.imgId3) : that.imgId3 != null) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (publishDate != null ? !publishDate.equals(that.publishDate) : that.publishDate != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (imgId1 != null ? imgId1.hashCode() : 0);
        result = 31 * result + (imgId2 != null ? imgId2.hashCode() : 0);
        result = 31 * result + (imgId3 != null ? imgId3.hashCode() : 0);
        return result;
    }
}
