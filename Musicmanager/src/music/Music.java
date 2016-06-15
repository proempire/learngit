package music;

import java.sql.Blob;

public class Music {

	private int id;
	private String name;
	private String singer;
	private String catalogue;
	private double lastedtime;
	private Blob photo;
	private String comment;
	private int score;
	
	public Music() {
		super();
	}
	
	public Music(int id,String name, String singer, String catalogue,double lastedtime,Blob photo) {
		super();
		this.name = name;
		this.singer = singer;
		this.lastedtime = lastedtime;
		this.catalogue = catalogue;
		this.comment = comment;
		this.score = score;
		this.id = id;
		this.photo = photo;
	}

	
	
	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public double getLastedtime() {
		return lastedtime;
	}

	public void setLastedtime(double lastedtime) {
		this.lastedtime = lastedtime;
	}

	public String getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}
	
	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", name=" + name + ", singer=" + singer
				+ ", lastedtime=" + lastedtime + ", catalogue=" + catalogue
				+ ", comment=" + comment + ", score=" + score + ", photo="
				+ photo + "]";
	}

    
    
	
}
