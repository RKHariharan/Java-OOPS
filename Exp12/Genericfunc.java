package exp12;

public class Genericfunc {
    public static void main(String[]args){
        Integer arr[]={23,71,90,45,18,333,228};
        Genericfunc o=new  Genericfunc ();
        o.min(arr);

    }
    <t extends Comparable <t>> void min(t[] arr){
        t m;
        m=arr[0];
        for(int i=0;i<arr.length;i++)

        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    m=arr[j];
                }
            }
        }
        System.out.println("MINIMUM OF LIST:::"+ m);

    }
}
