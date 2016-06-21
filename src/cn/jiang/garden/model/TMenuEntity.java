package cn.jiang.garden.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2016/5/29.
 */
@Entity
@Table(name = "t_menu")
public class TMenuEntity {
    private Long id;
    private String name;
    private Integer type;
    private Long imgId;
    private Integer timeType;

    private TFileEntity image;

    @Transient
    public TFileEntity getImage() {
        return image;
    }
    public void setImage(TFileEntity image) {
        this.image = image;
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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "img_id")
    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    @Basic
    @Column(name = "time_type")
    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TMenuEntity that = (TMenuEntity) o;

        if (id != that.id) return false;
        if (imgId != that.imgId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (int) (imgId ^ (imgId >>> 32));
        return result;
    }
}
