package org.example.ex01_SampleCheck;

public class APITesting003_NoDesignPattern {

    public void step1(){
        System.out.println("step 1");
    }

    public void step2(){
        System.out.println("step 2");
    }

    public void step3(){
        System.out.println("step 3");
    }

    public static void main(String[] args) {
        APITesting003_NoDesignPattern np=new APITesting003_NoDesignPattern();

        np.step1();
        np.step2();
        np.step3();
    }

}
