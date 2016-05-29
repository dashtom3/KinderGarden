package cn.jiang.garden.model;

import javax.persistence.*;
import java.sql.Date;

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
