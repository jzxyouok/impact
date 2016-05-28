package com.vaizn.data.busi.dal.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(generator = "UUID")
    private String userId;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "USER_ACCOUNT")
    private String userAccount;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NATIVE_PROVIN")
    private String nativeProvin;

    @Column(name = "NATIVE_CITY")
    private String nativeCity;

    @Column(name = "VOCATION")
    private String vocation;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "SIGNATURE")
    private String signature;

    @Column(name = "VIP_LEVEL")
    private Integer vipLevel;

    /**
     * 0->单身 1->已婚 2->离异 3->丧偶
     */
    @Column(name = "EMOTION_STATUS")
    private Integer emotionStatus;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "NATIVE_ADDRESS")
    private String nativeAddress;

    @Column(name = "ZODIAC")
    private String zodiac;

    /**
     * 0->未认证 1->已认证
     */
    @Column(name = "ACCREDITATION")
    private Integer accreditation;

    @Column(name = "USER_VALID")
    private Integer userValid;

    @Column(name = "USER_STATUS")
    private Integer userStatus;

    public User() {
    	
    }
    
    /**
     * 主键标识
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 主键标识
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 原籍省份
     */
    public String getNativeProvin() {
        return nativeProvin;
    }

    /**
     * 原籍省份
     */
    public void setNativeProvin(String nativeProvin) {
        this.nativeProvin = nativeProvin;
    }

    /**
     * 原籍城市
     */
    public String getNativeCity() {
        return nativeCity;
    }

    /**
     * 原籍城市
     */
    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    /**
     * 职业
     */
    public String getVocation() {
        return vocation;
    }

    /**
     * 职业
     */
    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    /**
     * 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 会员等级
     */
    public Integer getVipLevel() {
        return vipLevel;
    }

    /**
     * 会员等级
     */
    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    /**
     * 情感状态<br>
     * 0->单身 1->已婚 2->离异 3->丧偶
     */
    public Integer getEmotionStatus() {
        return emotionStatus;
    }

    /**
     * 情感状态<br>
     * 0->单身 1->已婚 2->离异 3->丧偶
     */
    public void setEmotionStatus(Integer emotionStatus) {
        this.emotionStatus = emotionStatus;
    }

    /**
     * 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 原籍住址
     */
    public String getNativeAddress() {
        return nativeAddress;
    }

    /**
     * 原籍地址
     */
    public void setNativeAddress(String nativeAddress) {
        this.nativeAddress = nativeAddress;
    }

    /**
     * 星座
     */
    public String getZodiac() {
        return zodiac;
    }

    /**
     * 星座
     */
    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    /**
     * 验证状态<br>
     * 0->未认证 1->已认证
     */
    public Integer getAccreditation() {
        return accreditation;
    }

    /**
     * 验证状态<br>
     * 0->未认证 1->已认证
     */
    public void setAccreditation(Integer accreditation) {
        this.accreditation = accreditation;
    }

    /**
     * 认证有效期
     */
    public Integer getUserValid() {
        return userValid;
    }

    /**
     * 认证有效期
     */
    public void setUserValid(Integer userValid) {
        this.userValid = userValid;
    }

    /**
     * 用户状态
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}