package raul.reactive.streams;

import raul.reactive.streams.publisher.SimplePublisher;
import raul.reactive.streams.subscriber.SimpleSubscriber;

public class App
{
    public static void main(String[] args) {
        SimplePublisher publisher = new SimplePublisher(10);
        publisher.subscribe(new SimpleSubscriber());
    }
}
