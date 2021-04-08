
package emp_info;

public class Emp_info {

    String name;
    int year;
    String address;
    
    Emp_info(String name,int year,String address)
    {
        this.name = name;
        this.year = year;
        this.address = address;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Emp_info a = new Emp_info("Robert",1994,"64C-WallsStreet");
        Emp_info b = new Emp_info("Sam",2000,"68D-WallsStreet");
        Emp_info c = new Emp_info("John",1999,"26B-WallsStreet");

        System.out.println(a.name+"  "+a.year+"  "+a.address);
        System.out.println(b.name+"  "+b.year+"  "+b.address);
        System.out.println(c.name+"  "+c.year+"  "+c.address);
        
        
    }
    
}
