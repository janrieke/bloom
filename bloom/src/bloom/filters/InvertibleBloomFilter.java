package bloom.filters;

import java.util.ArrayList;

public class InvertibleBloomFilter {
	
	private int hashCount;
	private int size; 
	
	public InvertibleBloomFilter(int hashCount, int size){
		this.hashCount = hashCount;
		this.size = size;
	}
	
	public boolean insert(String key){
		return true;
	}
	
	public boolean remove(String key){
		return true;
	}
	
	public int find(String key){
		return key.hashCode();
		//return true;
	}
	
	public static ArrayList<String>[] subtract(InvertibleBloomFilter ibf1, InvertibleBloomFilter ibf2){
		return (ArrayList<String>[])new ArrayList[2];
	}

}
