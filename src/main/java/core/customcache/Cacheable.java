package core.customcache;

/**
 * Created by sunilp on 3/6/18.
 */
public interface Cacheable {
	boolean isExpired();
	Object getIdentifier();
}
