package entrepreneurialcenter.office.pojo;

public class ComIdentify {
    private Long ideId;

    private String ideTitle;

    private String ideStatus;

    private Integer updated;

    private Integer created;

    public Long getIdeId() {
        return ideId;
    }

    public void setIdeId(Long ideId) {
        this.ideId = ideId;
    }

    public String getIdeTitle() {
        return ideTitle;
    }

    public void setIdeTitle(String ideTitle) {
        this.ideTitle = ideTitle == null ? null : ideTitle.trim();
    }

    public String getIdeStatus() {
        return ideStatus;
    }

    public void setIdeStatus(String ideStatus) {
        this.ideStatus = ideStatus == null ? null : ideStatus.trim();
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