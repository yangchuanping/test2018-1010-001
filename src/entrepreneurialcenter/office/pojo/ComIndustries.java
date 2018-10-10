package entrepreneurialcenter.office.pojo;

public class ComIndustries {
    private Long indId;

    private String indTitle;

    private String indStatus;

    private Integer updated;

    private Integer created;

    public Long getIndId() {
        return indId;
    }

    public void setIndId(Long indId) {
        this.indId = indId;
    }

    public String getIndTitle() {
        return indTitle;
    }

    public void setIndTitle(String indTitle) {
        this.indTitle = indTitle == null ? null : indTitle.trim();
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus == null ? null : indStatus.trim();
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