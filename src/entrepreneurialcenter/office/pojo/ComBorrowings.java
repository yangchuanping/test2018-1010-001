package entrepreneurialcenter.office.pojo;

public class ComBorrowings {
    private Long borrowId;

    private Long comId;

    private String borrowMoney;

    private Integer borrowDate;

    private String borrowRate;

    private String borrowDeadline;

    private Integer borrowHkq;

    private String borrowRenew;

    private Integer borrowRenewhkq;

    private String borrowRenewrate;

    private Integer borrowSjhkq;

    private String borrowStatus;

    private Integer updated;

    private Integer created;

    public Long getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(String borrowMoney) {
        this.borrowMoney = borrowMoney == null ? null : borrowMoney.trim();
    }

    public Integer getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Integer borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBorrowRate() {
        return borrowRate;
    }

    public void setBorrowRate(String borrowRate) {
        this.borrowRate = borrowRate == null ? null : borrowRate.trim();
    }

    public String getBorrowDeadline() {
        return borrowDeadline;
    }

    public void setBorrowDeadline(String borrowDeadline) {
        this.borrowDeadline = borrowDeadline == null ? null : borrowDeadline.trim();
    }

    public Integer getBorrowHkq() {
        return borrowHkq;
    }

    public void setBorrowHkq(Integer borrowHkq) {
        this.borrowHkq = borrowHkq;
    }

    public String getBorrowRenew() {
        return borrowRenew;
    }

    public void setBorrowRenew(String borrowRenew) {
        this.borrowRenew = borrowRenew == null ? null : borrowRenew.trim();
    }

    public Integer getBorrowRenewhkq() {
        return borrowRenewhkq;
    }

    public void setBorrowRenewhkq(Integer borrowRenewhkq) {
        this.borrowRenewhkq = borrowRenewhkq;
    }

    public String getBorrowRenewrate() {
        return borrowRenewrate;
    }

    public void setBorrowRenewrate(String borrowRenewrate) {
        this.borrowRenewrate = borrowRenewrate == null ? null : borrowRenewrate.trim();
    }

    public Integer getBorrowSjhkq() {
        return borrowSjhkq;
    }

    public void setBorrowSjhkq(Integer borrowSjhkq) {
        this.borrowSjhkq = borrowSjhkq;
    }

    public String getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(String borrowStatus) {
        this.borrowStatus = borrowStatus == null ? null : borrowStatus.trim();
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