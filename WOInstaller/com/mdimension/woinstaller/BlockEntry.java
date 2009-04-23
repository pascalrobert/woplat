package com.mdimension.woinstaller;

public class BlockEntry implements Comparable<BlockEntry> {
	public Long offset;
	public Long length;

	public int compareTo(BlockEntry o) {
		return offset.compareTo(o.offset);
	}
	
	public String toString() {
		return ("offset: " + offset + " length: " + length);
	}
	
}
