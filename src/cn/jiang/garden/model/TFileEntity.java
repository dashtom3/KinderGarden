package cn.jiang.garden.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/29.
 */
@Entity
@Table(name = "t_file")
public class TFileEntity {
    private Long id;
    private String name;
    private Integer type;
    private String intro;
    private String imgSrc;

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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "img_src")
    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFileEntity that = (TFileEntity) o;

        if (id != that.id) return false;
        if (imgSrc != null ? !imgSrc.equals(that.imgSrc) : that.imgSrc != null) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (imgSrc != null ? imgSrc.hashCode() : 0);
        return result;
    }
}
