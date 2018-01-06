package cn.qiantongmuseum.pojo;

import java.util.List;

/**
 * @author Mr.Liang
 *2017年11月21日
 */
public class PostulantInfo {
	
	private Postulant postulant;
	private Card card;
	private Dictionary zYZXL;
	private Dictionary auditing; 
	private Dictionary ifStartStr;
	private List<PosTime> posTimes;
	public Postulant getPostulant() {
		return postulant;
	}
	public void setPostulant(Postulant postulant) {
		this.postulant = postulant;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Dictionary getzYZXL() {
		return zYZXL;
	}
	public void setzYZXL(Dictionary zYZXL) {
		this.zYZXL = zYZXL;
	}
	public Dictionary getAuditing() {
		return auditing;
	}
	public void setAuditing(Dictionary auditing) {
		this.auditing = auditing;
	}
	public Dictionary getIfStartStr() {
		return ifStartStr;
	}
	public void setIfStartStr(Dictionary ifStartStr) {
		this.ifStartStr = ifStartStr;
	}
	public List<PosTime> getPosTimes() {
		return posTimes;
	}
	public void setPosTimes(List<PosTime> posTimes) {
		this.posTimes = posTimes;
	}
	
	
	
	
}
