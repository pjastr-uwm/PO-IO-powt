public class TestCat {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = c1.createCat("Azor");
        System.out.println(c2.name);
        Cat c3 = c1.createCat(null);
        System.out.println(c3);
    }
}

class Cat{
    String name;
    Cat createCat(String value)
    {
        Cat temp = new Cat();
        if (value == null)
        {
            return null;
        }
        temp.name = value;
        return temp;
    }
}
