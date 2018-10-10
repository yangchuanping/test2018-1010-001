package entrepreneurialcenter.office.pojo;

public class Properties {
    private Long proId;

    private Long regionId;

    private Long buildingId;

    private String proNumber;

    private Integer proArea;

    private Long proUnivalent;

    private String proAmmeter;

    private String proType;

    private String proStatus;

    private Integer applyTime;

    private Integer updated;

    private Integer created;

    private String remark;

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getProNumber() {
        return proNumber;
    }

    public void setProNumber(String proNumber) {
        this.proNumber = proNumber == null ? null : proNumber.trim();
    }

    public Integer getProArea() {
        return proArea;
    }

    public void setProArea(Integer proArea) {
        this.proArea = proArea;
    }

    public Long getProUnivalent() {
        return proUnivalent;
    }

    public void setProUnivalent(Long proUnivalent) {
        this.proUnivalent = proUnivalent;
    }

    public String getProAmmeter() {
        return proAmmeter;
    }

    public void setProAmmeter(String proAmmeter) {
        this.proAmmeter = proAmmeter == null ? null : proAmmeter.trim();
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus == null ? null : proStatus.trim();
    }

    public Integer getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Integer applyTime) {
        this.applyTime = applyTime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}