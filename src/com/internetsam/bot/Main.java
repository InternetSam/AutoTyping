package com.internetsam.bot;

import java.awt.AWTException;
import java.awt.Robot;

public class Main {
	
	public int x = 10;
	public int y = 10;
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clickAndType("This is some slow typing", 1000);
		
	}
	
	
	public static void clickAndType(String input, int delay) {
		
		char[] toType = input.toLowerCase().toCharArray();
		for(int x=0;x<toType.length;x++) {
			int key = 65;
			switch (toType[x]) {
			
			case 'a':
				key = key;
				break;
				
			case 'b':
				key = key+1;
				break;
				
			case 'c':
				key = key+2;
				break;
				
			case 'd':
				key = key+3;
				break;
				
			case 'e':
				key = key+4;
				break;
				
			case 'f':
				key = key+5;
				break;
				
			case 'g':
				key = key+6;
				break;
				
			case 'h':
				key = key+7;
				break;
				
			case 'i':
				key = key+8;
				break;
				
			case 'j':
				key = key+9;
				break;
				
			case 'k':
				key = key+10;
				break;
				
			case 'l':
				key = key+11;
				break;
				
			case 'm':
				key = key+12;
				break;
				
			case 'n':
				key = key+13;
				break;
				
			case 'o':
				key = key+14;
				break;
				
			case 'p':
				key = key+15;
				break;
				
			case 'q':
				key = key+16;
				break;
				
			case 'r':
				key = key+17;
				break;
				
			case 's':
				key = key+18;
				break;
				
			case 't':
				key = key+19;
				break;
				
			case 'u':
				key = key+20;
				break;
				
			case 'v':
				key = key+21;
				break;
				
			case 'w':
				key = key+22;
				break;
				
			case 'x':
				key = key+23;
				break;
				
			case 'y':
				key = key+24;
				break;
				
			case 'z':
				key = key+25;
				break;
				
			case ' ':
				key = 32;
				break;
				
			case '.':
				key = 192;
				break;
				
			default:
				key = 192;
				break;
			}
			
			try {
				Robot robot = new Robot();
				
				robot.keyPress(key);
				robot.delay(delay);
				robot.keyRelease(key);
				
				
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}
}
