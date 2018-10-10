package entrepreneurialcenter.office.pojo;

import java.util.Date;

public class MaintainApply {
    private Integer id;

    private String maintainName;

    private String maintainPhone;

    private String maintainAddress;

    private String maintainClass;

    private String maintainImg;

    private String maintainContent;

    private Integer maintainCheck;

    private Date maintainCreate;

    private Date maintainUpdate;

    private Long frontId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName == null ? null : maintainName.trim();
    }

    public String getMaintainPhone() {
        return maintainPhone;
    }

    public void setMaintainPhone(String maintainPhone) {
        this.maintainPhone = maintainPhone == null ? null : maintainPhone.trim();
    }

    public String getMaintainAddress() {
        return maintainAddress;
    }

    public void setMaintainAddress(String maintainAddress) {
        this.maintainAddress = maintainAddress == null ? null : maintainAddress.trim();
    }

    public String getMaintainClass() {
        return maintainClass;
    }

    public void setMaintainClass(String maintainClass) {
        this.maintainClass = maintainClass == null ? null : maintainClass.trim();
    }

    public String getMaintainImg() {
        return maintainImg;
    }

    public void setMaintainImg(String maintainImg) {
        this.maintainImg = maintainImg == null ? null : maintainImg.trim();
    }

    public String getMaintainContent() {
        return maintainContent;
    }

    public void setMaintainContent(String maintainContent) {
        this.maintainContent = maintainContent == null ? null : maintainContent.trim();
    }

    public Integer getMaintainCheck() {
        return maintainCheck;
    }

    public void setMaintainCheck(Integer maintainCheck) {
        this.maintainCheck = maintainCheck;
    }

    public Date getMaintainCreate() {
        return maintainCreate;
    }

    public void setMaintainCreate(Date maintainCreate) {
        this.maintainCreate = maintainCreate;
    }

    public Date getMaintainUpdate() {
        return maintainUpdate;
    }

    public void setMaintainUpdate(Date maintainUpdate) {
        this.maintainUpdate = maintainUpdate;
    }

    public Long getFrontId() {
        return frontId;
    }

    public void setFrontId(Long frontId) {
        this.frontId = frontId;
    }
}