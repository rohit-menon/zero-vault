/**
 * 
 */
package com.rm.zero.vault.store;

import java.util.List;

/**
 * Base class for Datastore Implementations
 * 
 * @author rmenon
 *
 */
public abstract class DataStore<T extends DataObject> {
	
	public abstract T getObject();
	
	public abstract void putObject(T t);
	
	public abstract void deleteObject(T t);
	
	public abstract List<T> list();

}
