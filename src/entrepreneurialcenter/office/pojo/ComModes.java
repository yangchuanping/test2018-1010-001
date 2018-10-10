package entrepreneurialcenter.office.pojo;

public class ComModes {
    private Long modeId;

    private String modeTitle;

    private String modeStatus;

    private Integer updated;

    private Integer created;

    public Long getModeId() {
        return modeId;
    }

    public void setModeId(Long modeId) {
        this.modeId = modeId;
    }

    public String getModeTitle() {
        return modeTitle;
    }

    public void setModeTitle(String modeTitle) {
        this.modeTitle = modeTitle == null ? null : modeTitle.trim();
    }

    public String getModeStatus() {
        return modeStatus;
    }

    public void setModeStatus(String modeStatus) {
        this.modeStatus = modeStatus == null ? null : modeStatus.trim();
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