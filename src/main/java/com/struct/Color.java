package com.struct;

public enum Color {
	  RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
	     
	     
	    private String name ;
	    private int index ;
	     
	    private Color( String name , int index ){
	        this.name = name ;
	        this.index = index ;
	    }
	    public static Color getColorByIndex(int index){
	    	Color color =null;
	    	for (Color color1 : Color.values()) {
				if (color1.getIndex()==index) {
					color=color1 ;	
					break;
				}
			}
	    	return color;
	    	
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
	    
	
}
