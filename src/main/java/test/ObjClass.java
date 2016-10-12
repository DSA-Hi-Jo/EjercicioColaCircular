package test;

/**
 * Created by hixam on 3/10/16.
 */
public class ObjClass {
    public String Name;
    public double Price;
    public int[] Registro;

    public ObjClass(){return;}

    public  ObjClass ( String _Name, double _Price , int[] _Registro)
    {
        Name = _Name;
        Price = _Price;
        Registro = _Registro;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int[] getRegistro() {
        return Registro;
    }

    public void setRegistro(int[] registro) {
        Registro = registro;
    }





}
