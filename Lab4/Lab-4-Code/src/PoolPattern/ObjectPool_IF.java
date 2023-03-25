package PoolPattern;

/*
 * @brief: Following the contents of 
 * ObjectPool_IF from UML diagram
 */
public interface ObjectPool_IF {
    int getSize();
    int getCapacity();
    void setCapacity(int c);
    Object getObject();
    Object waitForObject() throws InterruptedException;
    void release(Object o);
}
