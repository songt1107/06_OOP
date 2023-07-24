package edu.kh.oop.practice.model.vo;

public class Hero {

	// 필드 == 멤버변수
	private String job; // 직업이름
	private int hp; // HP
	private int mp; // MP
	private char gender; // 성별
	private int level; // 레벨
	
	
	// 생성자
	// 기본 생성자 단축키 ctrl + space + enter
	public Hero() {}
	
	public void attack() {
		System.out.println(job + "가 기본 공격을 했다(-150)");
	}
	
	public void jump() {
		System.out.println(job + "의 점프!");
	}
	
	// getter / setter
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}

