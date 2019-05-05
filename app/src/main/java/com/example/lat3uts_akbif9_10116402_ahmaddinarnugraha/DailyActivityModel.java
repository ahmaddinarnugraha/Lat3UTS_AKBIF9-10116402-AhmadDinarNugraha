//* Tanggal Pengerjaan : 02 - Mei - 2019
//* NIM                : 10116402
//* Nama               : Ahmad Dinar Nugraha
//* Kelas              : AKBIF-9

package com.example.lat3uts_akbif9_10116402_ahmaddinarnugraha;
public class DailyActivityModel {
    private String kegiatan;
    private int gbr;

    public DailyActivityModel(String kegiatan, int gbr)
    {
        this.gbr = gbr;
        this.kegiatan = kegiatan;
    }

    public DailyActivityModel() {
    }

    public int getGbr() {
        return gbr;
    }

    public void setGbr(int gbr) {
        this.gbr = gbr;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }
}
