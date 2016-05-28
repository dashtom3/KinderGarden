package cn.jiang.garden.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/28.
 */
@Entity
@Table(name = "t_user_application")
public class TUserApplicationEntity {
    private Long id;
    private String record;
    private String firstRelation;
    private String firstCellPhone;
    private String firstWorkPhone;
    private String firstFamilyPhone;
    private String secondRelation;
    private String secondCellPhone;
    private String secondWorkPhone;
    private String secondFamilyPhone;
    private String insuranceCompany;
    private String insuranceNumber;
    private String insuranceProject;

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
    @Column(name = "record")
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Basic
    @Column(name = "first_relation")
    public String getFirstRelation() {
        return firstRelation;
    }

    public void setFirstRelation(String firstRelation) {
        this.firstRelation = firstRelation;
    }

    @Basic
    @Column(name = "first_cell_phone")
    public String getFirstCellPhone() {
        return firstCellPhone;
    }

    public void setFirstCellPhone(String firstCellPhone) {
        this.firstCellPhone = firstCellPhone;
    }

    @Basic
    @Column(name = "first_work_phone")
    public String getFirstWorkPhone() {
        return firstWorkPhone;
    }

    public void setFirstWorkPhone(String firstWorkPhone) {
        this.firstWorkPhone = firstWorkPhone;
    }

    @Basic
    @Column(name = "first_family_phone")
    public String getFirstFamilyPhone() {
        return firstFamilyPhone;
    }

    public void setFirstFamilyPhone(String firstFamilyPhone) {
        this.firstFamilyPhone = firstFamilyPhone;
    }

    @Basic
    @Column(name = "second_relation")
    public String getSecondRelation() {
        return secondRelation;
    }

    public void setSecondRelation(String secondRelation) {
        this.secondRelation = secondRelation;
    }

    @Basic
    @Column(name = "second_cell_phone")
    public String getSecondCellPhone() {
        return secondCellPhone;
    }

    public void setSecondCellPhone(String secondCellPhone) {
        this.secondCellPhone = secondCellPhone;
    }

    @Basic
    @Column(name = "second_work_phone")
    public String getSecondWorkPhone() {
        return secondWorkPhone;
    }

    public void setSecondWorkPhone(String secondWorkPhone) {
        this.secondWorkPhone = secondWorkPhone;
    }

    @Basic
    @Column(name = "second_family_phone")
    public String getSecondFamilyPhone() {
        return secondFamilyPhone;
    }

    public void setSecondFamilyPhone(String secondFamilyPhone) {
        this.secondFamilyPhone = secondFamilyPhone;
    }

    @Basic
    @Column(name = "insurance_company")
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    @Basic
    @Column(name = "insurance_number")
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Basic
    @Column(name = "insurance_project")
    public String getInsuranceProject() {
        return insuranceProject;
    }

    public void setInsuranceProject(String insuranceProject) {
        this.insuranceProject = insuranceProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserApplicationEntity that = (TUserApplicationEntity) o;

        if (id != that.id) return false;
        if (firstCellPhone != null ? !firstCellPhone.equals(that.firstCellPhone) : that.firstCellPhone != null)
            return false;
        if (firstFamilyPhone != null ? !firstFamilyPhone.equals(that.firstFamilyPhone) : that.firstFamilyPhone != null)
            return false;
        if (firstRelation != null ? !firstRelation.equals(that.firstRelation) : that.firstRelation != null)
            return false;
        if (firstWorkPhone != null ? !firstWorkPhone.equals(that.firstWorkPhone) : that.firstWorkPhone != null)
            return false;
        if (insuranceCompany != null ? !insuranceCompany.equals(that.insuranceCompany) : that.insuranceCompany != null)
            return false;
        if (insuranceNumber != null ? !insuranceNumber.equals(that.insuranceNumber) : that.insuranceNumber != null)
            return false;
        if (insuranceProject != null ? !insuranceProject.equals(that.insuranceProject) : that.insuranceProject != null)
            return false;
        if (record != null ? !record.equals(that.record) : that.record != null) return false;
        if (secondCellPhone != null ? !secondCellPhone.equals(that.secondCellPhone) : that.secondCellPhone != null)
            return false;
        if (secondFamilyPhone != null ? !secondFamilyPhone.equals(that.secondFamilyPhone) : that.secondFamilyPhone != null)
            return false;
        if (secondRelation != null ? !secondRelation.equals(that.secondRelation) : that.secondRelation != null)
            return false;
        if (secondWorkPhone != null ? !secondWorkPhone.equals(that.secondWorkPhone) : that.secondWorkPhone != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (record != null ? record.hashCode() : 0);
        result = 31 * result + (firstRelation != null ? firstRelation.hashCode() : 0);
        result = 31 * result + (firstCellPhone != null ? firstCellPhone.hashCode() : 0);
        result = 31 * result + (firstWorkPhone != null ? firstWorkPhone.hashCode() : 0);
        result = 31 * result + (firstFamilyPhone != null ? firstFamilyPhone.hashCode() : 0);
        result = 31 * result + (secondRelation != null ? secondRelation.hashCode() : 0);
        result = 31 * result + (secondCellPhone != null ? secondCellPhone.hashCode() : 0);
        result = 31 * result + (secondWorkPhone != null ? secondWorkPhone.hashCode() : 0);
        result = 31 * result + (secondFamilyPhone != null ? secondFamilyPhone.hashCode() : 0);
        result = 31 * result + (insuranceCompany != null ? insuranceCompany.hashCode() : 0);
        result = 31 * result + (insuranceNumber != null ? insuranceNumber.hashCode() : 0);
        result = 31 * result + (insuranceProject != null ? insuranceProject.hashCode() : 0);
        return result;
    }
}
