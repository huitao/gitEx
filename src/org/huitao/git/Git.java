package org.huitao.git;

public class Git {
	
	int version;
	
	public Git(int version) {
		this.version = version;
	}
	
	public void Branch() {
		System.out.println("this is a branch code");
		System.out.println("this line is added as branche version2");
	}
	
	public void getVersion() {
		System.out.println("The version is " + version);
		System.out.println("this is version 1");
	}
	
	public static void main(String [] args) {
		Git git = new Git(1);
		git.Branch();
		git.getVersion();
	}

}
