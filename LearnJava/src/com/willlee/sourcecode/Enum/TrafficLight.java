package com.willlee.sourcecode.Enum;

public class TrafficLight{
	  Signal color = Signal.RED;

	    public void change() {
	      switch (color) {
	      case RED:
	        color = Signal.GREEN;
	        break;
	      case YELLOW:
	        color = Signal.RED;
	        break;
	      case GREEN:
	        color = Signal.YELLOW;
	        break;
	      }
	    }
}

enum Signal {
	GREEN, YELLOW, RED
}





