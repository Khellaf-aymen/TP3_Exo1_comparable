import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        
    Random rand = new Random();




int n = 10; // la taille de tableau 
Vectores []testtab = new Vectores[n];

for(int i=0;i<n;i++)
{
    testtab[i] = new Vectores(rand.nextInt(10),rand.nextInt(10));
}
//before sort 

for(int i=0;i<n;i++)
{
    System.out.println(i+"---->"+testtab[i]+"---->"+testtab[i].norme());

}

System.out.println("////////////////////////////////////////////////////////////////////////////////////////");


// after sort 
Arrays.sort(testtab);

for(int i=0;i<n;i++)
{
    System.out.println(i+"---->"+testtab[i]+"---->"+testtab[i].norme());

}

// random test 
 Vectores a = new Vectores(10, 10);
    Vectores b = new Vectores(25, 25);
//if(a.compareTo(b))System.out.println("a>b)";
    


    }
   
}
