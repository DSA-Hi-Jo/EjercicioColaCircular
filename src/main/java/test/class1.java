package test;

/**
 * Created by hixam on 23/09/16.
 */
public class class1 {
    int num = 0;
    int[] Arraynum;

    public class1()
    {}
    public void Empezar (int _num1)
    {
     
        num = _num1;
        int[] tempArray= new int[num];
        Crear(num,tempArray);
    }

     public int[] Crear (int _ref, int[] _Array)
    {
        if (_Array.length !=0)
            Arraynum = _Array;
        for (int i=0; i< _ref ; i++) {
            Arraynum[i] = i + _ref + _Array[i];
        }
        return  Arraynum;
    }

    public int[] leer()
    {
        return  Arraynum.length != 0 ? Arraynum : null ;
    }
}
