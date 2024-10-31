# Multithreading Performance Comparison in Java

This project demonstrates the performance difference between sequential execution and concurrent execution using threads in Java. It simulates a time-consuming task to represent an I/O-bound operation.

## Overview

The project includes two implementations:

1. **SequentialExecution**: Tasks are executed one after the other.
2. **ThreadedExecution**: Tasks are executed concurrently using threads.

This example illustrates how multithreading can significantly improve the performance of I/O-bound tasks.

## Files

- `WithoutThread.java`: Contains the implementation of sequential execution.
- `WithThread.java`: Contains the implementation of concurrent execution using threads.

## Usage

1. Clone the repository

```
   git clone https://github.com/asimar007/Multithreading-Performance-Test
   cd Multithreading-Performance-Test
```

2.  Compile and run the sequential execution

```
    javac WithoutThread.java
```

```
   java WithoutThread
```

3.  Compile and run the threaded execution

```
    javac WithThread.java
```

```
    java WithThread
```

## Expected Output

### Sequential Execution

![Without Thread](https://github.com/asimar007/Cross-Region-Migration-of-AWS-EBS-Volumes/blob/main/Screenshot/Thread-1.png?raw=true)

### Threaded Execution

![With Thread](https://github.com/asimar007/Cross-Region-Migration-of-AWS-EBS-Volumes/blob/main/Screenshot/Thread-2.png?raw=true)

## Conclusion

This project demonstrates the advantages of using multithreading for improving application performance, especially in scenarios involving I/O-bound tasks. By leveraging concurrency, applications can achieve higher throughput and reduced latency.
