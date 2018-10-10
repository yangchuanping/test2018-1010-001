package entrepreneurialcenter.office.pojo;

public class Logs {
    private Long logId;

    private Long userId;

    private String logContent;

    private String logPostsrc;

    private Integer created;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    public String getLogPostsrc() {
        return logPostsrc;
    }

    public void setLogPostsrc(String logPostsrc) {
        this.logPostsrc = logPostsrc == null ? null : logPostsrc.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}