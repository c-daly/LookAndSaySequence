package lookandsay;

import java.math.BigInteger;

public class LookAndSayIterator implements RIterator<BigInteger> {
    private BigInteger seed;
    private BigInteger defaultSeed = BigInteger.ZERO;
    private BigInteger end;
    private BigInteger current;
    @Override
    public BigInteger prev() {
        return current;
    }

    @Override
    public boolean hasPrevious() {
        if(current != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public BigInteger next() {
        return current;
    }

    public LookAndSayIterator(BigInteger seed, BigInteger end) {
        this.seed = seed;
        this.end = end;
    }
    public LookAndSayIterator(BigInteger seed) {
        current = seed;
    }

    public LookAndSayIterator() {
        this.seed = this.defaultSeed;
        this.current = this.defaultSeed;
        this.end = this.defaultSeed;

    }
}
