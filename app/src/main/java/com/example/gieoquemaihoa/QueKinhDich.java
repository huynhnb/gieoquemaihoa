package com.example.gieoquemaihoa;

import java.util.HashMap;

public class QueKinhDich {
    int hao6;
    int hao5;
    int hao4;
    int hao3;
    int hao2;
    int hao1;
    int[] hao_bien;

    public int[] getHao_bien() {
        return hao_bien;
    }

    public void setHao_bien(int[] hao_bien) {
        this.hao_bien = hao_bien;
    }

    private static final HashMap<String, String> haotoTenQue = new HashMap<>();

    static {
        haotoTenQue.put("111111", "thuancan");
        haotoTenQue.put("000000", "thuankhon");
        haotoTenQue.put("011111", "thienphongcau");
        haotoTenQue.put("001111", "thiensondon");
        haotoTenQue.put("000111", "thiendiabi");
        haotoTenQue.put("000011", "phongdiaquan");
        haotoTenQue.put("000001", "sondiabac");
        haotoTenQue.put("000101", "hoadiatan");
        haotoTenQue.put("111101", "hoathiendaihuu");
        haotoTenQue.put("110110", "thuandoai");
        haotoTenQue.put("010110", "trachthuykhon");
        haotoTenQue.put("000110", "trachdiatuy");
        haotoTenQue.put("001110", "trachsonham");
        haotoTenQue.put("001010", "thuysonkien");
        haotoTenQue.put("001000", "diasonkhiem");
        haotoTenQue.put("001100", "loisontieuqua");
        haotoTenQue.put("110100", "loitrachquymuoi");
        haotoTenQue.put("101101", "thuanly");
        haotoTenQue.put("001101", "hoasonlu");
        haotoTenQue.put("011101", "hoaphongdinh");
        haotoTenQue.put("010101", "hoathuyvite");
        haotoTenQue.put("010001", "sonthuymong");
        haotoTenQue.put("010011", "phongthuyhoan");
        haotoTenQue.put("010111", "thienthuytung");
        haotoTenQue.put("101111", "thienhoadongnhan");
        haotoTenQue.put("100100", "thuanchan");
        haotoTenQue.put("000100", "loidiadu");
        haotoTenQue.put("010100", "loithuygiai");
        haotoTenQue.put("011100", "loiphonghang");
        haotoTenQue.put("011000", "diaphongthang");
        haotoTenQue.put("011010", "thuyphongtinh");
        haotoTenQue.put("011110", "trachphongdaiqua");
        haotoTenQue.put("100110", "trachloituy");
        haotoTenQue.put("011011", "thuanton");
        haotoTenQue.put("111011", "phongthientieusuc");
        haotoTenQue.put("101011", "phonghoagianhan");
        haotoTenQue.put("100011", "phongloiich");
        haotoTenQue.put("100111", "thienloivovong");
        haotoTenQue.put("100101", "hoaloiphehap");
        haotoTenQue.put("100001", "sonloidi");
        haotoTenQue.put("011001", "sonphongco");
        haotoTenQue.put("010010", "thuankham");
        haotoTenQue.put("110010", "thuytrachtiet");
        haotoTenQue.put("100010", "thuyloitruan");
        haotoTenQue.put("101010", "thuyhoakyte");
        haotoTenQue.put("101110", "trachhoacach");
        haotoTenQue.put("101100", "loihoaphong");
        haotoTenQue.put("101000", "diahoaminhdi");
        haotoTenQue.put("010000", "diathuysu");
        haotoTenQue.put("001001", "thuancaan");
        haotoTenQue.put("101001", "sonhoabi");
        haotoTenQue.put("111001", "sonthiendaisuc");
        haotoTenQue.put("110001", "sontrachton");
        haotoTenQue.put("110101", "hoatrachkhue");
        haotoTenQue.put("110111", "thientrachly");
        haotoTenQue.put("110011", "phongtrachtrungphu");
        haotoTenQue.put("001011", "phongsontiem");
        haotoTenQue.put("000000", "thuankhon");
        haotoTenQue.put("100000", "dialoiphuc");
        haotoTenQue.put("110000", "diatrachlam");
        haotoTenQue.put("111000", "diathienthai");
        haotoTenQue.put("111100", "loithiendaitrang");
        haotoTenQue.put("111110", "trachthienquai");
        haotoTenQue.put("111010", "thuythiennhu");
        haotoTenQue.put("000010", "thuydiaty");
    }

