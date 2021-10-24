package com.example.gieoquemaihoa;

/********************************************************************************************************************************************************
                                                                                                               
,--.             ,-----.          ,--.           ,--.   ,--.           ,--------.                       ,--.   
|  |,--,--,     '  .--./ ,---.  ,-|  | ,---.     |  |   |  | ,---.     '--.  .--',--.--.,--.,--. ,---.,-'  '-. 
|  ||      \    |  |    | .-. |' .-. || .-. :    |  |.'.|  || .-. :       |  |   |  .--'|  ||  |(  .-''-.  .-' 
|  ||  ||  |    '  '--'\' '-' '\ `-' |\   --.    |   ,'.   |\   --.       |  |   |  |   '  ''  '.-'  `) |  |   
`--'`--''--'     `-----' `---'  `---'  `----'    '--'   '--' `----'       `--'   `--'    `----' `----'  `--'   
                                                                                                               
********************************************************************************************************************************************************/
public class ConvertDuongLichtoAmLich {
	public static Year ConvertDL2AL(Year year) {
		switch (year.getNumDuongLich() % 10) {
			case 0:
				year.setNameInAmLich("Canh ");
				break;
			case 1:
				year.setNameInAmLich("Tân ");
				break;
			case 2:
				year.setNameInAmLich("Nhâm ");
				break;
			case 3:
				year.setNameInAmLich("Quý ");
				break;
			case 4:
				year.setNameInAmLich("Giáp ");
				break;
			case 5:
				year.setNameInAmLich("Ất ");
				break;
			case 6:
				year.setNameInAmLich("Bính ");
				break;
			case 7:
				year.setNameInAmLich("Đinh ");
				break;
			case 8:
				year.setNameInAmLich("Mậu ");
				break;
			case 9:
				year.setNameInAmLich("Kỷ ");
				break;
		}
		
		// Xác định Chi
		switch (year.getNumDuongLich() % 12) {
			case 0:
				year.setNameInAmLich("Thân");
				year.setNumIn12Congiap(9);
				break;
			case 1:
				year.setNameInAmLich("Dậu ");
				year.setNumIn12Congiap(10);
				break;
			case 2:
				year.setNameInAmLich("Tuất");
				year.setNumIn12Congiap(11);
				break;
			case 3:
				year.setNameInAmLich("Hợi ");
				year.setNumIn12Congiap(12);
				break;
			case 4:
				year.setNameInAmLich("Tý ");
				year.setNumIn12Congiap(1);
				break;
			case 5:
				year.setNameInAmLich("Sửu ");
				year.setNumIn12Congiap(2);
				break;
			case 6:
				year.setNameInAmLich("Dần ");
				year.setNumIn12Congiap(3);
				break;
			case 7:
				year.setNameInAmLich("Mão ");
				year.setNumIn12Congiap(4);
				break;
			case 8:
				year.setNameInAmLich("Thìn ");
				year.setNumIn12Congiap(5);
				break;
			case 9:
				year.setNameInAmLich("Tỵ ");
				year.setNumIn12Congiap(6);
				break;
			case 10:
				year.setNameInAmLich("Ngọ ");
				year.setNumIn12Congiap(7);
				break;
			case 11:
				year.setNameInAmLich("Mùi ");
				year.setNumIn12Congiap(8);
				break;
		}
		return year;
	}
	
	public static int convertGioDLtoAL(int h, int min) {
		if (min > 0) {
			if (h == 24) {
				h = 0;
			} else {
				h += 1;
			}
		}
		
		int hConvert = 0;
		switch (h) {
			case 0:
				hConvert = 1;
				break;
			case 1:
				hConvert = 1;
				break;
			case 2:
				hConvert = 2;
				break;
			case 3:
				hConvert = 2;
				break;
			case 4:
				hConvert = 3;
				break;
			case 5:
				hConvert = 3;
				break;
			case 6:
				hConvert = 4;
				break;
			case 7:
				hConvert = 4;
				break;
			case 8:
				hConvert = 5;
				break;
			case 9:
				hConvert = 5;
				break;
			case 10:
				hConvert = 6;
				break;
			case 11:
				hConvert = 6;
				break;
			case 12:
				hConvert = 7;
				break;
			case 13:
				hConvert = 7;
				break;
			case 14:
				hConvert = 8;
				break;
			case 15:
				hConvert = 8;
				break;
			case 16:
				hConvert = 9;
				break;
			case 17:
				hConvert = 9;
				break;
			case 18:
				hConvert = 10;
				break;
			case 19:
				hConvert = 10;
				break;
			case 20:
				hConvert = 11;
				break;
			case 21:
				hConvert = 11;
				break;
			case 22:
				hConvert = 12;
				break;
			case 23:
				hConvert = 12;
				break;
			case 24:
				hConvert = 1;
				break;
			
		}
		return hConvert;
	}
	
}
