package project06_ex;
/*
 * 로또 번호
 */

import java.util.Arrays;

public class rotto {
	int [] rottoNum = new int [6];
	boolean bonusNum;
	int [] rottoget = new int [6];
	int Rank;
	int getNum;
	
	//기본 생성자
	public rotto() {
	
	}

	//매개변수 생성자
	public rotto(int[] rottoNum, boolean bonusNum, int[] rottoget, int rank, int getNum) {
		super();
		this.rottoNum = rottoNum;
		this.bonusNum = bonusNum;
		this.rottoget = rottoget;
		Rank = rank;
		this.getNum = getNum;
	}

	//getter setter
	public int[] getRottoNum() {
		return rottoNum;
	}

	public void setRottoNum(int[] rottoNum) {
		this.rottoNum = rottoNum;
	}

	public boolean isBonusNum() {
		return bonusNum;
	}

	public void setBonusNum(boolean bonusNum) {
		this.bonusNum = bonusNum;
	}

	public int[] getRottoget() {
		return rottoget;
	}

	public void setRottoget(int[] rottoget) {
		this.rottoget = rottoget;
	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}

	public int getGetNum() {
		return getNum;
	}

	public void setGetNum(int getNum) {
		this.getNum = getNum;
	}

	//toString
	@Override
	public String toString() {
		return "rotto [rottoNum=" + Arrays.toString(rottoNum) + ", bonusNum=" + bonusNum + ", rottoget="
				+ Arrays.toString(rottoget) + ", Rank=" + Rank + ", getNum=" + getNum + "]";
	}
	

	


}
