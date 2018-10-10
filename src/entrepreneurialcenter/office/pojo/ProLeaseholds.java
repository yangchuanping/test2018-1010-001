package entrepreneurialcenter.office.pojo;

public class ProLeaseholds {
    private Long leaId;

    private Long proId;

    private Long comId;

    private Integer timeStart;

    private Integer timeEnd;

    private String leaStatus;

    private Integer updated;

    private Integer created;

    private String leaDetail;

    public Long getLeaId() {
        return leaId;
    }

    public void setLeaId(Long leaId) {
        this.leaId = leaId;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Integer getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Integer timeStart) {
        this.timeStart = timeStart;
    }

    public Integer getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Integer timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getLeaStatus() {
        return leaStatus;
    }

    public void setLeaStatus(String leaStatus) {
        this.leaStatus = leaStatus == null ? null : leaStatus.trim();
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

    public String getLeaDetail() {
        return leaDetail;
    }

    public void setLeaDetail(String leaDetail) {
        this.leaDetail = leaDetail == null ? null : leaDetail.trim();
    }
}