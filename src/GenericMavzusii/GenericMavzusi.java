package GenericMavzusii;

public class GenericMavzusi {
    public <w,u> String isValeueEqual(w a, u b){
        if (a.toString().equals(b.toString())){
            return "qiymatlari teng";

        }else
            return "Qiymatlari teng emas";
    }

    public static void main(String[] args) {
        GenericMavzusi genericMavzusi=new GenericMavzusi();
        System.out.println(genericMavzusi.isValeueEqual(123,123));
    }
}
