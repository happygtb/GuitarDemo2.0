package dao;

public enum Builder {
	
	BUILDER01,BUILDER02;
	
	public String toString(){
		switch(this){
			case BUILDER01:return "builder01";
			case BUILDER02:return "builder02";
			default:return "unspecified";
		}
		
	}
	
}
