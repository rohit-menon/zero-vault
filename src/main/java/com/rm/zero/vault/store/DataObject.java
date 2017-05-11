package com.rm.zero.vault.store;

/**
 * Base class for data objects
 * 
 * @author rmenon
 *
 */
public abstract class DataObject {
	
	private String name;
	private long size;
	private DataObjectType type;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}
	/**
	 * @return the type
	 */
	public DataObjectType getType() {
		return type;
	}
	
}
