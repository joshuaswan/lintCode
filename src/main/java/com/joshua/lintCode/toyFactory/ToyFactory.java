package com.joshua.lintCode.toyFactory;

/**
 * Created by joshua on 2017/9/13.
 */
public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        if (type.equals("Dog")){
            return new Dog();
        }else if (type.equals("Cat")){
            return new Cat();
        }else {
            return new Toy() {
                @Override
                public void talk() {
                    System.out.println(type);
                }
            };
        }
    }
}
