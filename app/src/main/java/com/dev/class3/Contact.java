package com.dev.class3;

public class Contact {
    private String firstName, secondName, phone;
    private Integer image;
    private boolean bloocked = true;

    public boolean isBloocked() {
        return bloocked;
    }

    public void setBloocked(boolean bloocked) {
        this.bloocked = bloocked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
