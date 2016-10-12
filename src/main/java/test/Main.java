package test;

import com.sun.org.apache.bcel.internal.classfile.Field;
import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.*;

/**
 * Created by hixam on 23/09/16.
 */
public class Main {
    int num = 0;
    int[] Arraynum;

    public static void main ( String args[] ) {
        ObjClass[] obja = new ObjClass[10];
        String Line = System.getProperty("line.separator");
        ObjClass[] obj = Empezar(5);
        Queue<ObjClass> prq = new LinkedList<ObjClass>();
//        for (int i = 0; obj.length > i; i++ )
        int ii = 0;
        for (ObjClass count : obj) {
            String name = (String) count.Name;
            double bd = (double) count.Price;
            String zxc = Arrays.toString(count.Registro);
            prq.add(count);
            if (!prq.isEmpty())
                System.out.printf("Recorriendo cola ... En la posición " + ii + " Tenemos ->" + "  Nombre: " + name + "   Precio:" + bd+ "    Registro:" + zxc+ Line);
            else
                System.out.printf("Recorriendo cola ... : " + "Posicón " + ii + " esta vacia" + Line);
        ii++;
        }
        ObjClass _poll = prq.poll(); //Eliminamos el primer elemento de la cola y lo guardamos en la variable _poll
        String alk = Arrays.toString(_poll.Registro);
        System.out.printf("Borramos el primer elemento guardado en la cola :" + (String) _poll.Name + "  " + (double) _poll.Price + "   " + alk + Line);
        System.out.printf("El tamaño de la cola ahora es :" + prq.size() + Line);

            for (ObjClass _Object : prq) {
                System.out.printf("Los elementos de la cola son :" + _Object+ Line);
            }
        }


     public static ObjClass[] Empezar(int _num1)
    {
        ObjClass[] testObj = new ObjClass[_num1];
        double dbl;
        int num = _num1;
        ArrayList NameList = new ArrayList();
        int[] cnt = new int[_num1];
        for (int i =0; i<_num1; i++)
        {
            NameList.add("Cliente" + (i+1));
            cnt[i] = i + 4/num ;
            dbl= num * 2.13/100 * i + 23 * 5;
            testObj[i] = new ObjClass(NameList.get(i).toString(), dbl, cnt);
        }

        //Crear(num,testObj);
        return  testObj;
    }

   /* public int[] Crear (int _ref, ObjClass[] _ArrayObj)
    {
        if (_ArrayObj.length !=0)
            Arraynum = _Array;
        for (int i=0; i< _ArrayObj.length ; i++) {
            Arraynum[i] = i + _ref + _Array[i];
        }
        return  Arraynum;
    }
*/
   /* public int[] leer()
    {
        return  Arraynum.length != 0 ? Arraynum : null ;
    }*/
}

