package raul.reactive.streams.publisher;

import org.reactivestreams.tck.TestEnvironment;
import org.reactivestreams.tck.flow.FlowPublisherVerification;

import java.util.concurrent.Flow;

public class SimplePublisherTest extends FlowPublisherVerification<Integer> {
    public SimplePublisherTest() {
        super(new TestEnvironment());
    }

    @Override
    public Flow.Publisher<Integer> createFlowPublisher(long l) {
        return new SimplePublisher((int) l);
    }

    @Override
    public Flow.Publisher<Integer> createFailedFlowPublisher() {
        return null;
    }
}
