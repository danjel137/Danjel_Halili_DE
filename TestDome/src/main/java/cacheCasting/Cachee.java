package cacheCasting;
public class Cachee{
public class Cache {}
    public class DiskCache extends Cache {}

    public class MemoryCache extends Cache {}

    public class OptimizedDiskCache extends DiskCache {}

    public static void main(String[] args) {
        //        MemoryCache memoryCache = new MemoryCache();
//        Cache cache = (Cache) memoryCache;
//        DiskCache diskCache = (DiskCache) cache;
//
//        DiskCache diskCache = new DiskCache();
//        OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
//
//        Cache cache = new Cache();
//        MemoryCache memoryCache = (MemoryCache) cache;
    }

}
