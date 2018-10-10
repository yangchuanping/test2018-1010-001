package entrepreneurialcenter.office.pojo;

public class Checkout {
    private Integer id;

    private Long itemId;

    private String itemName;

    private String checkoutDmt;

    private String address;

    private String contact;

    private String reasonsType;

    private Integer updated;

    private Integer created;

    private String reasonsText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getCheckoutDmt() {
        return checkoutDmt;
    }

    public void setCheckoutDmt(String checkoutDmt) {
        this.checkoutDmt = checkoutDmt == null ? null : checkoutDmt.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getReasonsType() {
        return reasonsType;
    }

    public void setReasonsType(String reasonsType) {
        this.reasonsType = reasonsType == null ? null : reasonsType.trim();
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

    public String getReasonsText() {
        return reasonsText;
    }

    public void setReasonsText(String reasonsText) {
        this.reasonsText = reasonsText == null ? null : reasonsText.trim();
    }
}