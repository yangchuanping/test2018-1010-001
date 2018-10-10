package entrepreneurialcenter.office.pojo;

public class Articles {
    private Long artId;

    private String artTitle;

    private String artContent;

    private String artThumb;

    private Long userId;

    private String artAddressee;

    private String artStatus;

    private Integer updated;

    private Integer created;

    public Long getArtId() {
        return artId;
    }

    public void setArtId(Long artId) {
        this.artId = artId;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent == null ? null : artContent.trim();
    }

    public String getArtThumb() {
        return artThumb;
    }

    public void setArtThumb(String artThumb) {
        this.artThumb = artThumb == null ? null : artThumb.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getArtAddressee() {
        return artAddressee;
    }

    public void setArtAddressee(String artAddressee) {
        this.artAddressee = artAddressee == null ? null : artAddressee.trim();
    }

    public String getArtStatus() {
        return artStatus;
    }

    public void setArtStatus(String artStatus) {
        this.artStatus = artStatus == null ? null : artStatus.trim();
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