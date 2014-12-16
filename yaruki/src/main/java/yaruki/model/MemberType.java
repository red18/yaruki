package yaruki.model;

public enum MemberType {

	MEMBER(0),
	USRAH_LEADER(1),
	CHAPTER_HEAD(2);
	
	private int type;
	
	MemberType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return this.type;
	}
}
