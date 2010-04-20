package org.huitao.git;

public class Git {
	
	int version;
	
	public Git(int version) {
		this.version = version;
	}
	
	public void getVersion() {
		System.out.println("The version is " + version);
		System.out.println("this is version 1");
	}
	
	public void master() {
		System.out.println("master version 2");
	}
	
	public static void main(String [] args) {
		Git git = new Git(1);
		git.getVersion();
	}

}
