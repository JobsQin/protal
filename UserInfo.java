package cn.qiantongmuseum.pojo;

import java.util.List;

/**
 * 用户信息
 * @author Mr.Liang
 *2017年11月16日
 */
public class UserInfo {
	private User user;
	private Card card;
	private User revisePeople;
	private Dictionary dic;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public User getRevisePeople() {
		return revisePeople;
	}
	public void setRevisePeople(User revisePeople) {
		this.revisePeople = revisePeople;
	}
	public Dictionary getDic() {
		return dic;
	}
	public void setDic(Dictionary dic) {
		this.dic = dic;
	}
	
	
	
}