    public int getHao6() {
        return hao6;
    }

    public void setHao6(int hao6) {
        this.hao6 = hao6;
    }

    public int getHao5() {
        return hao5;
    }

    public void setHao5(int hao5) {
        this.hao5 = hao5;
    }

    public int getHao4() {
        return hao4;
    }

    public void setHao4(int hao4) {
        this.hao4 = hao4;
    }

    public int getHao3() {
        return hao3;
    }

    public void setHao3(int hao3) {
        this.hao3 = hao3;
    }

    public int getHao2() {
        return hao2;
    }

    public void setHao2(int hao2) {
        this.hao2 = hao2;
    }

    public int getHao1() {
        return hao1;
    }

    public void setHao1(int hao1) {
        this.hao1 = hao1;
    }

    public String getTenQue() {
        String tenque = QueToString();

        String tenFileQue = haotoTenQue.get(tenque);

        return tenFileQue;

    }

    public QueKinhDich() {

    }

    public QueKinhDich(String initQue, int[] hao_bien_int) {
        hao_bien = hao_bien_int;
        char[] intHao = initQue.toCharArray();
        hao1 = Integer.parseInt(String.valueOf(intHao[0]));
        hao2 = Integer.parseInt(String.valueOf(intHao[1]));
        hao3 = Integer.parseInt(String.valueOf(intHao[2]));
        hao4 = Integer.parseInt(String.valueOf(intHao[3]));
        hao5 = Integer.parseInt(String.valueOf(intHao[4]));
        hao6 = Integer.parseInt(String.valueOf(intHao[5]));

    }

    public QueKinhDich getQueHo() {
        QueKinhDich queHo = new QueKinhDich();
        queHo.hao1 = hao2;
        queHo.hao2 = hao3;
        queHo.hao3 = hao4;
        queHo.hao4 = hao3;
        queHo.hao5 = hao4;
        queHo.hao6 = hao5;
        return queHo;
    }

    public QueKinhDich getQueBien() {
        QueKinhDich queBien = new QueKinhDich();


        if (hao_bien[1] == 1) {
            if (hao1 == 0) {
                queBien.hao1 = 1;
            } else {
                queBien.hao1 = 0;
            }

        } else {
            queBien.hao1 = hao1;
        }

        if (hao_bien[2] == 1) {
            if (hao2 == 0) {
                queBien.hao2 = 1;
            } else {
                queBien.hao2 = 0;
            }

        } else {
            queBien.hao2 = hao2;
        }
        if (hao_bien[3] == 1) {
            if (hao3 == 0) {
                queBien.hao3 = 1;
            } else {
                queBien.hao3 = 0;
            }

        } else {
            queBien.hao3 = hao3;
        }
        if (hao_bien[4] == 1) {
            if (hao4 == 0) {
                queBien.hao4 = 1;
            } else {
                queBien.hao4 = 0;
            }

        } else {
            queBien.hao4 = hao4;
        }

        if (hao_bien[5] == 1) {
            if (hao5 == 0) {
                queBien.hao5 = 1;
            } else {
                queBien.hao5 = 0;
            }

        } else {
            queBien.hao5 = hao5;
        }

        if (hao_bien[6] == 1) {
            if (hao6 == 0) {
                queBien.hao6 = 1;
            } else {
                queBien.hao6 = 0;
            }

        } else {
            queBien.hao6 = hao6;
        }


        return queBien;
    }


    public String QueToString() {
        return String.valueOf(hao1) + String.valueOf(hao2) + String.valueOf(hao3) + String.valueOf(hao4) + String.valueOf(hao5) + String.valueOf(hao6);
    }


}
