import org.junit.Assert;
import org.junit.Test;


public class ARSetTest extends ARSet {

    @Test
        public void testTwoIdenticalElements() {
        ARSetTest set = new ARSetTest();
        set.add(10);
        set.add(10);

        Assert.assertTrue(set.size()== 1);
    }
}

    @Test
    public void testTwoIdenticalElementsInArray() {
        ARSetTest set = new ARSetTest();
        this.elems.add(10);
        this.elems.add(10);

        Assert.assertTrue(set.size()== 1);
    }
}
