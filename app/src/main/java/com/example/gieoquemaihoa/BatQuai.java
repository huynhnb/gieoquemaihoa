package com.example.gieoquemaihoa;

/********************************************************************************************************************************************************
                                                                                                               
,--.             ,-----.          ,--.           ,--.   ,--.           ,--------.                       ,--.   
|  |,--,--,     '  .--./ ,---.  ,-|  | ,---.     |  |   |  | ,---.     '--.  .--',--.--.,--.,--. ,---.,-'  '-. 
|  ||      \    |  |    | .-. |' .-. || .-. :    |  |.'.|  || .-. :       |  |   |  .--'|  ||  |(  .-''-.  .-' 
|  ||  ||  |    '  '--'\' '-' '\ `-' |\   --.    |   ,'.   |\   --.       |  |   |  |   '  ''  '.-'  `) |  |   
`--'`--''--'     `-----' `---'  `---'  `----'    '--'   '--' `----'       `--'   `--'    `----' `----'  `--'   
                                                                                                               
********************************************************************************************************************************************************/

public abstract class BatQuai {
	public Hao	hao1	= new Hao();
	public Hao	hao2	= new Hao();
	public Hao	hao3	= new Hao();
	
	public Hao getHao1() {
		return hao1;
	}
	
	public void setHao1(Hao hao1) {
		this.hao1 = hao1;
	}
	
	public Hao getHao2() {
		return hao2;
	}
	
	public void setHao2(Hao hao2) {
		this.hao2 = hao2;
	}
	
	public Hao getHao3() {
		return hao3;
	}
	
	public void setHao3(Hao hao3) {
		this.hao3 = hao3;
	}
	
	String getNameNghich() {
		String strName = "";
		
		if (hao3.getValue() == 1) {
			if (hao2.getValue() == 1) {
				if (hao1.getValue() == 1) {
					strName = Constant.CAN;
				} else {
					strName = Constant.TON;
				}
			} else {
				if (hao1.getValue() == 1) {
					strName = Constant.LY;
				} else {
					strName = Constant.CAAN;
				}
			}
		} else {
			if (hao2.getValue() == 1) {
				if (hao1.getValue() == 1) {
					strName = Constant.DOAI;
				} else {
					strName = Constant.KHAM;
				}
			} else {
				if (hao1.getValue() == 1) {
					strName = Constant.CHAN;
				} else {
					strName = Constant.KHON;
				}
			}
		}
		
		return strName;
	}
	
	
	String getNameThuan() {
		String strName = "";
		
		if (hao1.getValue() == 1) {
			if (hao2.getValue() == 1) {
				if (hao3.getValue() == 1) {
					strName = Constant.CAN;
				} else {
					strName = Constant.TON;
				}
			} else {
				if (hao3.getValue() == 1) {
					strName = Constant.LY;
				} else {
					strName = Constant.CAAN;
				}
			}
		} else {
			if (hao2.getValue() == 1) {
				if (hao3.getValue() == 1) {
					strName = Constant.DOAI;
				} else {
					strName = Constant.KHAM;
				}
			} else {
				if (hao3.getValue() == 1) {
					strName = Constant.CHAN;
				} else {
					strName = Constant.KHON;
				}
			}
		}
		
		return strName;
	}
}
