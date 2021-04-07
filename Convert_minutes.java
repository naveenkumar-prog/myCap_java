package convert_minutes;

public class Convert_minutes {
    int x =3456789;


    public static void main(String[] args) {
        Convert_minutes a = new Convert_minutes();
        int x1 = a.x;
        con(x1);
        
    }
    
    public static void con(int b){
        Convert_minutes c = new Convert_minutes();

        int years = b/(365*24*60);
        int days = b%365;
        System.out.println(c.x+" is approximately "+years+"years and "+days+"days");
    }
    
}
