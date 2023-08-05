import components.set.Set;
import components.set.Set1L;

/**
 * Layered implementations of secondary methods {@code add} and {@code remove}
 * for {@code Set}.
 * 
 * @param <T>
 *            type of {@code Set} elements
 */
public final class SetSecondary1L<T> extends Set1L<T> {

    /**
     * No-argument constructor.
     */
    public SetSecondary1L() {
        super();
    }

    @Override
    public Set<T> remove(Set<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";
        if (s.size()==0) return new Set1L<>();
        Set<T> set = new Set1L<>();
        Set<T> temp = new Set1L<>();
        for (T i : this) {
        	for (T j : s) {
        		if (!i.equals(j) && !set.contains(i) && this.contains(j)) {
        			set.add(i);
        			System.out.println("Added: " + set);
        		} else if (i.equals(j) && !temp.contains(i) & this.contains(j)){
        			temp.add(i);
        		}
        	}
        }
        if (set.size()>0)this.transferFrom(set);
        return temp;
    }

    @Override
    public void add(Set<T> s) {
        assert s != null : "Violation of: s is not null";
        assert s != this : "Violation of: s is not this";
        Set<T> temp = new Set1L<>();
        for (T i : s) {
        	if (!this.contains(i))
        		this.add(i);
        	else {
        		s.add(i);
        	}
        }
        s.transferFrom(temp);
    }

}