import java.util.Deque;

public class DoubleEndedListQueue implements DoubleEndedQueue{

    DequeNode node;

    public DoubleEndedListQueue(){
        node = null;
    }

    @Override
    public void append(DequeNode node){

    }

    @Override
    public void appendLeft(DequeNode node) {

    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public DequeNode peekFirst() {
        return null;
    }

    @Override
    public DequeNode peekLast() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
