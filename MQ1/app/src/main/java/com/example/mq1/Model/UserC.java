package com.example.mq1.Model;

public class UserC {
    private String nickName;
    private String imageURL;



    public UserC(String imageURL){
        this.imageURL = imageURL;
        this.nickName = nickName;

    }

    public UserC(){

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImageURL() {



        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
