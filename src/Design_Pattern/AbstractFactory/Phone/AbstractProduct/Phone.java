package Design_Pattern.AbstractFactory.Phone.AbstractProduct;

public abstract class Phone {
    protected String screen;
    protected String body;
    protected String processor;

    public abstract void displayInfo() ;
    public abstract void makeCall() ;
    public void ShowDetails() {
        System.out.println("Screen : " + screen);
        System.out.println("Body : " + body);
        System.out.println("Processor" + processor);
    }


}
