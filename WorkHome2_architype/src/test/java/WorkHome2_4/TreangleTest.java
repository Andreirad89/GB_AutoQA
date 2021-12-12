package WorkHome2_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import workhome4.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreangleTest {
    @Test
    void egyptTriangleThenSuccesedPerimetrTest() {
        Triangle triangle=new Triangle(3,4,5); //готовим данные
        int actualResult = triangle.calculatePerimetr(); //вызыввем метод который хотим проверить
        assertEquals(12,actualResult); // сравниваем желаемый результат с актуальным
    }
    @Test
    void checkAreaTriangle() {
        Triangle triangle=new Triangle(3,4,5); //готовим данные
        double actualResult = triangle.areaTriangle(); //вызыввем метод который хотим проверить
        assertEquals(6,actualResult); // сравниваем желаемый результат с актуальным
    }
}
