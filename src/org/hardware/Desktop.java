package org.hardware;

public class Desktop implements Hardware, Software{
	@Override
	public void hardwareResources() {
		System.out.println("Enter the Hardware Source");
	}
	@Override
	public void softwareResources() {
System.out.println("Enter the Software Source");
		
	}
public static void desktopMode1() {
System.out.println("The Desktop Mode");
}
public static void main(String[] args) {
	desktopMode1();
	Desktop d=new Desktop();
	d.hardwareResources();
	d.softwareResources();
}
}
