package kr.or.yi.java_study_01.ch05.inter;

import kr.or.yi.java_study_01.ch05.Samsung;

public class InerfaceEx {

	public static void main(String[] args) {
		Samsung galaxy10 = new Samsung();
		PhoneInterface galaxyNote = new Samsung();
		
		galaxy10.setpName("갤럭시10");
		galaxy10.setpYear(2019);
		
		galaxyNote.prnLogo();
		galaxyNote.receiveCall();
		galaxyNote.sendCall();
		
		galaxy10.prnLogo();
		galaxy10.sendCall();

	}

}
