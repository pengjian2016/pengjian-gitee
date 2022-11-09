package JUC;

import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class AtomicReferenceDemo {

    @Test
    public void test() {
        Car a = new Car(100, 10);
        AtomicReference<Car> carAtomicReference = new AtomicReference<>();

        // 当前如果是car1对象时，以原子方式变更引用为car2对象，当结果是true时则更新成功
        Car a2 = new Car(200, 20);
        boolean b = carAtomicReference.compareAndSet(a, a2);
        System.out.println(b);
    }


}


class Car {
    private int name;
    private int age;

    public Car() {
    }

    public Car(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
