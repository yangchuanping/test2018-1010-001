package entrepreneurialcenter.office.pojo;

public class ComProjects {
    private Long projectId;

    private Long comId;

    private String projectType;

    private String projectName;

    private String projectInd;

    private String projectAllmoney;

    private Integer projectTime;

    private String projectMoney;

    private String projectStatus;

    private Integer updated;

    private Integer created;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectInd() {
        return projectInd;
    }

    public void setProjectInd(String projectInd) {
        this.projectInd = projectInd == null ? null : projectInd.trim();
    }

    public String getProjectAllmoney() {
        return projectAllmoney;
    }

    public void setProjectAllmoney(String projectAllmoney) {
        this.projectAllmoney = projectAllmoney == null ? null : projectAllmoney.trim();
    }

    public Integer getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(Integer projectTime) {
        this.projectTime = projectTime;
    }

    public String getProjectMoney() {
        return projectMoney;
    }

    public void setProjectMoney(String projectMoney) {
        this.projectMoney = projectMoney == null ? null : projectMoney.trim();
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
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