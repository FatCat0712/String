public enum PizzaStatus {
    DAT_HANG(5),
    CHUAN_BI(15),
    GIAO_HANG(10);

    private int thoiGian;

    PizzaStatus(int thoiGian){
        this.thoiGian = thoiGian;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }
}
