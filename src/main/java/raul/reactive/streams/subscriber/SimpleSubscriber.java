package raul.reactive.streams.subscriber;

import java.util.concurrent.Flow;

/**
 * @author Raul Mata - raul.mata@lottoland.com
 * @since 2019-07-02
 */
public class SimpleSubscriber implements Flow.Subscriber<Integer> {

    private Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        System.out.println("Subscription created: " + subscription.toString());
    }

    @Override
    public void onNext(Integer item) {
        System.out.println("item = [" + item + "]");
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onComplete() {
    }
}
