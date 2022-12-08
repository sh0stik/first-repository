package lec120722.lab30371;

public class MyRunner {
    public static void main(String[] args) {
        GMultipleDatatype<String, Integer> mObjOne = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mObjOne.getValueOne());
        System.out.println(mObjOne.getValueTwo());

        GMultipleDatatype<String, String> mObjTwo = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mObjTwo.getValueOne());
        System.out.println(mObjTwo.getValueTwo());

    }
}
