package workhome4;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangle {
    //@Getter
    //@Setter
    private int a;
    private int b;
    private int c;
    private Colour colour = Colour.BLUE;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }

    public int calculatePerimetr()
    {   checkNotNullSides();
        checkValid();
        return a+b+c;
    }

    private void checkNotNullSides()
    {
        if(a <= 0 || b<= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника не могут быть меньше либо равны нулю");
        }
    }

    private void checkValid() {
        long max = Math.max(Math.max(a,b),c);
        if ( max >= (a + b + c - max)) {
            throw new IllegalArgumentException("The any two sides must be greater then other side ");
        }
    }
    public double areaTriangle() {
        double n = (a + b + c) / 2;
        return Math.sqrt(n*(n-a)*(n-b)*(n-c));
    }
}
