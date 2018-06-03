package com.scp.datastructure;

public enum EnumDemo {
			
	  NORTH, SOUTH, EAST, WEST;

    private EnumDemo opposite;

    static {
        NORTH.opposite = SOUTH;
        SOUTH.opposite = NORTH;
        EAST.opposite = WEST;
        WEST.opposite = EAST;
    }

    public EnumDemo getOppositeDirection() {
        return opposite;
    }
}
