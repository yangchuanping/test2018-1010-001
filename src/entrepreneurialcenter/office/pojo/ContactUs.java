package entrepreneurialcenter.office.pojo;

import java.util.Date;

public class ContactUs {
    private Integer contactId;

    private String contactName;

    private String contactEmail;

    private String contactPhone;

    private String contactAddress;

    private String contactContent;

    private Integer contactCheck;

    private Date contactCreate;

    private Date contactUpdate;

    private Long frontId;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent == null ? null : contactContent.trim();
    }

    public Integer getContactCheck() {
        return contactCheck;
    }

    public void setContactCheck(Integer contactCheck) {
        this.contactCheck = contactCheck;
    }

    public Date getContactCreate() {
        return contactCreate;
    }

    public void setContactCreate(Date contactCreate) {
        this.contactCreate = contactCreate;
    }

    public Date getContactUpdate() {
        return contactUpdate;
    }

    public void setContactUpdate(Date contactUpdate) {
        this.contactUpdate = contactUpdate;
    }

    public Long getFrontId() {
        return frontId;
    }

    public void setFrontId(Long frontId) {
        this.frontId = frontId;
    }
}