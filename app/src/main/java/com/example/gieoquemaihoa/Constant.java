package com.example.gieoquemaihoa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/********************************************************************************************************************************************************
                                                                                                               
,--.             ,-----.          ,--.           ,--.   ,--.           ,--------.                       ,--.   
|  |,--,--,     '  .--./ ,---.  ,-|  | ,---.     |  |   |  | ,---.     '--.  .--',--.--.,--.,--. ,---.,-'  '-. 
|  ||      \    |  |    | .-. |' .-. || .-. :    |  |.'.|  || .-. :       |  |   |  .--'|  ||  |(  .-''-.  .-' 
|  ||  ||  |    '  '--'\' '-' '\ `-' |\   --.    |   ,'.   |\   --.       |  |   |  |   '  ''  '.-'  `) |  |   
`--'`--''--'     `-----' `---'  `---'  `----'    '--'   '--' `----'       `--'   `--'    `----' `----'  `--'   
                                                                                                               
********************************************************************************************************************************************************/
public class Constant {
	public static Map<String, Integer>	MAPNAMEOF8CHARM	= new HashMap<>();
	public final static String			CAN				= "Càn";
	public final static String			DOAI			= "Đoài";
	public final static String			LY				= "Ly";
	public final static String			CHAN			= "Chấn";
	public final static String			TON				= "Tốn";
	public final static String			KHON			= "Khôn";
	public final static String			KHAM			= "Khảm";
	public final static String			CAAN			= "Cấn";
	
	static {
		
		MAPNAMEOF8CHARM.put(CAN, 0);
		MAPNAMEOF8CHARM.put(DOAI, 1);
		MAPNAMEOF8CHARM.put(LY, 2);
		MAPNAMEOF8CHARM.put(CHAN, 3);
		MAPNAMEOF8CHARM.put(TON, 4);
		MAPNAMEOF8CHARM.put(KHAM, 5);
		MAPNAMEOF8CHARM.put(CAAN, 6);
		MAPNAMEOF8CHARM.put(KHON, 7);
		
	}
	
	public static Map<String, String> MAPNAMEIN64QUE = new HashMap<>();
	
	static {
		
		MAPNAMEIN64QUE.put(CAN, "Thiên");
		MAPNAMEIN64QUE.put(DOAI, "Trạch");
		MAPNAMEIN64QUE.put(LY, "Hoả");
		MAPNAMEIN64QUE.put(CHAN, "Lôi");
		MAPNAMEIN64QUE.put(TON, "Phong");
		MAPNAMEIN64QUE.put(KHAM, "Thuỷ");
		MAPNAMEIN64QUE.put(CAAN, "Sơn");
		MAPNAMEIN64QUE.put(KHON, "Địa");
		
	}


}
