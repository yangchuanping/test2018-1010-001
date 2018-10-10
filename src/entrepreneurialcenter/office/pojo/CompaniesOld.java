package entrepreneurialcenter.office.pojo;

public class CompaniesOld {
    private Long comId;

    private String comName;

    private Long typeId;

    private Long indId;

    private String comNumber;

    private Long modeId;

    private Long ideId;

    private String comDetail;

    private String comPatent;

    private String comAbout;

    private String comProduct;

    private String comStatus;

    private Integer updated;

    private Integer created;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getIndId() {
        return indId;
    }

    public void setIndId(Long indId) {
        this.indId = indId;
    }

    public String getComNumber() {
        return comNumber;
    }

    public void setComNumber(String comNumber) {
        this.comNumber = comNumber == null ? null : comNumber.trim();
    }

    public Long getModeId() {
        return modeId;
    }

    public void setModeId(Long modeId) {
        this.modeId = modeId;
    }

    public Long getIdeId() {
        return ideId;
    }

    public void setIdeId(Long ideId) {
        this.ideId = ideId;
    }

    public String getComDetail() {
        return comDetail;
    }

    public void setComDetail(String comDetail) {
        this.comDetail = comDetail == null ? null : comDetail.trim();
    }

    public String getComPatent() {
        return comPatent;
    }

    public void setComPatent(String comPatent) {
        this.comPatent = comPatent == null ? null : comPatent.trim();
    }

    public String getComAbout() {
        return comAbout;
    }

    public void setComAbout(String comAbout) {
        this.comAbout = comAbout == null ? null : comAbout.trim();
    }

    public String getComProduct() {
        return comProduct;
    }

    public void setComProduct(String comProduct) {
        this.comProduct = comProduct == null ? null : comProduct.trim();
    }

    public String getComStatus() {
        return comStatus;
    }

    public void setComStatus(String comStatus) {
        this.comStatus = comStatus == null ? null : comStatus.trim();
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