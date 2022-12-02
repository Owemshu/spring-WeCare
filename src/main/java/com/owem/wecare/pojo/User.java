package com.owem.wecare.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Owem
 * @date 2022/12/2 11:13
 * @description TODO
 **/
@Data
public class User {
    @TableId
    private String userId;
    private String password;
    private String openid;
    private String nickName;
    private String phoneNumber;
    private String avatarUrl;
    private Boolean gender;
    private String city;
    private String province;
    private String country;

    public User(String userId, String openid, String nickName, String avatarUrl, Boolean gender, String city, String province, String country) {
        this.userId = userId;
        this.openid = openid;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.city = city;
        this.province = province;
        this.country = country;
    }
}
