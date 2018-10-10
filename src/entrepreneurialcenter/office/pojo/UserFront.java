package entrepreneurialcenter.office.pojo;

public class UserFront {
    private Long frontId;

    private String frontName;

    private String frontPass;

    private String frontTelephone;

    private String frontStatus;

    private Integer updated;

    private Integer created;

    public Long getFrontId() {
        return frontId;
    }

    public void setFrontId(Long frontId) {
        this.frontId = frontId;
    }

    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName == null ? null : frontName.trim();
    }

    public String getFrontPass() {
        return frontPass;
    }

    public void setFrontPass(String frontPass) {
        this.frontPass = frontPass == null ? null : frontPass.trim();
    }

    public String getFrontTelephone() {
        return frontTelephone;
    }

    public void setFrontTelephone(String frontTelephone) {
        this.frontTelephone = frontTelephone == null ? null : frontTelephone.trim();
    }

    public String getFrontStatus() {
        return frontStatus;
    }

    public void setFrontStatus(String frontStatus) {
        this.frontStatus = frontStatus == null ? null : frontStatus.trim();
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}