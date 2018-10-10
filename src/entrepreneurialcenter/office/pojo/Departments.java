package entrepreneurialcenter.office.pojo;

public class Departments {
    private Long depId;

    private String depTitle;

    private String depStatus;

    private Integer updated;

    private Integer created;

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepTitle() {
        return depTitle;
    }

    public void setDepTitle(String depTitle) {
        this.depTitle = depTitle == null ? null : depTitle.trim();
    }

    public String getDepStatus() {
        return depStatus;
    }

    public void setDepStatus(String depStatus) {
        this.depStatus = depStatus == null ? null : depStatus.trim();
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