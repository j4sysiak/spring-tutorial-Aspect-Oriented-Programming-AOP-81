package com.jaceksysiak.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper, ICamera {
	
	public Camera(){
		System.out.println("Hello from Camera default constructor");
	}
	

	@Override
	public void snap() throws Exception {
		System.out.println("SNAP!");
		//throw new Exception("dowidzenia");
	}
	   

	@Override
	public void snap(int exposure){
		System.out.println("SNAP! exposure:" + exposure);
	}
	

	@Override
	public String snap(String name){
		System.out.println("SNAP! Name:" + name);
		
		return name;
	}
	
	

	@Override
	public void snapNighttime(){
		System.out.println("SNAP! Night mode");
		 
	}


}






























