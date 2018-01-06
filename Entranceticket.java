package cn.qiantongmuseum.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Entranceticket {
	private Long id;

	private String ticketNum;

	private Long ticketType;

	private BigDecimal money;

	private Date saleDate;

	private String cardID;

	private String bespeakDate;

	private Long userId;

	private String idCard;

	private Date useDate;

	private Long isUsed;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum == null ? null : ticketNum.trim();
	}

	public Long getTicketType() {
		return ticketType;
	}

	public void setTicketType(Long ticketType) {
		this.ticketType = ticketType;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID == null ? null : cardID.trim();
	}

	public String getBespeakDate() {
		return bespeakDate;
	}

	public void setBespeakDate(String bespeakDate) {
		this.bespeakDate = bespeakDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	public Long getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Long isUsed) {
		this.isUsed = isUsed;
	}
}