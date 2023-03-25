package PoolPattern;

/*
 * @brief use the object pool class to implement with the interface
 * as shown in the uml diagram
 * 
 * @note size to keep track of free objects 
 */
public class ObjectPool implements ObjectPool_IF{
    private final Object lockObject = new Object();

    private int size; //how many free objects
    private int instanceCount; //how many objects have been created
    private int maxInstances; //maximum objects to be created
    private Object[] pool;

    private static ObjectPool poolInstance = null;   
    private ObjectCreation_IF creator;

    /*
     * @brief Constructor
     * @param c for Object creation interface
     * @param max for int
     * 
     * @note intialize instanceCount to zero by default
     */
    private ObjectPool(ObjectCreation_IF c, int max) {
       this.creator = c;
       this.instanceCount = 0;
       this.size = 0;
       this.maxInstances = max;
       this.pool = new Object[maxInstances];
    }

    /*
     * @brief to get an object pool
     * @param c
     * @param max
     * @return the instance of the ObjectPool
     */
    public synchronized static ObjectPool getPoolInstance(ObjectCreation_IF c, int max){
        if (poolInstance==null)
            poolInstance = new ObjectPool(c, max);
      return poolInstance;
    }

    /*
     * @return size of counting total of agents
     */
    public int getSize() {
        return size;
    }

    /*
     * @return the highest number of instances
     */
    public int getCapacity() {
        return maxInstances;
    }

    /*
     * @brief to set the total number of objects that makes up the object pool
     * @param c to represent capacity
     * 
     * @note sychronized is to represent the threads that will not override data coming from the other agents
     * 
     */
    public void setCapacity(int c) {
        if(c <= 0) {
            throw new IllegalArgumentException();
        }
        synchronized(lockObject) {
            maxInstances = c;
            Object[] temp = new Object[c];
            System.arraycopy(pool, 0, temp, 0, maxInstances);
            pool = temp;
        }
    }

    /*
     * @brief get an object from the object pool
     * @return the object by calling the functions or NULL
     */
    public Object getObject() {
        synchronized(lockObject) {
            if(size > 0) {
                return removeObject();
            } else if (instanceCount < maxInstances) {
                return createObject();
            }
            return null;           
        }
    }

    /*
     * @brief obtains an object when it becomes available from the object pool
     * @return the object
     */
    public Object waitForObject() throws InterruptedException {
        synchronized(lockObject) {
            if(size > 0) {
                return removeObject();
            } else if(instanceCount < maxInstances) {
                return createObject();
            } else {
                do {
                    lockObject.wait();
                } while(size <= 0);
                
                return removeObject();
            }
        }
    }

    /*
     * @brief removes an object from object pool
     * @return the specific index from pool array
     */
    private Object removeObject() {
        size--;
        return pool[size];
    }

    /*
     * @brief releases an object from the object pool
     * @param o, the object to be inserted back inside the pool
     * 
     * @note sychronized will be handled for threads
     * @note lockObject.notify() to know when the object has been released
     */
    public void release(Object o) {
        if(o == null) {
            throw new NullPointerException();
        }
        synchronized(lockObject) {
        if (size < getCapacity()) {
            pool[size] = o;
            size++;
            lockObject.notify();
        } 
      }
    }

    /*
     * @brief makes a new object to include
     * @return the new object
     */
    private Object createObject() {
        instanceCount++;
        return creator.create();
    }

}
