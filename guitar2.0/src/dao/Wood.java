package dao;

public enum Wood {
	
	WOOD01,WOOD02,WOOD03;
	
	public String toString(){
		switch(this){
			case WOOD01:return "wood01";
			case WOOD02:return "wood02";
			case WOOD03:return "wood03";
			default: return "unspecified";
		}
		
	}
	
}
