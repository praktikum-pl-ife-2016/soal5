



public class Aritmatika {
    
public static final double phi= 3.14;

public static double hitungLuasSegitiga(double a,double t){
double luas = (a*t)/2;

System.out.println("Luas Segitiga adalah : "+luas);
return luas;
}

public static double hitungKelilingSegitiga(double s){
double keliling = (s+s+s);

System.out.println("Keliling Segitiga adalah : "+keliling);
return keliling;
}

public static double hitungLuasSegiempat(double g){
double luas = (g*g);
System.out.println("Luas Segiempat adalah : "+luas);
return luas;
}
public static double hitungKelilingSegiempat(double t){
double keliling = (t+t+t+t);
System.out.println("Keliling Segiempat adalah : "+keliling);
return keliling;
}

public static double hitungLuasLingkaran(double r){
double luas = phi*r*r;
System.out.println("Luas Lingkaran adalah : "+luas);
return luas;
}
public static double hitungKelilingLingkaran(double d){
double keliling = 2*phi*d;
System.out.println("Keliling Lingkaran adalah : "+keliling);
return keliling;
}
}

        
        
    
    

