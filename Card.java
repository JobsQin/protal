package cn.qiantongmuseum.pojo;

import java.util.Date;

public class Card {
    private Long id;

    private String cardName;

    private String cardNum;

    private String cardAddress;

    private Long sexId;

    private Date cardBirthDate;
    
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(String cardAddress) {
        this.cardAddress = cardAddress == null ? null : cardAddress.trim();
    }

    public Long getSexId() {
        return sexId;
    }

    public void setSexId(Long sexId) {
        this.sexId = sexId;
    }

    public Date getCardBirthDate() {
        return cardBirthDate;
    }

    public void setCardBirthDate(Date cardBirthDate) {
        this.cardBirthDate = cardBirthDate;
    }

	public Integer getAge() {
		Date date = new Date();
		Integer age = date.getYear()-cardBirthDate.getYear();
		return age;
	}

	
    
}