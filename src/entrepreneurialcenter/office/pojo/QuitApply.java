package entrepreneurialcenter.office.pojo;

import java.util.Date;

public class QuitApply {
    private Integer quitId;

    private String quitCompany;

    private String quitRegion;

    private String quitNumber;

    private String quitName;

    private String quitPhone;

    private Date quitDate;

    private Integer quitState;

    private Integer quitType;

    private Integer quitCheck;

    private Date quitCreate;

    private Date quitUpdate;

    private Long frontId;

    public Integer getQuitId() {
        return quitId;
    }

    public void setQuitId(Integer quitId) {
        this.quitId = quitId;
    }

    public String getQuitCompany() {
        return quitCompany;
    }

    public void setQuitCompany(String quitCompany) {
        this.quitCompany = quitCompany == null ? null : quitCompany.trim();
    }

    public String getQuitRegion() {
        return quitRegion;
    }

    public void setQuitRegion(String quitRegion) {
        this.quitRegion = quitRegion == null ? null : quitRegion.trim();
    }

    public String getQuitNumber() {
        return quitNumber;
    }

    public void setQuitNumber(String quitNumber) {
        this.quitNumber = quitNumber == null ? null : quitNumber.trim();
    }

    public String getQuitName() {
        return quitName;
    }

    public void setQuitName(String quitName) {
        this.quitName = quitName == null ? null : quitName.trim();
    }

    public String getQuitPhone() {
        return quitPhone;
    }

    public void setQuitPhone(String quitPhone) {
        this.quitPhone = quitPhone == null ? null : quitPhone.trim();
    }

    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    public Integer getQuitState() {
        return quitState;
    }

    public void setQuitState(Integer quitState) {
        this.quitState = quitState;
    }

    public Integer getQuitType() {
        return quitType;
    }

    public void setQuitType(Integer quitType) {
        this.quitType = quitType;
    }

    public Integer getQuitCheck() {
        return quitCheck;
    }

    public void setQuitCheck(Integer quitCheck) {
        this.quitCheck = quitCheck;
    }

    public Date getQuitCreate() {
        return quitCreate;
    }

    public void setQuitCreate(Date quitCreate) {
        this.quitCreate = quitCreate;
    }

    public Date getQuitUpdate() {
        return quitUpdate;
    }

    public void setQuitUpdate(Date quitUpdate) {
        this.quitUpdate = quitUpdate;
    }

    public Long getFrontId() {
        return frontId;
    }

    public void setFrontId(Long frontId) {
        this.frontId = frontId;
    }
}