package model;

public class model_CaSi {
    private int id;
    private String tenString;
    private String queQuanString;
    private int tuoi;
    private int gioiTinh;

    public model_CaSi() {
    }

    public model_CaSi(int id, String tenString, String queQuanString, int tuoi, int gioiTinh) {
        this.id = id;
        this.tenString = tenString;
        this.queQuanString = queQuanString;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenString() {
        return tenString;
    }

    public void setTenString(String tenString) {
        this.tenString = tenString;
    }

    public String getQueQuanString() {
        return queQuanString;
    }

    public void setQueQuanString(String queQuanString) {
        this.queQuanString = queQuanString;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
