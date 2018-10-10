package entrepreneurialcenter.office.pojo;

import java.util.Date;

public class Attract {
    private Integer attractId;

    private String attractName;

    private String attractContent;

    private String attractAddress;

    private String attractTraffic;

    private String attractGarden;

    private Integer attractArea;

    private String attractStation;

    private String attractDecoration;

    private String attractRate;

    private String attractRentfree;

    private String attractPhone;

    private String attractImg;

    private String attractElevator;

    private String attractStatus;

    private Date attractCreated;

    private Date attractUpdated;

    public Integer getAttractId() {
        return attractId;
    }

    public void setAttractId(Integer attractId) {
        this.attractId = attractId;
    }

    public String getAttractName() {
        return attractName;
    }

    public void setAttractName(String attractName) {
        this.attractName = attractName == null ? null : attractName.trim();
    }

    public String getAttractContent() {
        return attractContent;
    }

    public void setAttractContent(String attractContent) {
        this.attractContent = attractContent == null ? null : attractContent.trim();
    }

    public String getAttractAddress() {
        return attractAddress;
    }

    public void setAttractAddress(String attractAddress) {
        this.attractAddress = attractAddress == null ? null : attractAddress.trim();
    }

    public String getAttractTraffic() {
        return attractTraffic;
    }

    public void setAttractTraffic(String attractTraffic) {
        this.attractTraffic = attractTraffic == null ? null : attractTraffic.trim();
    }

    public String getAttractGarden() {
        return attractGarden;
    }

    public void setAttractGarden(String attractGarden) {
        this.attractGarden = attractGarden == null ? null : attractGarden.trim();
    }

    public Integer getAttractArea() {
        return attractArea;
    }

    public void setAttractArea(Integer attractArea) {
        this.attractArea = attractArea;
    }

    public String getAttractStation() {
        return attractStation;
    }

    public void setAttractStation(String attractStation) {
        this.attractStation = attractStation == null ? null : attractStation.trim();
    }

    public String getAttractDecoration() {
        return attractDecoration;
    }

    public void setAttractDecoration(String attractDecoration) {
        this.attractDecoration = attractDecoration == null ? null : attractDecoration.trim();
    }

    public String getAttractRate() {
        return attractRate;
    }

    public void setAttractRate(String attractRate) {
        this.attractRate = attractRate == null ? null : attractRate.trim();
    }

    public String getAttractRentfree() {
        return attractRentfree;
    }

    public void setAttractRentfree(String attractRentfree) {
        this.attractRentfree = attractRentfree == null ? null : attractRentfree.trim();
    }

    public String getAttractPhone() {
        return attractPhone;
    }

    public void setAttractPhone(String attractPhone) {
        this.attractPhone = attractPhone == null ? null : attractPhone.trim();
    }

    public String getAttractImg() {
        return attractImg;
    }

    public void setAttractImg(String attractImg) {
        this.attractImg = attractImg == null ? null : attractImg.trim();
    }

    public String getAttractElevator() {
        return attractElevator;
    }

    public void setAttractElevator(String attractElevator) {
        this.attractElevator = attractElevator == null ? null : attractElevator.trim();
    }

    public String getAttractStatus() {
        return attractStatus;
    }

    public void setAttractStatus(String attractStatus) {
        this.attractStatus = attractStatus == null ? null : attractStatus.trim();
    }

    public Date getAttractCreated() {
        return attractCreated;
    }

    public void setAttractCreated(Date attractCreated) {
        this.attractCreated = attractCreated;
    }

    public Date getAttractUpdated() {
        return attractUpdated;
    }

    public void setAttractUpdated(Date attractUpdated) {
        this.attractUpdated = attractUpdated;
    }
}