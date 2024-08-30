package Enum;

public enum XepLoai {
    /*
    * Enum
    * 1. Dùng để lưu trữ tập dữ liệu dưới dạng liệt kê
    * */
    gioi ("XL giỏi"), //0
    kha,  //1
    tb,  //2
    yeu, //3
    duoihoc, //4
    // Viet tieng viet
    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }
    public String des(){
        return this.msg;
    }
}
