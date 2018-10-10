package entrepreneurialcenter.office.pojo;

public class Partner {
    private Long id;

    private String partnerName;

    private String partnerIndustry;

    private String partnerScope;

    private String partnerAddress;

    private Integer partnerCreated;

    private Integer partnerUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getPartnerIndustry() {
        return partnerIndustry;
    }

    public void setPartnerIndustry(String partnerIndustry) {
        this.partnerIndustry = partnerIndustry == null ? null : partnerIndustry.trim();
    }

    public String getPartnerScope() {
        return partnerScope;
    }

    public void setPartnerScope(String partnerScope) {
        this.partnerScope = partnerScope == null ? null : partnerScope.trim();
    }

    public String getPartnerAddress() {
        return partnerAddress;
    }

    public void setPartnerAddress(String partnerAddress) {
        this.partnerAddress = partnerAddress == null ? null : partnerAddress.trim();
    }

    public Integer getPartnerCreated() {
        return partnerCreated;
    }

    public void setPartnerCreated(Integer partnerCreated) {
        this.partnerCreated = partnerCreated;
    }

    public Integer getPartnerUpdate() {
        return partnerUpdate;
    }

    public void setPartnerUpdate(Integer partnerUpdate) {
        this.partnerUpdate = partnerUpdate;
    }
}