package entrepreneurialcenter.office.pojo;

public class Message {
    private Long msgId;

    private String msgTitle;

    private String msgContent;

    private String msgImg;

    private Integer msgType;

    private Integer msgCreated;

    private Integer msgUpdate;

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public String getMsgImg() {
        return msgImg;
    }

    public void setMsgImg(String msgImg) {
        this.msgImg = msgImg == null ? null : msgImg.trim();
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgCreated() {
        return msgCreated;
    }

    public void setMsgCreated(Integer msgCreated) {
        this.msgCreated = msgCreated;
    }

    public Integer getMsgUpdate() {
        return msgUpdate;
    }

    public void setMsgUpdate(Integer msgUpdate) {
        this.msgUpdate = msgUpdate;
    }
}