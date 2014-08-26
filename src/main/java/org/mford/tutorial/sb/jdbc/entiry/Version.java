package org.mford.tutorial.sb.jdbc.entiry;

public class Version {

	
	private String version;
	private String desc;
	private int worldCount;
	private int actorCount;
	
	public Version(String version, String desc,int worldCount, int actorCount) {
		super();
		this.version = version;
		this.desc = desc;
		this.setWorldCount(worldCount);
		this.setActorCount(actorCount);
	}
	
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getActorCount() {
		return actorCount;
	}


	public void setActorCount(int actorCount) {
		this.actorCount = actorCount;
	}


	public int getWorldCount() {
		return worldCount;
	}


	public void setWorldCount(int worldCount) {
		this.worldCount = worldCount;
	}
}
