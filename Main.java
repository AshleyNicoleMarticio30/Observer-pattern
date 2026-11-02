public class Main {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Subscriber s1 = new Subscriber("Ashley");
        Subscriber s2 = new Subscriber("Nicole");
        Subscriber s3 = new Subscriber("John");

        agency.subscribe(s1);
        agency.subscribe(s2);
        agency.subscribe(s3);

        agency.publishNews("New discovery released!");

        agency.unsubscribe(s2);

        System.out.println("\nA subscriber has unsubscribed.");

        agency.publishNews("Latest tech breakthrough!");
    }
}