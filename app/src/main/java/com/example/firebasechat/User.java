package com.example.firebasechat;

public class User {
    private String name;
    private String eMail;
    private String id;
    private int avatarMockUpResource;

    public User() {
    }

    public User(String name, String eMail, String id, int avatarMockUpResource) {
        this.name = name;
        this.eMail = eMail;
        this.id = id;
        this.avatarMockUpResource = avatarMockUpResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAvatarMockUpResource() {
        return avatarMockUpResource;
    }

    public void setAvatarMockUpResource(int avatarMockUpResource) {
        this.avatarMockUpResource = avatarMockUpResource;
    }
}
