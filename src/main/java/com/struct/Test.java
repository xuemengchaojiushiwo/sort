package com.struct;

public class Test {
	public static void main(String[] args) {
		System.out.println(Color.BLANK);
		showColor(Color.BLANK);
		Color color = Color.getColorByIndex(1);
		System.out.println(color);
	}
	static void showColor(Color color){
		
		////////
        switch ( color ) {
        case BLANK:
            System.out.println( color );
            break;
        case RED :
            System.out.println( color );
            break;
        default:
            System.out.println( color );
            break;
        }
	}
}
