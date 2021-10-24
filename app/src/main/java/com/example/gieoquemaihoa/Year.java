package com.example.gieoquemaihoa;

/********************************************************************************************************************************************************
                                                                                                               
,--.             ,-----.          ,--.           ,--.   ,--.           ,--------.                       ,--.   
|  |,--,--,     '  .--./ ,---.  ,-|  | ,---.     |  |   |  | ,---.     '--.  .--',--.--.,--.,--. ,---.,-'  '-. 
|  ||      \    |  |    | .-. |' .-. || .-. :    |  |.'.|  || .-. :       |  |   |  .--'|  ||  |(  .-''-.  .-' 
|  ||  ||  |    '  '--'\' '-' '\ `-' |\   --.    |   ,'.   |\   --.       |  |   |  |   '  ''  '.-'  `) |  |   
`--'`--''--'     `-----' `---'  `---'  `----'    '--'   '--' `----'       `--'   `--'    `----' `----'  `--'   
                                                                                                               
********************************************************************************************************************************************************/
public class Year {
	
	int		numIn12Congiap;
	String	nameInAmLich="";
	int		numDuongLich;
	
	public int getNumIn12Congiap() {
		return numIn12Congiap;
	}
	
	public void setNumIn12Congiap(int numIn12Congiap) {
		this.numIn12Congiap = numIn12Congiap;
	}
	
	public String getNameInAmLich() {
		return nameInAmLich;
	}
	
	public void setNameInAmLich(String nameInAmLich) {
		this.nameInAmLich += nameInAmLich;
	}
	
	public int getNumDuongLich() {
		return numDuongLich;
	}
	
	public void setNumDuongLich(int numDuongLich) {
		this.numDuongLich = numDuongLich;
	}
	
}
